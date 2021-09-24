/* *******************************************************************
file: LoanCalculator.java

description: <fill this in>

author: <your name>
date: <the current date>
 *********************************************************************/
import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Need to store: loan amount, annual interest rate, number of years
        double loanAmount = 0;  // Needs to store values like 765.89
        double annualInterestRate = 0;  // Make a double just in case
        int years = 0;

        // May also need variables for monthly payment, monthly interest
        // rate, and total interest paid
        double monthlyPayments;
        double rate;
        double totalInterest;
        // Declare additional variables for temporary values
        double factor;

        // Now get input for the loan amount, annual interest rate, and
        // the number of years
        // <BEGIN YOUR CODE BELOW>

        // <END OF YOUR CODE>

        // Calculate the monthly interest rate
        rate = annualInterestRate / 12;
        // Calculate (1 + rate)^(years * 12)
        factor = Math.pow(1 + rate, years * 12);
        // Now we calculate the monthly payments
        // <BEGIN YOUR CODE BELOW>

        // <END OF YOUR CODE>

        // Now calculate the total interest paid
        // <BEGIN YOUR CODE BELOW>

        // <END OF YOUR CODE>

        // Now print the output as shown in the example
        // <BEGIN YOUR CODE BELOW>

        // <END OF YOUR CODE>
    }
}
