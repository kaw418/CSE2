//Katherine Wu
//October 14, 2015
//CSE 002 Fundamentals of Programming
//Twisty
/*This homework demonstrates the use of loops to validate input and create patterns in java. The first part of the program checks inputs to ensure that the lenth is a positive integer that does not
exceed 80 and that the width is a positive integer that also does not exceed 80 and does not exceed the length input. The second part of the progran uses this information to create the helix
pattern as described in the homework description. When the width input is odd,the # and \ symbols alternate in the front.*/
import java.util.Scanner;   //import scanner
public class Twisty{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in); //scanner is named scan
        int length = 0;                         //declare and initialize int length
        boolean acceptable = false;             //will be used to help validate the input (whether or not it contains integers)
        System.out.print("Input your desired length: ");  //prompt user
        while (!acceptable){                
            if(scan.hasNextInt()){
                acceptable = true;          //if the input has an integer, then the variable 'acceptable' will become true and the program will exit this loop
                length = scan.nextInt();    //set length equal to the input
            }
            else{
                System.out.println("Error: please type in an integer.");    //otherwise, it will ask the user for another integer and loop
                System.out.print("Input your desired length: ");
                scan.next();
            }
        }
        boolean range = false;              //will be used to help validate the input further (whether it is in the correct range)
        while(!range){
            if (length>0 && length<=80){
                range=true;                 //if the length input is within the correct range, the variable 'range' will be made true and will exit the loop
            }
            else{
                System.out.println("Please enter a positive integer less than 80.");        //otherwise it will prompt the user for a new input
                System.out.print("Input your desired length: ");
                    if(scan.hasNextInt()){                              //if the new input has an integer value, length will be set equal to the input and the range will be tested
                        length = scan.nextInt();    
                    }
                    else{                       //if the new input does not have an integer value, the same out of range length value that was stored before will loop through and prompt the user
                        scan.next();            //again for a new input
                    }
            }
        }
        boolean acceptable1 = false;            //essentially the same process here for the width variable
        int width = 0;                          //declare and initialize width
        System.out.print("Input your desired width: ");   //prompt the user for an input
        while (!acceptable1){
            if(scan.hasNextInt()){
                acceptable1 = true;             //if the input has an integer, 'acceptable1' becomes true and the loop is exited
                width = scan.nextInt();         //width is set equalto the input
            }
            else{
                System.out.println("Error: please type in an integer.");        //otherwise the user is prompted to input an integer and it loops
                System.out.print("Input your desired width: ");
                scan.next();
            }
        }
        boolean range1 = false;         //this variable helps validate the range of the width variable
        while(!range1){
            if(width>length){
                System.out.println("Error: please input an integer smaller than the length.");      //if the width is less than the length, it prompts the user for a new width
                System.out.print("Input your desired width: ");
                    if(scan.hasNextInt()){              //if the new width is an integer, width is set equal to this
                        width = scan.nextInt();
                    }
                    else{                               //otherwise, the program will use the old width value and loop again, asking for a new input
                        scan.next();
                    }
            }
            else if (width<=0 || width>80){                 //if the width is smaller than the length, but it is less than or equal to 0 or greater than 80...
                System.out.println("Please enter a positive integer less than 80");     //the user will be prompted to input a value within the range
                System.out.print("Input your desired width: ");
                    if(scan.hasNextInt()){      //if the new value is an integer, this input will be stored as width
                        width = scan.nextInt();
                    }
                    else{                       //if it is out of range and the new input is not an integer, it will loop again with the old width value that was out of range and prompt the user again
                        scan.next();
                    }
            }
            else{       //otherwise, the input is an integer within the desired range, and 'range1' will be set equal to true, and the loop will be exited
                range1 = true;
            }
        }
        //This next part helps to create the helix pattern
        int i = 1;          //this i value represents each row of the pattern
        int j=1;            //this j value represents each column of the pattern
        while (i <= width){     //this is the outer loop, it will loop after each row is completed, and then the i value will increase by 1 and start on the next row
            j=1;                //the j value is reset to 1 at the start of each loop of each row
            while(j <= length){     //this will loop until j = length, which will create the correct number of columns
            //each j value will be tested to meet 1 of these statements & after it has satisfied 1, j will increase by 1 and the loop will repeat until the row is completed
                if(j% (2* width) == i && j%(2*width)==(width+1)-i && j% ((width/2) +1)==0){     //this is to create the alternating between the # and \ in the front if the width value is odd
                    System.out.print("#");
                }
                else if(j%(2 * width) ==(2*width)-i+1 && j%(2*width)==(width+i) && j% width==(width/2)+1){  //this is also to create the alternating between the # and \ if width is odd
                    System.out.print("\\"); 
                }
                else if(j%(2*width)==i){        //this will create the diagonal down pattern of #'s
                    System.out.print("#");
                }
                else if(j%(2 * width) ==(2*width)-i+1){     //this will create the diagonal up pattern of #'s
                    System.out.print("#");
                }
                else if(j%(2*width) == 0 && i==1){          //this will add # to the position of the last # in the up # pattern
                    System.out.print("#");
                }                    
                else if(j%(2*width)==(width+1)-i){      //this will create the upward / pattern
                    System.out.print("/");
                }
                else if(j%(2*width)==(width+i)){        //this will create the diagonal down \ pattern
                    System.out.print("\\");
                }
                else if(j%(2*width)==0 && i==width){    //this will add \ to the position of the last \ in the down \ pattern
                    System.out.print("\\");
                }
                else{                               //if none of the above conditions are met, then a blank space is printed
                    System.out.print(" ");
                }
            j++;                    //j is increased by 1 and the inner loop repeats until j=length
            
            }
        System.out.println(""); //once j=length, a new line is begun
        i++;    //then i is incremented by 1, and a new row begins... the outer loop is looped... the inner loop loops until completion... then the outer loop loops again... etc.
        }
    }
}