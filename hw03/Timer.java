//Katherine Wu
//September 15, 2015
//CSE 002 - Fundamentals of Programming
//Timer Program
import java.util.Scanner;   //import Scanner
public class Timer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //creates a new Scanner
        //Prompt user for input
        System.out.print("Enter the current time: ");
        int time1 = input.nextInt();
        System.out.print("Enter the time that you will be eating dinner: ");
        int time2 = input.nextInt();
        //compute the time difference
        int time1a = (int) (time1 / 100);   //Separates the hrs from minutes
        int time2a = (int) (time2 / 100);   //Separates the hrs from minutes
        int time1b = (time1a * 60);         //Converts hrs to minutes
        int time2b = (time2a * 60);         //Converts hrs to minutes
        int mins1 = (int) (time1 % 100);    //Separates minutes from hrs w/ remainder op
        int mins2 = (int) (time2 % 100);    //Separates minutes from hrs w/ remainder op
        int totalTime1 = (time1b + mins1);  //Shows time1 in minutes
        int totalTime2 = (time2b + mins2);  //Shows time2 in minutes
        int timeDiff = totalTime2 - totalTime1; //Finds the difference in minutes
        int hours = (int) (timeDiff / 60);  //Gives the hour difference, ignores the minutes
        int mins = (int) (timeDiff % 60);   //Gives the minutes difference w/ remainder op
        System.out.println("You have " + hours + " hours and " + mins + " minutes until dinner.");
            //Above prints out the time difference
    }
}