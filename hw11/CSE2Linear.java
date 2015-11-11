//Katherine Wu
//November 7, 2015
//CSE002 - Fundamentals of Programming
//Fun with searching - CSE2Linear.java
import java.util.Scanner;   //import scanner
public class CSE2Linear{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);  //declare new scanner scan
        System.out.println("Enter 15 ints for final grades in CSE2: "); //prompt the user to enter 15 ints
        int[] array = new int[15];          //create a new array, called array, that allocates memory for 15 ints
        for(int i = 0; i<array.length ; i++){       //for all the slots in the array
            boolean acceptable = false;
            while(!acceptable){         //continuously loop until the input value that is provided by the user is an int
                if(scan.hasNextInt()){
                    array[i] = scan.nextInt();
                    acceptable = true;
                }
                else{                   //if the user does not enter an int, prompt the user again, and repeat
                    System.out.println("Please enter an int value: ");
                    scan.next();
                }
            }
            boolean range = false;
            while(!range){          //continuously loop until the input value that is provided by the user is also in the range from 0 to 100
                if(array[i]>=0 && array[i]<=100){
                    range = true;
                }
                else{               //if it is not in the range, prompt the user again and repeat
                    System.out.println("Please enter an int from 0 - 100: ");   //if user enters an int, set it equal to array[i] and check range again
                        if(scan.hasNextInt()){
                            array[i] = scan.nextInt();
                        }
                        else{       //if user doesn't enter an int, just loop again and re-ask
                            scan.next();
                        }
                }
            }
            boolean increasing = false;
            while(!increasing){             //continously loop until the input value that is provided by the user is greater than or equal to the previous input
                if(i>=1 && array[i]>=array[i-1]){
                    increasing = true;
                }
                else if(i<1){       //if i<1, then there is no previous input to compare to, so break
                    break;
                }
                else{           //if it is not provided, prompt the user again
                    System.out.println("Please enter an int from 0 - 100 that is greater than or equal to the previous int: ");
                    if(scan.hasNextInt()){      //if the user enters an int, set it equal to array[i] and check again
                        array[i]=scan.nextInt();
                    }
                    else{           //otherwise, just loop again and reask
                        scan.next();
                    }
                }
            }
        
        }
        /*the instructions of the lab differed from the sample output provided and the hint given... while the instrucions solely ask for linear searches, the 
        hint said to create a separate method for binary search... also the instructions said to continuously ask the user for new ints so that each new int
        was greater than or equal to the previous int... in which case, the inputted values should already be sorted. Therefore, I wasn't entirely certain
        how exactly this program was to be formatted. Regardless, the program starts by asking for the ints in order, then prints them out in order. Then,
        because the list is already ordered, it uses binary search to find the first grade. Then, the array is scrambled, and linear search is used to find
        the second grade.*/
        System.out.println("Sorted");
        printArray(array);  //method prints out the array
        System.out.println("Binary search: ");
        System.out.println("Please enter a grade to search for: ");
        int grade1 = scan.nextInt();
        binary(array, grade1);  //method uses binary search to find the grade
        System.out.println("Scrambled:");
        scramble(array);        //method scrambles array
        printArray(array);      //method prints array
        System.out.println("Linear search: ");
        System.out.println("Please enter a grade to search for: ");
        int grade2 = scan.nextInt();
        linear(array, grade2);      //method uses linear search to find the grade
    }
    public static void printArray(int[] numbers){       //void method prints arrays
        int size = numbers.length;
        for(int i =0; i<size; i++){     //goes through the array, and for each value, prints it
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");     //skips to a new line when done
    }
    public static void linear(int[] numbers, int value){        //void method simply prints out whether or not a grade was found - linear search
        int size = numbers.length;  //to iterate over the size fo the array
        int i =0;
        for(i = 0; i<size; i++){    //loop for each i until the value is found (if found)
            if(value == numbers[i]){    //if i is found
                System.out.println(value + " was found on the list with " + (i + 1) + " iterations.");
                break;
            }
            if(i==numbers.length-1 && value!=numbers[i]){   //when all the i's are looped through, if value is still not found, print:
                System.out.println(value + " was not found on the list with " + (i +1) + " iterations.");
            }
        }
    }
    public static int[] scramble(int[] numbers){    //method to scramble the numbers
        for(int counter =0; counter<25; counter++){         //picked an arbitrary number greater than 15 to ensure that the grades were well scrambled
            int a =(int)(Math.random()*numbers.length);   //pick a random number from 0 -15
            int replace = numbers[a];                  //make the variable replace equal to the value at that index
            numbers[a] = numbers[0];                        //make the value at the index equal to the value at the index 0
            numbers[0] = replace;                   //make the new value at the index 0 equal to the variable replace  
        }
        return numbers;                             //return the array numbers
    }
    public static void binary(int[] numbers, int value){    //void method prints out whether the value is found - binary search
        int start = 0;                                      //make the start value the index 0
        int end = numbers.length - 1;                       //make the end value the last index
        int middle = 0;                                     //initialize and declare middle variable
        int i = 0;                                          //will represent the index
        while(start<=end){                                  //while start is less than or equal to end
            middle = (int) ((start+end)/2);                 //make the middle halfway between the start and end
            if(numbers[middle]==value){                     //if the number at the middle index is equal to the value...
                System.out.println(value + " was found on the list with "+ i + " iterations.");
                break;      //break!
            }
            else if(numbers[middle]>value){     //but if the number at the middle index is greater than the value you're searching for
                end = middle - 1;               //make the end index 1 less than the middle index and check again
            }
            else if(numbers[middle]<value){     //but if the number at the middle index is less than the value you're searching for
                start = middle + 1;             //make the start index one more than the middle index and check again
            }
            i++;        //iterate the i
        }
        if(numbers[middle]!=value){             //if, at the end of the loop, the number at the middle index is not equal to the value you're looking for....
            System.out.println(value + " was not found on the list with " +i + " iterations." );    //print out that it was not found
        }
    }
}
 