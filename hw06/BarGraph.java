//Katherine Wu
//October 6, 2015
//CSE 002 - Fundamentals of Programming
/*Bar Graph Homework: Prompt user to input expenditures for a week. Only accept positive number values. Then, construct a bar graph
composed to asterisks to represent each dollar spent (properly rounded). Finally, average the amount spent in the week and using
the assumption that expenditures in the following 207 weeks (the rest of 4 years) will only fluctuate from -20% to 20% of the 
expenditures in the current week, calculated the estimated expenditures for the rest of the 4 years. Utilize loops in order to complete
this program.*/

import java.util.Scanner;   //imports new Scanner
public class BarGraph{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Expenses for Monday: $"); //prompts user for input
        double monday=0;                            //declare and initiate variable
        while (!input.hasNextDouble()){             //while input is not a number, continue to ask until receive a number
            System.out.print("Sorry, you did not enter a number. Try again: $");
            input.next();
        }
        if (input.hasNextDouble()){                 //if input is a number
            monday = input.nextDouble();
            while (monday < 0){                     //while input is negative, continue to ask until receive a positive number
                System.out.print("Please only enter positive numbers. Try again: $");
                monday = input.nextDouble();
            }
        }
    
        System.out.print("Expenses for Tuesday: $");    //prompts user for input
        double tuesday=0;                               //declare and initiate variable
        while (!input.hasNextDouble()){                 //while input is not a number, continue to ask until receive a number
            System.out.print("Sorry, you did not enter a number. Try again: $");
            input.next();
        }
        if (input.hasNextDouble()){                     //if input is a number
            tuesday = input.nextDouble();
            while (tuesday < 0){                        //while input is negative, continue to ask until receive a positive number
                 System.out.print("Please only enter positive numbers. Try again: $");
                tuesday = input.nextDouble();
            }
        }
        System.out.print("Expenses for Wednesday: $");  //prompt user for input
        double wednesday=0;                             //declare and initiate variable
        while (!input.hasNextDouble()){                 //while input is not a number, continue to ask until receive a number
           System.out.print("Sorry, you did not enter a number. Try again: $");
            input.next();
        }
        if (input.hasNextDouble()){                     //if input is a number
            wednesday = input.nextDouble();         
            while (wednesday < 0){                      //while input is negative, continue to ask until receive a positive number
                 System.out.print("Please only enter positive numbers. Try again: $");
                wednesday = input.nextDouble();
            }
        }
        System.out.print("Expenses for Thursday: $");   //prompt user for input
        double thursday=0;                              //declare and initiate variable
        while (!input.hasNextDouble()){                 //while input is not a number, continue to ask until receive a number
            System.out.print("Sorry, you did not enter a number. Try again: $");
            input.next();
        }
        if (input.hasNextDouble()){                     //if input is a number   
            thursday = input.nextDouble();
            while (thursday < 0){                       //while input is negative, continue to ask until receive a positive number
                 System.out.print("Please only enter positive numbers. Try again: $");
                thursday = input.nextDouble();
            }
        }
        System.out.print("Expenses for Friday: $");     //prompt user for input
        double friday=0;                                //declare and initiate variable
        while (!input.hasNextDouble()){                 //while input is not a number, continue to ask until receive number
            System.out.print("Sorry, you did not enter a number. Try again: $");
            input.next();
        }
        if (input.hasNextDouble()){                     //if input is a number
            friday = input.nextDouble();
            while (friday < 0){                         //while input is negative, continue to ask until receive a positive number
                 System.out.print("Please only enter positive numbers. Try again: $");
                friday = input.nextDouble();
            }
        }
        System.out.print("Expenses for Saturday: $");   //prompt user for input
        double saturday=0;                              //declare and initiate variable
        while (!input.hasNextDouble()){                 //while input is not a number, continue to ask until receieve number
            System.out.print("Sorry, you did not enter a number. Try again: $");
            input.next();
        }
        if (input.hasNextDouble()){                     //if input is a number
            saturday = input.nextDouble();
            while (saturday < 0){                       //while input is negative, continue to ask until receieve a positive number
                System.out.print("Please only enter positive numbers. Try again: $");
                saturday = input.nextDouble();
            }
        }
        System.out.print("Expenses for Sunday: $");     //prompt user for input
        double sunday=0;                                //declare and initiate a variable
        while (!input.hasNextDouble()){                 //while input is not a number, continue to ask until receive a number
            System.out.print("Sorry, you did not enter a number. Try again: $");
            input.next();
        }
        if (input.hasNextDouble()){                     //if input is a number
            sunday = input.nextDouble();
            while (sunday < 0){                         //while input is negative, continue to ask until receieve positive number
                 System.out.print("Please only enter positive numbers. Try again: $");
                sunday = input.nextDouble();
            }
        }
        System.out.println("");     //provides a spacing prior to the bar graph of asterisks
        
        /*In this following section, variables (mon, tues, wed...) were declared in order to use them in the following while loops.
        These were separately declared because the while loops will continue to subtract 1 from their values in order to properly round the number of asterisks.
        It was necessary to create these new variables so that the values of the original variables (monday, tuesday, wednesday...) could be maintained.
        These values (monday, tuesday, wednesday,...) will be necessary in the later section to find the average spent in the week.*/
        
        double mon = monday;
        double tues = tuesday;
        double wed = wednesday;
        double thurs = thursday;
        double fri = friday;
        double sat = saturday;
        double sun = sunday;
        
        System.out.print("Mon: ");  //prints out the title in the bar graph
        while (mon>=.50){           //continues to add an '*' to the graph and -1 from the value of mon until the value becomes <.5, properly rounds 
            System.out.print("*");
            mon--;
        }
        System.out.println("");     //prints space
        System.out.print("Tues: "); //prints out the title in the bar graph
        while (tues>=.50){          //continues to add an '*' to the graph and -1 from the value of tues until the value becomes <.5, properly rounds
            System.out.print("*");
            tues--;
        }
        System.out.println("");     //prints space
        System.out.print("Wed: ");  //prints out the title in the bar graph
        while (wed>=.50){           //continues to add an '*' to the graph and -1 from the value of wed until the value becomes <.5, properly rounds
            System.out.print("*");
            wed--;
        }
        System.out.println("");     //prints space
        System.out.print("Thu: ");  //prints out the title in the bar graph
        while (thurs>=.50){         //continues to add an '*' to the graph and -1 from the value of thurs until the value becomes <.5, properly rounds
            System.out.print("*");
            thurs--;
        }
        System.out.println("");     //prints space
        System.out.print("Fri: ");  //prints out the title in the bar graph
        while (fri>=.50){           //continues to add an '*' to the graph and -1 from the value of fri until the value becomes <.5, properly rounds
            System.out.print("*");
            fri--;
        }
        System.out.println("");     //prints space
        System.out.print("Sat: ");  //prints out the title in the bar graph
        while (sat>=.50){           //continues to add an '*' to the graph and -1 from the value of sat until the value becomes <.5, properly rounds
            System.out.print("*");
            sat--;
        }
        System.out.println("");     //prints space
        System.out.print("Sun: ");   //prints out the title in the bar graph
        while (sun>=.50){           //continues to add an '*' to the graph and -1 from the value of sun until the value becomes <.5, properly rounds
            System.out.print("*");
            sun--;
        }
        
        System.out.println("");     //prints out separation from bar graph and the subsequent statements
        System.out.println("");
        
        //averaging the amount spent in the week, sums the total, divides by the number of days and makes the number a double
        double average = (monday + tuesday + wednesday + thursday + friday + saturday + sunday) / 7.00;
        //properly formatted statement for average expenses... at least 3 digits in total with 2 after the decimal
        System.out.printf("Your average weekly expenses are: $ %3.2f\n", average);
        
        int counter = 0;    //will continue to add 1 to this each time through the loop
        int random = 0;     //declare and initiate a variable, will use this to create random numbers
        double percent = 0; //declare and initiate a variable
        double sum = average;   //make the sum of the total spent over 4 years begin with this average from this week
        while(counter<207){     //the counter goes to 207 because there are 208 weeks in 4 years... and the sum of 4 years begins with this week we've already calculated
            random = (int)(Math.random()*41)-20;    //the random number can range from -20 to 20 (because the percent change is from -20% to 20%)
            percent = (random/100.00);              //this random number is converted to a percent and implicitly casted to a double
            sum+= ((percent * (7 *average)) + (7* average));    //the sum will continue to increase by the average multiplied by a random percent ftom -20 to 20
            counter++;                              // 1 will continue to be added to the counter and the loop will stop once the counter = 207... it will loop 207 times
        }
        //prints a properly formated statement for the estimated expenditure... at lease 4 digits with 2 digits after the decimal place
        System.out.printf("Estimated expenditure for 4 years: $ %4.2f\n", sum);
    }
}