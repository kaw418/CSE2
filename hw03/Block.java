//Katherine Wu
//September 15, 2015
//CSE 002 - Fundamentals of Programming
//Block Program

import java.util.Scanner;   //import Scanner
public class Block{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //creates a new Scanner
        //Prompt user for input
        System.out.print("Enter the length of the block: ");
        double length = input.nextDouble();
        System.out.print("Enter the width of the block: ");
        double width = input.nextDouble();
        System.out.print("Enter the height of the block: ");
        double height = input.nextDouble();
        //Compute the volume
        double volume = ((length) * (width) * (height));
        //Compute the surface area
        double surfaceArea = (2 * length * width) + (2 * length * height) + (2 * width * height);
        //Display results
        System.out.println("The volume of the blook of dimensions " + (length) +
        " x " + (width) + " x " + (height) + " is " + (volume) + ".");
        System.out.println("The surface area of the block is " + (surfaceArea) + ".");
    }
}