//Katherine Wu
//October 20, 2015
//CSE 002 - Fundamentals of Programming
//Homework 8 - StringAnalysis
/*In this homework, the process of using methods and loops to validate input and conclude an outcome is practiced. After prompting the user to
input a string followed by prompting the user to input the number of places he/she would like to analyze (or inputing 'all'), the program then
uses this information provided by the user to carry out the method charAnalysis. Furthermore, loops are utilized to ensure than the input by the
user is appropriate. If it is not, it will continuously ask until appropriate information is input. The method charAnalysis uses loops in order
to determine whether or not the specified number of places all have only letters in them. This is then the output of the program, letting the 
user know whether or not the String (for the specified number of digits was composed of only letters.*/
import java.util.Scanner;   //import Scanner
public class StringAnalysis{
    //the following is the method charAnalysis for a String as input
    public static boolean charAnalysis(String input){
        int length = input.length();    //quantifies the length of input
        int i = 0;                      //this will be the variable incremented in the loops
        while (i<length){               //while i is less than the length
            char ch = input.charAt(i);      //the variable ch will be the char character at the position in the String defined by i
            if(!Character.isLetter(ch)){    //if it comes across a char character that is not a letter while checking all the positions, break out of the loop
                break;
            }
            i++;                        //while in the loop, increment i each time
        }//ends loop
        if(i==length){          //if, at the end of the loop, i==length, then the loop was never broken from, and all of the positions had letters
            return true;        //thus, this method will return the boolean true
        }
        else{                   //if i doesn't equal length, then the loop was broken from at some point, so at least one position was not a letter
            return false;       //thus, this method will return the boolean value false
        }
    }//ends method
    //because of the concept of method override, this following method has the same name and does essentially the same thing, but accepts a String and an int
    public static boolean charAnalysis(String input, int number){ 
        int length = input.length();    //same as previous method
        int i = 0;                      //same as previous method
        while(i<number && i<length){    //modifying the previous method, we must also chech that i is less than the int value given by the user... it will stop the loop if i becomes greater than either length or number
            char ch = input.charAt(i);      //the rest of the loop is identical to the previous method
            if(!Character.isLetter(ch)){
                break;
            }
            i++;
        }//ends loop
        if(i>=number || i==length){     //same as previous, but now if i>=number, it will also return true
            return true;                //this is because that means that the number of positions the user wanted to check are all letters, and if more than that were letters, the user's specified amount is still true
        }
        else{                           //if none of the conditions above are met, that means that not all of the positions checked were letters
            return false;
        }
    }//ends method
    //this is the start of the main method
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);     //declare Scanner
        System.out.print("Enter a string to be evaluated: ");
        String userInput = scan.next();
        System.out.println("If you would like to evaluate the entire string, input 'all'.");
        System.out.print("Otherwise, input the number of characters you would like to evaluate: ");
        boolean acceptable = false;
        while(!acceptable){ 
            if (scan.hasNextInt()){
                int numOfChar = scan.nextInt(); //if the input is an integer, assign it to the variable numOfChar
                if(numOfChar>0){                //if it is greater than 0, execute the method charAnalysis on the 2 variables
                    if(charAnalysis(userInput,numOfChar)){      //if the method outputs true, it means that the specified number of positions are all letters, so print that
                        System.out.println("These are letters.");
                    }
                    else{                                       //otherwise, that means the method ouput false, so the specified number of positions are not all letters
                        System.out.println("These are not all letters.");
                    }
                acceptable = true;      //set acceptable equal to true to exit the loop
                }
                else{
                    System.out.println("Please input a positive integer, or input 'all'."); //if numOfChar<0, loop again, prompting for correct input
                }
            }
            else if(scan.hasNext("all")){   //if the user doesn't input an integer, but rather inputs "all", execute the method charAnalysis on userInput
                if(charAnalysis(userInput)){    //if the method outputs true, it means that they are all letters
                    System.out.println("These are all letters.");
                }
                else{                           //otherwise, the method output false, so they are not all letters
                    System.out.println("These are not all letters.");
                }
                acceptable = true;      //set acceptable equal to true and exit the loop
            }
            else{           //otherwise, it means that an integer or the word "all" was not input
                System.out.println("Please input a positive integer, or input 'all'."); //prompt the user to type in the accpetable inputs
                scan.next();            //accept the new value and loop... the loop will only be broken once an appropriate input is typed in
            }
        }//ends loop
    }//ends main method
    
}//ends class