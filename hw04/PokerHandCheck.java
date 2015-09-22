//Katherine Wu
//September 22, 2015
//CSE 002 - Fundamentals of Programming
//Poker Hand Check


public class PokerHandCheck{
    public static void main(String[] args){
        int digit1 = (int)(Math.random()*52)+1; //generates random number 1 - 52
        String identity1 = "";    //declare identity
        String suit1 = "";        //declare suit
        //create if statements to distinguish suits (diamonds, clubs, hearts, spades)
        if ( digit1 <= 13 ){
            suit1 =  "diamonds";
        }
        else if ( (digit1 >= 14) && (digit1 <= 26) ){
            suit1 =  "clubs";
        }
        else if ( (digit1 >= 27) && (digit1 <= 39) ){
            suit1 =  "hearts";
        }
        else if ( digit1 >= 40 ){
            suit1 = "spades";
        }
        int digit2 = (int)(Math.random()*52)+1; //generates random number 1 - 52
        String identity2 = "";    //declare identity
        String suit2 = "";        //declare suit
        //create if statements to distinguish suits (diamonds, clubs, hearts, spades)
        if ( digit2 <= 13 ){
            suit2 =  "diamonds";
        }
        else if ( (digit2 >= 14) && (digit2 <= 26) ){
            suit2 =  "clubs";
        }
        else if ( (digit2 >= 27) && (digit2 <= 39) ){
            suit2 =  "hearts";
        }
        else if ( digit2 >= 40 ){
            suit2 = "spades";
        }
        int digit3 = (int)(Math.random()*52)+1; //generates random number 1 -52
        String identity3 = "";    //declare identity
        String suit3 = "";        //declare suit
        //create if statements to distinguish suits (diamonds, clubs, hearts, spades)
        if ( digit3 <= 13 ){
            suit3 =  "diamonds";
        }
        else if ( (digit3 >= 14) && (digit3 <= 26) ){
            suit3 =  "clubs";
        }
        else if ( (digit3 >= 27) && (digit3 <= 39) ){
            suit3 =  "hearts";
        }
        else if ( digit3 >= 40 ){
            suit3 = "spades";
        }
        int digit4 = (int)(Math.random()*52)+1; //generates random number 1 - 52
        String identity4 = "";    //declare identity
        String suit4 = "";        //declare suit
        //create if statements to distinguish suits (diamonds, clubs, hearts, spades)
        if ( digit4 <= 13 ){
            suit4 =  "diamonds";
        }
        else if ( (digit4 >= 14) && (digit4 <= 26) ){
            suit4 =  "clubs";
        }
        else if ( (digit4 >= 27) && (digit4 <= 39) ){
            suit4 =  "hearts";
        }
        else if ( digit4 >= 40 ){
            suit4 = "spades";
        }
        int digit5 = (int)(Math.random()*52)+1; //generates random number 1 -52
        String identity5 = "";    //declare identity
        String suit5 = "";        //declare suit
        //create if statements to distinguish suits (diamonds, clubs, hearts, spades)
        if ( digit5 <= 13 ){
            suit5 =  "diamonds";
        }
        else if ( (digit5 >= 14) && (digit5 <= 26) ){
            suit5 =  "clubs";
        }
        else if ( (digit5 >= 27) && (digit5 <= 39) ){
            suit5 =  "hearts";
        }
        else if ( digit5 >= 40 ){
            suit5 = "spades";
        }
        
        int number1 = digit1 % 13;  //divide random digit by 13, use remainder to determine card identity
        switch (number1) {
            case 1:
                identity1 = "ace";
                break;
            case 2:
                identity1 = "2";
                break;
            case 3:
                identity1 = "3";
                break;
            case 4:
                identity1 = "4";
                break;
            case 5:
                identity1 = "5";
                break;
            case 6:
                identity1 = "6";
                break;
            case 7:
                identity1 = "7";
                break;
            case 8:
                identity1 = "8";
                break;
            case 9:
                identity1 = "9";
                break;
            case 10:
                identity1 = "10";
                break;
            case 11:
                identity1 = "jack";
                break;
            case 12:
                identity1 = "queen";
                break;
            case 0:
                identity1 = "king";
                break;
        }
        int number2 = digit2 % 13;  //divide random digit by 13, use remainder to determine card identity
        switch (number2) {
            case 1:
                identity2 = "ace";
                break;
            case 2:
                identity2 = "2";
                break;
            case 3:
                identity2 = "3";
                break;
            case 4:
                identity2 = "4";
                break;
            case 5:
                identity2 = "5";
                break;
            case 6:
                identity2 = "6";
                break;
            case 7:
                identity2 = "7";
                break;
            case 8:
                identity2 = "8";
                break;
            case 9:
                identity2 = "9";
                break;
            case 10:
                identity2 = "10";
                break;
            case 11:
                identity2 = "jack";
                break;
            case 12:
                identity2 = "queen";
                break;
            case 0:
                identity2 = "king";
        }
        int number3 = digit3 % 13;  //divide random digit by 13, use remainder to determine card identity
        switch (number3) {
            case 1:
                identity3 = "ace";
                break;
            case 2:
                identity3 = "2";
                break;
            case 3:
                identity3 = "3";
                break;
            case 4:
                identity3 = "4";
                break;
            case 5:
                identity3 = "5";
                break;
            case 6:
                identity3 = "6";
                break;
            case 7:
                identity3 = "7";
                break;
            case 8:
                identity3 = "8";
                break;
            case 9:
                identity3 = "9";
                break;
            case 10:
                identity3 = "10";
                break;
            case 11:
                identity3 = "jack";
                break;
            case 12:
                identity3 = "queen";
                break;
            case 0:
                identity3 = "king";
        }
        int number4 = digit4 % 13;  //divide random digit by 13, use remainder to determine card identity
        switch (number4) {
            case 1:
                identity4 = "ace";
                break;
            case 2:
                identity4 = "2";
                break;
            case 3:
                identity4 = "3";
                break;
            case 4:
                identity4 = "4";
                break;
            case 5:
                identity4 = "5";
                break;
            case 6:
                identity4 = "6";
                break;
            case 7:
                identity4 = "7";
                break;
            case 8:
                identity4 = "8";
                break;
            case 9:
                identity4 = "9";
                break;
            case 10:
                identity4 = "10";
                break;
            case 11:
                identity4 = "jack";
                break;
            case 12:
                identity4 = "queen";
                break;
            case 0:
                identity4 = "king";
        }
        int number5 = digit5 % 13;  //divide random digit by 13, use remainder to determine card identity
        switch (number5) {
            case 1:
                identity5 = "ace";
                break;
            case 2:
                identity5 = "2";
                break;
            case 3:
                identity5 = "3";
                break;
            case 4:
                identity5 = "4";
                break;
            case 5:
                identity5 = "5";
                break;
            case 6:
                identity5 = "6";
                break;
            case 7:
                identity5 = "7";
                break;
            case 8:
                identity5 = "8";
                break;
            case 9:
                identity5 = "9";
                break;
            case 10:
                identity5 = "10";
                break;
            case 11:
                identity5 = "jack";
                break;
            case 12:
                identity5 = "queen";
                break;
            case 0:
                identity5 = "king";
        }
        //print out the results of the random cards
        System.out.println("Your random cards were:");
        System.out.println ( "the" + " " + identity1 + " of " + suit1 );
        System.out.println ( "the" + " " + identity2 + " of " + suit2 );
        System.out.println ( "the" + " " + identity3 + " of " + suit3 );
        System.out.println ( "the" + " " + identity4 + " of " + suit4 );
        System.out.println ( "the" + " " + identity5 + " of " + suit5 );
        //all possible combinations of pairs out of the 5 random cards
        boolean pair1 = identity1 == identity2;
        boolean pair2 = identity1 == identity3;
        boolean pair3 = identity1 == identity4;
        boolean pair4 = identity1 == identity5;
        boolean pair5 = identity2 == identity3;
        boolean pair6 = identity2 == identity4;
        boolean pair7 = identity2 == identity5;
        boolean pair8 = identity3 == identity4;
        boolean pair9 = identity3 == identity5;
        boolean pair10 = identity4 == identity5;
        //a pair exists if any of the previous boolean statements are true:
        boolean pair = pair1 || pair2 || pair3 || pair4 || pair5 || pair6 || pair7 || pair8 || pair9 || pair10;
        //two pair exists if any of these combinations of pairs exist, these are all the possible combinations
        boolean twoPair = (pair1 & pair8) || (pair1 & pair9) || (pair1 & pair10) || (pair2 & pair6) || (pair2 & pair7) || (pair2 & pair10)
        || (pair3 & pair5) || (pair3 & pair9) || (pair3 & pair7) || (pair4 & pair8) || (pair4 & pair6) || (pair4 & pair5) || (pair5 & pair10)
        || (pair6 & pair9) || (pair7 & pair8);
        //all possible combinations of three of a kind:
        boolean three1 = (identity1 == identity2) && (identity2 == identity3);
        boolean three2 = (identity1 == identity2) && (identity2 == identity4);
        boolean three3 = (identity1 == identity2) && (identity2 == identity5);
        boolean three4 = (identity1 == identity3) && (identity3 == identity4);
        boolean three5 = (identity1 == identity3) && (identity3 == identity5);
        boolean three6 = (identity1 == identity4) && (identity4 == identity5);
        boolean three7 = (identity2 == identity3) && (identity3 == identity4);
        boolean three8 = (identity2 == identity3) && (identity3 == identity5);
        boolean three9 = (identity2 == identity4) && (identity4 == identity5);
        boolean three10 = (identity3 == identity4) && (identity4 == identity5);
        //three of a kind exists if any of the three of a kind combinations exist:
        boolean three = three1 || three2 || three3 || three4 || three5 || three6 || three7 || three8 || three9 || three10;
        //if - else statments to determine the output:
        if (three) {
            System.out.println("You have three of a kind!");
        }
        else if (twoPair) {
            System.out.println("You have two pair!");
        }
        else if (pair & !twoPair) {
            System.out.println("You have a pair!");
        }
        //if none of the above are true, this last else statement catches all other cases
        else {
            System.out.println("You have a high card!");
        }
        
    }   //end of main method
}   //end of class