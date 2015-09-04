//Katherine Wu
//September 4, 2015
//CSE 002 Cyclometer lab
//This program will, for two trips (given time & rotation count):
    //print the number of minutes of each trip
    //print the number of counts for each trip
    //print the distance of each trip in miles
    //print the distance for the two trips combined
//This is a bicycle cyclometer to measure speed and distance, etc.
//
public class Cyclometer {
        //main method required for every Java program
        public static void main (String[] args) {
            //our input data
            int secsTrip1=480;      //the number of seconds in Trip1
            int secsTrip2=3220;     //the number of seconds in Trip2
            int countsTrip1=1561;   //the number of counts or wheel turns in Trip1
            int countsTrip2=9037;   //the number of counts or wheel turns in Trip2
            //our intermediate variables and output data
            double wheelDiameter=27.0,  //the wheel diameter, will help calculate rotation to give distance
            PI=3.14159, //pi will be used in calculation of rotations to give distance
            feetPerMile=5280,   //this will also be used to calculate rotations to give distance
            inchesPerFoot=12,   //this will also be used to calculate rotation to give distance
            secondsPerMinute=60;    //this will come into play with the calculations of distance as well
            double distanceTrip1, distanceTrip2, totalDistance; //this is declaring these variables as doubles
            
            System.out.println("Trip 1 took "+
                (secsTrip1/secondsPerMinute)+" minutes and had "+
                countsTrip1+" counts.");
            System.out.println("Trip 2 took "+
                (secsTrip2/secondsPerMinute)+" minutes and had "+
                countsTrip2+" counts.");
            //run the calculatrions; store the values.
            distanceTrip1=countsTrip1*wheelDiameter*PI;
            //above gives distance in inches
            //(for each count, a roation of the wheel travels
            //the diameter in inches times PI)
            distanceTrip1/=inchesPerFoot*feetPerMile;   //this will give distance in miles
            distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
            totalDistance=distanceTrip1+distanceTrip2;
            //print out the data
            System.out.println("Trip 1 was "+distanceTrip1+" miles");
            System.out.println("Trip 2 was "+distanceTrip2+" miles");
            System.out.println("The total distance was "+totalDistance+" miles");
            
        }   //end of main method
}   //end of class