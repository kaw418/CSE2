//Katherine Wu
//October 6, 2015
//CSE 002 -Fundamentals of Programming
//Check Digit Lab
/*This program will accept inputs of 10 digit numbers composed of the numerical values 0-9 and X (10). It will then evaluate the sum of the numbers using an ISBN converter. It will
multiply the first digit (from L to R) by 10 and then add that to the next digit multiplied by 9. This will be added to the subsequent digit multiplied by 8, and so on. This will
happen until the second to last digit. Then, this sum will be % by 11. If the remainder matches the last digit of the number, then the barcode is a valid ISBN. If it does not,
the program will say that the ISBN is invalid and will tell you what the last digit, the "check digit," should be.*/

import java.util.Scanner; //import a Scanner
public class CheckDigit{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter a 10 digit barcode: ");  //prompt user for input
        String isbn=input.next();                               //make the input a string, necessary because we're accepting "X"
        boolean correctLength = false;                          //to check to see if the input is 10 digits long
        if(isbn.length() == 10){                                
            correctLength = true;
        }
        while(isbn.length() != 10){                             //while the input is not 10 digits long, repeatedly prompt the user to input a new barcode
            System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
            isbn = " ";
            isbn = input.next();
            if(isbn.length() == 10){
                correctLength = true;
            }
        }
        boolean wrongDigits = false;                //automatically assuming that only 1-9 and X were inputted... if they weren't the default switch statement will catch it
        if (correctLength){                         //if the input is the correct length, this will occur
            int place = 0;                          // declare place, used to number the places of the digits
            int c =0;
            while(place<=isbn.length()-1){      //since place starts at zero, to account for all the places, it must stop once it hits the length of the input -1     
                char ch = isbn.charAt(place);   //used to determine which char is at a certain place... because we made the input a string
                int a =0;                       //a will be the number value associated with the char in a certain place (1 = 1, 2 = 2, ... X =10)
                int b =0;                       //b will be the number we multiply that certain place by (we multiply the first place by 10, the second by 9,...)
                switch(ch){                     //so, when place=0, ch will be equal to the char at that place in the digit, a will then be assigned a value based on the char
                    case '0':
                        a = 0;
                        break;
                    case '1':
                        a = 1;
                        break;
                    case '2':
                        a = 2;
                        break;
                    case '3':
                        a = 3;
                        break;
                    case '4':
                        a = 4;
                        break;
                    case '5':
                        a = 5;
                        break;
                    case '6':
                        a = 6;
                        break;
                    case '7':
                        a = 7;
                        break;
                    case '8':
                        a = 8;
                        break;
                    case '9':
                        a= 9;
                        break;
                    case 'X':
                        a=10;
                        break;
                    default:                            //if the char in a certain place does not match 0-9 or X, then wrong digits were inputted
                        wrongDigits = true;
                }
                switch(place){                      //now from when place=0 to place=9, it will assign to each place value the number we multiply it by
                    case 0:                         //place 0 in the case stands for the very first digit place on the left, so we multiply that by 10
                        b = 10;
                        break;
                    case 1:
                        b= 9;
                        break;
                    case 2:
                        b=8;
                        break;
                    case 3:
                        b=7;
                        break;
                    case 4:
                        b=6;
                        break;
                    case 5:
                        b=5;
                        break;
                    case 6:
                        b=4;
                        break;
                    case 7:
                        b=3;
                        break;
                    case 8:
                        b=2;
                        break;
                    case 9:                 //this is the check digit, we don't multiply it by anything
                        break;
                }
                place++;                    //while in the loop, continuously add one more to place, until place equals 9
                if(wrongDigits){            //if wrong digits was hit in the default statement above, this will print out and the program will end :(
                    System.out.println("This is not a valid ISBN. You did not enter the correct digits.");
                    break;
                }
                if(!wrongDigits){       //if wrong digits wasn't hit, c will be the sum of all the values in their places multiplied by the correct multiplier
                    c+=a*b;
                }
            }
            /*in the final if statments to determine what prints out (whether or not the ISBN is valid, what the check digit should be), I compare the check digit in the input
            to the check digit that should actually be there. However, since the input was in char, and the check digits that are being calculated in the program turn out to be
            ints, I needed to convert the check digit from the input from a char to an int. To do so, an if and switch statement was used.*/
            int place1 = 9;         //this is the final place of the digit, the check digit         
            int d = 0;              //this will be the int value of the inputted check digit
                if(place1==9 && !wrongDigits){  //will only run while the place we are looking at is the 9th digit, the check digit
                char chr = isbn.charAt(place1); //chr is the char value in the 9th place
                switch(chr){                //while the place is at 9, the switch statement will determine which char value is there and what its corresponding int value is
                    case '0':
                        d = 0;
                        break;
                    case '1':
                        d = 1;
                        break;
                    case '2':
                        d = 2;
                        break;
                    case '3':
                        d = 3;
                        break;
                    case '4':
                        d = 4;
                        break;
                    case '5':
                        d = 5;
                        break;
                    case '6':
                        d = 6;
                        break;
                    case '7':
                        d = 7;
                        break;
                    case '8':
                        d = 8;
                        break;
                    case '9':
                        d= 9;
                        break;
                    case 'X':
                        d=10;
                        break;
                }
            }
            //The following are the comparisons between the inputted check digit and the actual check digit calculated throughout the program. This is why (int) d was found.
            if(d == 11- (c % 11) && !wrongDigits){          //if d is equal to the check digit
                System.out.println("This is a valid ISBN.");
            }
            else if (d != 11 - (c % 11) && !wrongDigits){       //if d doesn't equal the check digit
                if (11 - (c%11) == 10){                         //if d doesn't equal the check digit and the check digit is equal to 10, then X must be printed instead of 10
                    System.out.println("This is NOT a valid ISBN. The check digit should be X.");
                }
                else{                                           //if d doesn't equal the check digit, then the check digit is printed
                    System.out.println("This is NOT a valid ISBN. The check digit should be " + (11 - (c%11)) + ".");
                }
            }
            
            
        }
        
        
        
    }
}