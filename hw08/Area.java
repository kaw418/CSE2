//Katherine Wu
//October 20, 2015
//CSE 002 - Fundamentals of Programming
//Homework 8 - Area
//In this homework, methods will be used to determine the areas of various shapes (rectangle, triangle, circle)
import java.util.Scanner;   //import Scanner
public class Area{
    //this is the first method, to calculate the area of a rectangle
    public static double rectangle(double height, double base){
        return (height*base);
    }
    //this is the second method, to calculate the area of a triangle
    public static double triangle(double height, double base){
        return (height*base)/2.0;
    }
    //this is the third method, to calculate the area of a circle
    public static double circle(double radius){
        return (Math.PI*Math.pow(radius,2.0)/2.0);
    }
    //this is the fourth method, it will validate the inputs for height, base, and radius depending on the shape whose area will be evaluated
    //it will also draw from the earlier 3 methods that calculate the areas
    public static double input(String shape){       //it accepts strings, which will either be 'rectangle,' 'triangle,' or 'circle'
        Scanner myscanner = new Scanner (System.in);    //declare the new scanner
        double area = 0.0;                              
        if(shape.equals("rectangle")||shape.equals("triangle")){    //since both rectangle and triangle need a height and base measurement, grouped them together
            double height = 0, base = 0;
            System.out.println("Please enter a height: ");
            boolean acceptable = false;
            while(!acceptable){
                if(myscanner.hasNextDouble()){
                    height = myscanner.nextDouble();
                    acceptable = true;                      //boolean variable will only be turned to true and allow to exit the loop if the input is a double
                }
                else if(!myscanner.hasNextDouble()){            //otherwise it will keep looping until a double is inputted
                    System.out.println("Please enter a double: ");
                    myscanner.next();
                }
            }
            System.out.println("Please enter a base: ");    //the same procedure as height occurs for base
            acceptable = false;
            while(!acceptable){
                if(myscanner.hasNextDouble()){
                    base = myscanner.nextDouble();
                    acceptable = true;
                }
                else if(!myscanner.hasNextDouble()){
                    System.out.println("Please enter a double: ");
                    myscanner.next();
                }
            }
            if(shape.equals("rectangle")){          //now, a nested if statement to distinguish the rectangle from triangle case
                area = rectangle(height,base);      //set area equal to the method rectangle applied on the height and base found
                return area;                        
            }
            else if(shape.equals("triangle")){      //now, a nested if statement to distinguish the triangle from the rectangle case
                area = triangle(height,base);       //set area equal to the method triangle applied on the height and base found
                return area;
            }
        }
        else if(shape.equals("circle")){            //in the case of a circle
            double radius = 0;
            System.out.println("Please enter a radius: ");
            boolean acceptable = false;             //this is the same procedure that occurred for height and base in the rectangle/triangle case
            while(!acceptable){
                if(myscanner.hasNextDouble()){
                    radius = myscanner.nextDouble();
                    acceptable = true;
                }
                else if(!myscanner.hasNextDouble()){
                    System.out.println("Please enter a double: ");
                    myscanner.next();
                }
            }
            area = circle(radius);      //set area equal to the method circle applied on the radius found
            return area;
        }
    
        return area;   
    }

    public static void main(String[] args){         //this is the main method   
        Scanner scan = new Scanner (System.in);     //declare a new scanner for this method
        System.out.print("Please input a shape to calculate the area of: ");    
        boolean acceptable = false;
        double shapeArea = 0.0;
        String userInput = scan.next();
        while(!acceptable){                         //this will check to see if the user input 'rectangle,' 'triangle,' or 'circle'
            if(userInput.equals("rectangle")){      //if 'rectangle' is input, variable shape is set equal to rectangle
                String shape = "rectangle";         
                shapeArea = input("rectangle");     //shapeArea is set equal to the area calculated by the method rectangle in the method input
                acceptable = true;
            }
            else if(userInput.equals("triangle")){
                String shape = "triangle";
                shapeArea = input("triangle");      //shapeArea is set equal to the area calculated by the method triangle in the method input
                acceptable = true;
            }
            else if(userInput.equals("circle")){
                String shape = "circle";
                shapeArea = input("circle");        //shapeArea is set equal to the area calculated by the method circle in the method input
                acceptable = true;
            }
            else{                                   //if none of the proper shapes are input, prompt the user for correct input
                System.out.println("Please enter a valid shape.");
                System.out.println("Input either 'rectangle,' 'triangle,' or 'circle.'");
                userInput = scan.next();
            }
        }
        System.out.println(shapeArea);          //finally, print the value found for the area
    }
}