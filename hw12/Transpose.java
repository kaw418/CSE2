//Katherine Wu
//November 14, 2015
//CSE 002 -Fundamentals of Programming
//Transpose
import java.util.Scanner;       //import Scanner;
public class Transpose{     //public class
    public static int[][] randomMatrix(int height, int width){      //method randomMatrix takes 2 integers and returns a 2d array
        int[][] matrix = new int [height][width];   
        for(int i = 0; i<matrix.length; i++){               //made up of member arrays, array[i]
            for(int j = 0; j<matrix[i].length; j++){
                int a = (int) (Math.random()*21)-10;        //fill the elements of the member arrays with random ints from -10 to 10
                matrix[i][j] = a;   
            }
        }
        return matrix;                                      //return the 2d array called matrix
    }
    public static void printMatrix(int[][] array){          //void method to print out a matrix
        for(int i=0; i<array.length; i++){                  //check each member array
            if(i !=0 && array[i].length != array[i- 1].length){     //make sure that the length of each member array is equal to the member array before it
                System.out.println("Warning: This is not rectangular");     //if not, print out the warning
            }
        }
       for(int i = 0; i<array.length; i++){         //for each member array
           for(int j =0; j<array[i].length; j++){   //for each element in the member array
               if(array[i][j]<0){                   //the following 'if' statements specify how many spaces to put in between the elements to guarantee proper spacing
                   if(array[i][j] == -10){  
                       System.out.print(" " + array[i][j]);     //if the element = -10, only put 1 space before the number
                   }
                   else{                                        //if the element is negative, but not -10, but 2 spaces before the number
                       System.out.print("  " + array[i][j]);
                   }
               }
               else if(array[i][j] == 10){          //if the element = 10, put 2 spaces before the number
                   System.out.print("  " + array[i][j]);
               }
               else{                                //if the element is positive and not 10, print out 3 spaces before the number
               System.out.print("   " + array[i][j]);
               }
           }
           System.out.println("");      //skip to the next line after all elements of a member array are printed
       }
    }
    public static int[][] transposeMatrix(int[][] array){       //this method accepts a 2d array and prints out a transposed 2d array
        int [] [] transpose = new int [array[0].length][array.length];      //declare and allocate a new array called transpose
        for(int i=0; i<array[0].length; i++){               //i will iterate over the elements of each member array
            for(int j = 0; j<array.length; j++){            //j will iterate over the member arrays of the array
                transpose[i][j] = array[j][i];              //the [i][j] element of the array tranpose will be the [j][i] element of the matrix array
            }
        }
        return transpose;           //return this new array
    }
    public static void main(String[] args){         //the main method
        Scanner scan = new Scanner (System.in);     //declare Scanner
        int rows = 0;           //declare and initialize rows
        int columns = 0;        //declare and initialize columns
        System.out.println("Please enter a height: ");  //prompt user for a height
        boolean integer = false;
        while(!integer){        //check to make sure the input is an integer
            if(scan.hasNextInt()){
                integer = true;     //if it is, break the loop
                rows = scan.nextInt();  //and set rows equal to the integer input
                boolean positive = false;
                while(!positive){       //check to make sure the input is positive
                    if(rows>0){
                        positive = true;        //if it is, break the loop
                    }
                    else{           //if it's not, ask for a positive integer
                        System.out.println("Please enter a postive integer: ");
                        if(scan.hasNextInt()){      //if the new input has an int, set rows equal to the input
                            rows = scan.nextInt();
                        }
                        else{           //otherwise, loop and prompt again
                            scan.next();
                        }
                    }
                }
                
            }
            else{   //if not int is input
                System.out.println("Please enter an integer: ");
                scan.next();    //loop again
            }
        }
        System.out.println("Please enter a width: ");   //same format for width as there was for height
        integer = false;
        while(!integer){
            if(scan.hasNextInt()){
                integer = true;
                columns = scan.nextInt();
                boolean positive = false;
                while(!positive){
                    if(columns>0){
                        positive = true;
                    }
                    else{
                        System.out.println("Please enter a postive integer: ");
                        if(scan.hasNextInt()){
                            columns = scan.nextInt();
                        }
                        else{
                            scan.next();
                        }
                    }
                }
                
            }
            else{
                System.out.println("Please enter an integer: ");
                scan.next();
            }
        }
        System.out.println("This is the matrix:");
        int [][] A = randomMatrix(rows, columns);       //create a matrix with rows and columns as the in inputs for the method randomMatrix
        printMatrix(A);         //print out the matrix created by the method randomMatrix using the printMatrix method
        System.out.println("This is the transposed matrix: ");  
        int [][] B = transposeMatrix(A);                //create an array called B by using the array A as input for the method transposeMatrix 
        printMatrix(B);     //print out the array B, which is the transpose of the array A, using the printMatrix method
    }
    
}