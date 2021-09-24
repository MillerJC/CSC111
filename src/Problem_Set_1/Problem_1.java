package Problem_Set_1;

import java.util.Locale;
import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {

        // FoodCarbonFootprint
        /*
        Scanner input = new Scanner(System.in);
        int Beef_cal, Cheese_cal, Yogurt_cal, Chicken_cal, Milk_cal, Egg_cal, Tofu_cal, Beans_cal, Lentil_cal, Nut_cal;
        System.out.println("Please enter the amount of calories you consume for these food types.");
        System.out.printf("%s ", "Beef:");
        Beef_cal = input.nextInt();
        System.out.printf("%s ", "Chicken:");
        Chicken_cal = input.nextInt();
        System.out.printf("%s ", "Cheese:");
        Cheese_cal = input.nextInt();
        System.out.printf("%s ", "Yogurt:");
        Yogurt_cal = input.nextInt();
        System.out.printf("%s ", "Milk:");
        Milk_cal = input.nextInt();
        System.out.printf("%s ", "Eggs:");
        Egg_cal = input.nextInt();
        System.out.printf("%s ", "Tofu:");
        Tofu_cal = input.nextInt();
        System.out.printf("%s ", "Beans");
        Beans_cal = input.nextInt();
        System.out.printf("%s ", "Lentils:");
        Lentil_cal = input.nextInt();
        System.out.printf("%s ", "Nuts");
        Nut_cal = input.nextInt();


        // get the sum of calories per day
        int Sum_cal = Beef_cal + Chicken_cal + Cheese_cal + Yogurt_cal + Milk_cal
                + Egg_cal + Tofu_cal + Beans_cal + Lentil_cal + Nut_cal;
        System.out.println("Your total number of calories per day would be: " + Sum_cal);

        // get daily food carbon footprint
        double daily_food_carbon_footprint = ((0.01378 * Beef_cal) + (0.00337 * Chicken_cal) +
                (0.00447 * Cheese_cal)+ (0.00349 * Yogurt_cal) + (0.00317 * Milk_cal) +
                (0.00306 * Egg_cal ) + (0.00138 * Tofu_cal) + (0.00140 * Beans_cal) +
                (0.00078 * Lentil_cal) + (0.00039 * Nut_cal)) / 1000;
        System.out.printf("%s %.3f %s%n", "Your daily food carbon footprint would be ", daily_food_carbon_footprint
                , "kilograms of carbon dioxide equivalent.");

        // get annual food carbon footprint
        double annual_food_carbon_footprint = 365 * daily_food_carbon_footprint / 1000;
        System.out.printf("%s %.3f %s%n" , "Your annual food carbon footprint would be ", annual_food_carbon_footprint
                , "tons of carbon dioxide equivalent.");

         */


        // Calculating Monthly Payments (LoanCalculator)
        /*
        double  principalAmount, monthlyPayment, rate_year, total_interest_paid;
        int n, year;
        // principalAmount is the loan amount,
        // rate is the monthly interest rate (1/12th the annual rate)
        // n is the number of monthly payments

        Scanner input = new Scanner(System.in);
        System.out.println("Monthly Payment Calculator ===========================");
        System.out.print("Please enter the loan amount [e.g. 10000.00 ]: ");
        principalAmount = input.nextDouble();
        System.out.print("Please enter the annual interest rate [e.g. 5 ]: ");
        rate_year = input.nextDouble();
        System.out.print("Please enter the term of the loan in years [e.g. 6 ]: ");
        year = input.nextInt();

        // get the value of n
        n = year * 12;

        // get monthly rate
        double rate_month = (rate_year / 100) / 12;

        // get monthly payment
        monthlyPayment = principalAmount *
                ((rate_month * (Math.pow((1 + rate_month), n))) / ((Math.pow((1 + rate_month), n)) - 1));

        // get total interest paid
        total_interest_paid = (monthlyPayment * n) - principalAmount;

        System.out.printf("%nMonthly payment: %s%.2f%n", "$", monthlyPayment);
        System.out.printf("Total interest paid: %s%.2f%n", "$", total_interest_paid);

         */


        // Simplistic Trip Planner (TripPlanner)
        /*
        Scanner input = new Scanner(System.in);
        int num_passenger, length_trip;
        double price_one_gal, miles_per_gal, capacity_gal;

        System.out.println("My Trip Planner ===========================");
        System.out.print("Number of passengers: ");
        num_passenger = input.nextInt();
        System.out.print("Length of the trip in miles: ");
        length_trip = input.nextInt();
        System.out.print("Capacity of the car’s gas tank in gallons: ");
        capacity_gal = input.nextDouble();
        System.out.print("Price of one gallon of gas: ");
        price_one_gal = input.nextDouble();
        System.out.print("Miles/gallon of your car: ");
        miles_per_gal = input.nextDouble();

        // get the number of needed tanks of gas
        int num_tank = (int) Math.ceil(length_trip / (capacity_gal * miles_per_gal));

        // get the total cost
        double total_cost = (num_tank * capacity_gal) * price_one_gal;

        // get each passengher's cost
        double one_passenger_cost = total_cost / num_passenger;

        System.out.printf("%nYou will need up to %d tanks of gas%n", num_tank);
        System.out.printf("The total cost will be %.2f dollars%n", total_cost);
        System.out.printf("Each passenger should pay %.2f dollars%n", one_passenger_cost);

         */


        // Day of the Week Calculator (DayOfTheWeekCalculator)
        /*
        Scanner input = new Scanner(System.in);
        int year, month, day;


        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%n", "Day of the Week Calculator ==========================="
                , "0 -> Sunday", "1 -> Monday", "2 -> Tuesday", "3 -> Wednesday", "4 -> Thursday", "5 -> Friday", "6 -> Saturday");

        // input date
        System.out.print("Enter a date in the following format [day-month-year e.g. 5-10-1999]: ");
        String date = input.next();

        // get day
        int Index_of_FirstDash = date.indexOf('-');
        String Day = date.substring(0, Index_of_FirstDash);
        day = Integer.parseInt(Day);

        // get month
        int Index_of_LastDash = date.lastIndexOf('-');
        String Month = date.substring(Index_of_FirstDash + 1, Index_of_LastDash);
        month = Integer.parseInt(Month);

        // get year
        int length_str = date.length();
        String Year = date.substring(Index_of_LastDash + 1, length_str);
        year = Integer.parseInt(Year);

        // get the day of a week
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 -month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;


        System.out.printf("%n%s%d", "The day of week for this date is: ", d);

         */







    }
}
