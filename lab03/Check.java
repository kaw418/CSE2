//Katherine Wu
//September 15, 2015
//CSE 002 - Fundamentals of Programming
//Check lab

import java.util.Scanner;   //imports scanner
//This program will:
    //Obtain from the user:
        //cost of check
        //percent of tip
        //number of ways to split the check
    //Determine how much each person needs to spend to pay the check
public class Check{
    //main method required for every java program
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        //Declare an instance of the Scanner object
        System.out.print("Enter the original cost of the check in form xx.xx: ");
        double checkCost = myScanner.nextDouble();
        //this means that the Scanner willa accept a double
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx) : ");
        double tipPercent = myScanner.nextDouble();
        tipPercent /=100; //We want to convert the percentage into a decimal value
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        double totalCost;
        double costPerPerson;
        int dollars,    //whole dollar amount of cost
            dimes, pennies; //for storing digits
                //to the right of the decimal point
                //for the cost$
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        //get the whole amount, dropping the decimal fraction
        dollars=(int) costPerPerson;
        //get dimes amount, e.g.,
        //(int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //where the % (mod) operator returns the remainder
        //after the division: 583%100 -> 83, 27%5 -> 2
        dimes = (int) (costPerPerson * 10) % 10;
        pennies = (int) (costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $" +
        dollars + '.' + dimes + pennies);
        
        
    }   //end of main method
}   //end of class