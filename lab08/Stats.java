//Katherine Wu
//October 16, 2015
//CSE 002 -Fundamentals of Programming
//Lab 08 - Stats
import java.util.Scanner;   //import scanner
public class Stats{
    //this first method called 'mean' will accept 5 doubles as inputs and output a double
    //the double that it outputs will be the average of the 5 doubles
    public static double mean(double num1, double num2, double num3, double num4, double num5){
        return (num1 + num2 + num3 + num4 + num5)/5;
    }   //end of mean method
    //this second method called 'median' will accept 5 doubles as inputs also and output a double
    //the double that it outputs will be the number in the middle (based on increasing order of the doubles)
    public static double median(double num1, double num2, double num3, double num4, double num5){
        return num3;
    }   //end of median method
    //this third method is a void method that does not return any output, however it takes 2 doubles as input
    //it prints out the first double as the mean and the second double as the median
    public static void print(double mean, double median){
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
    }   //end of print method
    //this is the start of the main method
    public static void main(String[] args){
        Scanner myscanner = new Scanner(System.in); //declare Scanner as myscanner
        System.out.println("Please input 5 doubles in increasing order: "); //prompt the user to input 5 doubles
        double a = myscanner.nextDouble();  //the first input is assigned to 'a'
        double b = myscanner.nextDouble();  //the second input is assigned to 'b'
        double c = myscanner.nextDouble();  //the third input is assigned to 'c'
        double d = myscanner.nextDouble();  //the fourth input is assigned to 'd'
        double e = myscanner.nextDouble();  //the fifth input is assigned to 'e'
        //this while loop will continuously loop if any of the boolean conditions are true
        //the boolean conditions all check to make sure that the order of increasing doubles in the input goes from a->b->c->d->e
        //the boolean conditions show all the possibilities of this not being the case
        while (a>b||a>c||a>d||a>e||b>c||b>d||b>e||c>d||c>e||d>e){
            System.out.println("Please input the 5 doubles in increasing order, try again: ");  //will prompt the user to input the 5 doubles again
            a = myscanner.nextDouble();
            b = myscanner.nextDouble();
            c = myscanner.nextDouble();
            d = myscanner.nextDouble();
            e = myscanner.nextDouble();
        }   //end of while loop
        
        double meanOfNums = mean(a,b,c,d,e);    //calculates the mean by using the method 'mean'
        double medianOfNums = median(a,b,c,d,e);    //calculates the median by using the method 'median'
        print(meanOfNums, medianOfNums);            //prints out the median and mean by using the method 'print'
    }   //end of main method
}   //end of class