//Katherine Wu
//September 8, 2015
//CSE 002 - Fundamentals of Programming
//Homework 2 - Arithmetic

//define class
public class Arithmetic{

//add main method
    public static void main(String[] args) {
        
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //('$' is part of the variable name)
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        //Pennsylvania State Tax
        double taxPercent=0.06;
        
        //Total cost of socks
        double totalSockCost$;  //total cost of socks
        totalSockCost$=(nSocks*sockCost$);
        
        //Sales tax of socks
        double salesTaxSocks$;  //sales tax of the socks
        salesTaxSocks$=((nSocks*sockCost$)*taxPercent);
        //make only 2 decimal places
        int salesTaxSocks2$=(int)(salesTaxSocks$*100); //multiply by 100 and convert to an int
        double salesTaxSocks3$=salesTaxSocks2$/100.00; //convert to a double (imp) and divide by 100
        
        //Total cost of drinking glasses
        double totalGlassesCost$; //total cost of drinking glasses
        totalGlassesCost$=(nGlasses*glassCost$);
        
        //Sales tax of drinking glasses
        double salesTaxGlasses$; //sales tax of the glasses
        salesTaxGlasses$=((nGlasses*glassCost$)*taxPercent);
        //make only 2 decimal places
        int salesTaxGlasses2$=(int)(salesTaxGlasses$*100); //multiply by 100 and convert to an int
        double salesTaxGlasses3$=salesTaxGlasses2$/100.00; //convert to a double (imp) and divide by 100
        
        //Total cost of envelopes
        double totalEnvelopesCost$; //total cost of envelopes
        totalEnvelopesCost$=(nEnvelopes*envelopeCost$);
        
        //Sales tax of envelopes
        double salesTaxEnvelopes$;  //sales tax of envelopes
        salesTaxEnvelopes$=((nEnvelopes*envelopeCost$)*taxPercent);
        //make only 2 decimal places
        int salesTaxEnvelopes2$=(int)(salesTaxEnvelopes$*100); //multiply by 100 and convert to an int
        double salesTaxEnvelopes3$=salesTaxEnvelopes2$/100.00; //convert to a double (imp)and divide by 100
        
        //Total cost of purchases (including sales taxes)
        double TotalCost=(totalSockCost$+totalGlassesCost$+totalEnvelopesCost$+salesTaxSocks3$+salesTaxGlasses3$+salesTaxEnvelopes3$);
        int TotalCost2= (int)(TotalCost*100); //multiply by 100 and convert to an int
        double TotalCost3=TotalCost2/100.00; //convert to double (imp) and divide by 100
        
        System.out.println("Socks");
        System.out.println("Number of socks bought: "+nSocks);
        System.out.println("Cost per sock: $"+sockCost$);
        
        System.out.println("Drinking Glasses");
        System.out.println("Number of drinking glasses bought: "+nGlasses);
        System.out.println("Cost per drinking glass: $"+glassCost$);
        
        System.out.println("Envelopes");
        System.out.println("Number of boxes of envelopes: "+nEnvelopes);
        System.out.println("Cost per box of envelopes: $"+envelopeCost$);
        
        System.out.println("Total cost of socks: $"+totalSockCost$);
        System.out.println("Sales tax of these socks: $"+salesTaxSocks3$);
        
        System.out.println("Total cost of drinking glasses: $"+totalGlassesCost$);
        System.out.println("Sales tax of these glasses: $"+salesTaxGlasses3$);
        
        System.out.println("Total cost of envelopes: $"+totalEnvelopesCost$);
        System.out.println("Sales tax of these envelopes: $"+salesTaxEnvelopes3$);
        
        System.out.println("Total cost of purchases (before tax): $"+(totalSockCost$+totalGlassesCost$+totalEnvelopesCost$));
        System.out.println("Total sales tax of these purchases: $"+(salesTaxSocks3$+salesTaxGlasses3$+salesTaxEnvelopes3$));
        //above adds all the sales taxes from each of the three purchases together
        System.out.println("Total cost of the puchases (including sales tax): $"+TotalCost3);
        //above prints out the calculations that were done prior to calculate the total cost of puchases including sales tax
        //the number was added together, multlpied by 100/converted to an int/divided by 100.00 to determine the number
        
    }//end of main method
}//end of class