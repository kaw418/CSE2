//Katherine Wu
//November 3, 2015
//CSE 002 - Fundamentals of Programming
//Shuffling Program
//In this program, a deck of cards will be printed out in order (by suits), then shuffled by a method called shuffle. Then, a method called randomizeHand will 
//randomly choose 5 cards from the deck (and not repeat any) and the results of both of these will be printed out by a method called printArray.
public class Shuffling{
    public static void main(String[] args){
        //Scanner scan = new Scanner (System.in);   //this line was in the homework template, however, a Scanner is not necessary here
        //suits club, heart, spade, or diamond
        String[] suitNames = {"C","H","S","D"};
        String[] rankNames = {"2", "3", "4" , "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] cards = new String[52];    //declare a new array of strings, will represent the deck of cards
        String[] hand = new String[5];      //declare a new array of strings, will represent the hand of 5 cards chosen later
        for(int i = 0; i<52; i++){          //this fills the array cards
            cards[i]=rankNames[i%13]+suitNames[i/13];       //...with ranks and suits
            System.out.print(cards[i]+" ");
        }
        //printArray(cards);    //this line was in the homework template, but it would be redundant to put it here since the previous loop already prints out the array cards
        System.out.println("");     //these two lines were added to the homwork template to provide spacing and titles for what each portion of the program is doing
        System.out.println("Shuffled");
        shuffle(cards);         //method shuffle is applied on array cards
        printArray(cards);      //method printArray prints out the members of the array cards after shuffle is applied to cards
        System.out.println("");     //these two lines were added to the homework template to provide spacing and titles for what each portion of the program is doing
        System.out.println("Randomized hand!");
        hand = randomizeHand(cards);    //set array hand equal to the array that is created when the method randomizeHand is applied on the array cards
        printArray(hand);       //method printArray prints out the members of the array hand
        System.out.println("");     //this line was added to the homework template to provide spacing
    }
    public static void printArray(String[] array){  //this method printArray accepts an array of Strings
        int size = array.length;        //set size equal to the number of elements in the array
        for(int i = 0; i<size; i++){    //loop for each element of the array, starting from index of 0 and ending at the last index
            System.out.print(array[i]+" "); //print out the value of the array at each index, separating each one with a space
        }
    }
   
    public static String[] shuffle(String[] array){     //this method shuffle accepts an array of Strings and returns an array of Strings
        for(int counter =0; counter<100; counter++){    //picked 100 times to loop so that all 52 cards are thoroughly shuffled
            int i =(int)(Math.random()*array.length);   //each time it loops, randomly choose an index of the array (cards)
            String replace = array[i];                  //set variable replace equal to the value of the array at this randomly chosen index
            array[i] = array[0];                        //set the value at this randomly chosen index equal to the value of the array at 0
            array[0] = replace;                         //now set the value of the array at 0 equal to the old value of the array at the randomly chosen index, which is equal to the variable replace
        }
        return array;       //return this new array
    }
    public static String[] randomizeHand(String[] array){       //this method randomizeHand accepts an array of Strings and returns an array of Strings
        String[] randomHand = new String[5];                    //it creates a new array called randomHand, made of Strings, and allocates memory for 5 indices
        int a = (int) (Math.random()*52);                       //create 5 random numbers corresponding to indices in the array, these will be the 5 random cards drawn to create this new array
        int b = (int) (Math.random()*52);
        int c = (int) (Math.random()*52);
        int d = (int) (Math.random()*52);
        int e = (int) (Math.random()*52);
        if(e==d||e==c||e==b||e==a||d==c||d==b||d==a||c==b||c==a||b==a){     //we want to make sure that none of the cards are repeated, so if any of the 5 random numbers are equal...
            while(e==d||e==c||e==b||e==a||d==c||d==b||d==a||c==b||c==a||b==a){  //loop and created 5 new random numbers until none of the random numbers are equivalent to each other
                a = (int) (Math.random()*52);
                b = (int) (Math.random()*52);
                c = (int) (Math.random()*52);
                d = (int) (Math.random()*52);
                e = (int) (Math.random()*52);
                randomHand[0] = array[a];       //when none of the 5 random numbers corresponding to indices of the array are equivalent, set randonHnad[0-4] equal to each of these
                randomHand[1] = array[b];
                randomHand[2] = array[c];
                randomHand[3] = array[d];
                randomHand[4] = array[e];
            }
        }
        else{                          //if from the start, none of the randomly generated numbers are the same, just set the new array from the start
            randomHand[0] = array[a];
            randomHand[1] = array[b];
            randomHand[2] = array[c];
            randomHand[3] = array[d];
            randomHand[4] = array[e];
        }
        return randomHand;      //return this new array
    
    }
    
}
