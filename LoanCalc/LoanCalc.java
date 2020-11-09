package LoanCalc;


import java.util.Scanner;
import java.math.RoundingMode;

/**
 * LoanCalc
 */
public class LoanCalc {
    
    

public static void main(String[] args) {
    Integer amountInteger = null;
    Integer yearLength = null;
    Double tempInterest = null;

    //Ask for data input using Scanner
    System.out.print("Loan Amount: ");
    Scanner d = new Scanner(System.in);
    try {
        amountInteger = d.nextInt();
    } catch (Exception e) {
        //TODO: handle exception
        System.out.println("Wrong input on Amount.");
    }
    System.out.print("Loan Term in years: ");
    try {
        yearLength = d.nextInt();
    } catch (Exception e) {
        //TODO: handle exception
        System.out.println("Wrong input on year length.");
    }
    
    System.out.print("Interest Rate in %: ");
    try {
        tempInterest = d.nextDouble();
    } catch (Exception e) {
        //TODO: handle exception
        System.out.println("Wrong Input on Interest Rate");
    }
    d.close(); //close scanner prevent leak

    //Parse all var to double for calculation
    
    Double amountDouble = Double.parseDouble(amountInteger.toString());
    Double yearLengthDouble = Double.parseDouble(yearLength.toString());
    double interestinpercent = tempInterest / 100 / 12;
    double a = Double.parseDouble("1") + interestinpercent;  
    double b = yearLengthDouble * 12;
    double reqComp = Math.pow(a, b);
    double temp = interestinpercent * reqComp;
    double temp2 = reqComp - 1;
    double intermidate = temp / temp2;

    double payment = amountDouble * intermidate;

    System.out.println("Monthly Payment: " + Math.round(payment));


    
}

}