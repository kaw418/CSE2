//Katherine Wu
//September 18, 2015
//CSE002 -Fundamentals of Programming
//Card Generator Lab

public class CardGenerator{
    public static void main(String[] args){
        int digit = (int)(Math.random()*52)+1;
        String identity ="";    //declare identity
        String suit ="";        //declare suit
        //create if statements to distinguish suits (diamonds, clubs, hearts, spades)
        if ( digit < 14 ){
            suit =  "Diamonds";
        }
        else if ( (digit > 13) && (digit < 27) ){
            suit =  "Clubs";
        }
        else if ( (digit > 26) && (digit < 40) ){
            suit =  "Hearts";
        }
        else if ( digit > 39 ){
            suit = "Spades";
        }
        //divide by 13 and use remainder, prevents from having to write out 52 cases
        int number = (digit % 13);
        //use switch statement to distinguish card identities
        switch (number){
            case 1:
                identity = "Ace";
                break;
            case 2:
                identity = "2";
                break;
            case 3:
                identity = "3";
                break;
            case 4:
                identity = "4";
                break;
            case 5:
                identity = "5";
                break;
            case 6:
                identity = "6";
                break;
            case 7:
                identity = "7";
                break;
            case 8:
                identity = "8";
                break;
            case 9:
                identity = "9";
                break;
            case 10:
                identity = "10";
                break;
            case 11:
                 identity = "Jack";
                 break;
            case 12:
                identity = "Queen";
                break;
            case 0:
                identity = "King";
                break;
            
        }
        //print out the result
        System.out.println("You picked the " + identity + " of " + suit);
        
    }
}