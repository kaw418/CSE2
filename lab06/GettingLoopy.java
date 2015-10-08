/*Katherine Wu
October 2, 2015
CSE 002 - Fundamentals of Programming
Getting Loopy
This program will demonstrate the basics of loops in 3 different steps. The 1st step will print out a sequence of numbers up to 7 starting with a random digit
and then print out multiple 7's using a while loop. The 2nd step will use a while loop, a for loop, and a do while loop to print out prime numbers from 10 to
100. The third step will print out a random number of smiley faces from 5-200 and print 20 per line. This will also be done using loops.*/


public class GettingLoopy{
    public static void main(String[] args){
        int a = 1;      //starts at 1 
        System.out.println("Step 1:");
        while( a < 7){      //will print out if a is less than 7
            System.out.print(a);
            a++;        //adds 1 to a, loops around
        }   //will print out sequence of number up to 7
        while ( a < 15){
            System.out.print(7);
            a++;        //will continuously print out 7 until a =15
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Step 2: ");
        System.out.print("WHILE LOOP: ");   //use the while loop to print out prime numbers 10 - 100
        int number = 10;    //start at 10
        while (number <= 100){  //while 10 is less than or equal to 100, run the following statements
            int factor =2;  //start with factor = 2
            boolean prime = true;   //set prime = true
            while (factor <= number/2){ //while this is true...
                if (number % factor == 0){  //while this is true...
                    prime = false;  //prime is false, otherwise prime is true
                    break;  //if prime is false, break out of this loop... will go to the end and increase the number and start over
                }
                factor++; //if number % factor !=, increase the factor and loop again
            }
            if (prime) {    //if it goes through all factors <= number/2 and number% all the factors != 0, the prime = true
                System.out.print(number + " "); //if prime, print out number
            }
            number++;   //increase number and test again
        }
        System.out.println(""); //next line
        System.out.print("FOR LOOP: "); //now create the same output with a for loop
        for (number = 10; number <= 100; number++){ //initial condition; boolean condition; increment
            boolean prime = true; //while the boolean condition above is true, prime = true
            for (int factor = 2; factor <= number/2; factor++){ //initial condition; boolean condition; increment
                if(number%factor == 0){ //while factor <= number/2... if number%factor ==0, then prime = false
                    prime = false;
                    break;  //if prime is false, break from the loop... will increase number and start outer loop again
                }
            }
            if(prime){  //if it emerges from the inner loop still having prime = true... then none of the factors divided evenly
                System.out.print(number + " "); //the number is prime... print it
            }
        }
        System.out.println(""); //next time
        System.out.print("DO WHILE LOOP: ");  //now create the same output using a do while loop
        number = 10;    //start with number equal to 10
         do{
            boolean prime = true;   //assume that prime is initially true
            int factor=2;   //start with factor =2
            do{
                if(number%factor == 0){ //if the number is divisible by the factor...
                    prime = false;  //set prime equal to false...
                    break;  //will break from the inner loop and go to outer loop and just add one to number and repeat
                }
                factor++;   //if number%factor !=0, add 1 tofactor and repeat inner loop...
            }while(factor<=number/2);   //... as long as factor <=number/2
            if(prime){      //if prime never became false (all of the factors < number/2 were not actual multiplicative factors of the number)...
                System.out.print(number + " "); //... that means the number is prime so print it out
            }
            number++;       //add 1 to number and loop
        }while(number <=100);   //so long as number is less than or equal to 100
        System.out.println(" ");
        System.out.println("");
        System.out.println("Step 3: ");
        int random = (int) (Math.random()*201)+5;   //generates a random number from 5 to 200
        int count = 1;  //start count at 1
        while (count <= random){    //if count is less than or equal to the random number, follow through this loop
            if (count % 20 ==0){    //if 20 can be divided evenly out of count, print out the smiley face on a new line, this makes sure there's 20 per line
            System.out.println (":) ");
            }
            else{   //otherwise, if 20 can't be divided evenly out, continue printing smiley faces on the same line
                System.out.print(":) ");
            }
            count++;    //add 1 to count and loop
        }
        System.out.println(""); //this just formats the terminal better when the program is done, the command line is on the next line
            
    }
}