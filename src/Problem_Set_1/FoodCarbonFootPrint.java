/* *******************************************************************
file: FoodCarbonFootPrint.java

description: This program helps the user estimate the carbon footprint
 of the foods they eat in a daily basis. Carbon footprint refers to
 the amount of greenhouse gas emissions caused by an individual, a
 product, an event, or an organization. It is expressed in units of
 carbon dioxide equivalence (CO2e).

author: <your name>
date: <the current date>
 *********************************************************************/
import java.util.Scanner;

public class FoodCarbonFootPrint {
    public static void main(String[] args) {

        System.out.println("Food Carbon Footprint Calculator");

        int beefCal, cheeseCal, yogurtCal, chickenCal;
        int milkCal, eggsCal, totalCal;
        // Need a variable of type double to store carbonFootprint
        // since its calculation involves a product with decimal fractions
        double carbonFootprint;

        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter the amount of calories you consume for these food types:");
        System.out.print("Beef: ");
        beefCal = kb.nextInt();
        System.out.print("Cheese: ");
        cheeseCal = kb.nextInt();

        totalCal = beefCal + cheeseCal;

        // Order of computations follows typical PEMDA precedence rules
        // If all operations have same precedence, then they are evaluated
        // from left to right.
        carbonFootprint = beefCal * 0.01378 + cheeseCal * 0.00447;
        // In the previous line we have 4 operators from left
        // to right: = * + *
        // The assignment operator (=) has the lowest precedence
        // The 2 multiplications (*) have higher precedence than addition (+)
        // The left-most multiplication is done first: beefCal * 0.01378
        //    The resulting value is of type double, because int * double => double
        // We now have: = + *
        // The next product is computed: cheeseCal * 0.00447
        //    The resulting value is also of type double
        // We now have: = +
        // The addition is computed: value + value
        //    The two values for this sum are doubles so the result is a double
        // The result is stored by = in the variable on the left-hand side
        //      The result is a double so the variable where it is stored
        //      must have been declared as a double.

        System.out.println(totalCal);
        System.out.println(carbonFootprint);

    }
}
