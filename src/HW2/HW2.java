package HW2;

import java.util.Scanner;

public class HW2 {

    public static void main(String[] args){

        //2.25
        /*
        Scanner input = new Scanner(System.in);

        int number_1 = input.nextInt();
        int number_2 = input.nextInt();

        int res = number_1 / number_2;
        System.out.print(res);

        res = res / number_2;
        System.out.print(" " + res);

        res = res / number_2;
        System.out.printf(" " + res);
         */

        /*
        Scanner scnr = new Scanner(System.in);
        int userNum;
        int divNum;

        userNum = scnr.nextInt();
        divNum = scnr.nextInt();

        userNum = userNum / divNum;
        System.out.print(userNum);

        userNum = userNum / divNum;
        System.out.print(" " + userNum);

        userNum = userNum / divNum;
        System.out.println(" " + userNum);
         */


        //2.26
        //My answer
        /*
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        int weight = input.nextInt();
        int heart_Rate = input.nextInt();
        int time = input.nextInt();

        // for woman
        double res_w = ((age * 0.074) - (weight * 0.05741) + (heart_Rate * 0.4472) - 20.4022) * time / 4.184;
        System.out.printf("%s%.2f%s%n", "Women: ", res_w, " calories");

        // for man
        double res_m = ((age * 0.2017) + (weight * 0.09036) + (heart_Rate * 0.6309) - 55.0969) * time / 4.184;
        System.out.printf("%s%.2f%s%n", "Men: ", res_m, " calories");
         */


        /*
        Scanner scnr = new Scanner(System.in);
        double ageYears;
        double weightPounds;
        double heartBPM; // beats per minute
        double timeMinutes;
        double caloriesMan;
        double caloriesWoman;

        ageYears = scnr.nextDouble();
        weightPounds = scnr.nextDouble();
        heartBPM = scnr.nextDouble();
        timeMinutes = scnr.nextDouble();

        caloriesWoman = ((ageYears * 0.074)  - (weightPounds * 0.05741) + (heartBPM * 0.4472) - 20.4022 ) * timeMinutes / 4.184;

        caloriesMan = ((ageYears * 0.2017) + (weightPounds * 0.09036) + (heartBPM * 0.6309) - 55.0969 ) * timeMinutes / 4.184;

        System.out.printf("Women: %.2f calories\n", caloriesWoman);
        System.out.printf("Men: %.2f calories\n", caloriesMan);
         */

        //2.27
        //My answer
        /*
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        System.out.println(Math.pow(x, z) + " " + Math.pow(x, Math.pow(y, z)) + " " + Math.abs(y) + " " + Math.sqrt(Math.pow(x * y , z)));
         */


        //2.28
        //My answer
        /*
        Scanner input = new Scanner(System.in);

        int num_1 = input.nextInt();
        int num_2 = input.nextInt();
        int num_3 = input.nextInt();
        int num_4 = input.nextInt();

        //max and average
        System.out.println((num_1 * num_2 * num_3 * num_4) + " " + (num_1 + num_2 + num_3 + num_4) / 4);

        //max and average with three digits
        System.out.printf("%.3f %.3f", ((double)num_1 * num_2 * num_3 * num_4), (num_1 + num_2 + num_3 + num_4) / 4.0);
         */


        //21.1
        //My answer
        /*
        Scanner scnr = new Scanner(System.in);
        double caffeineMg; // "double" supports floating-point like 75.5, versus int for integers like 75.

        caffeineMg = scnr.nextDouble();

        System.out.printf("After 6 hours: %.2f mg\n", caffeineMg / (double)(Math.pow(2, (6 / 6))));
        System.out.printf("After 12 hours: %.2f mg\n", caffeineMg / (double)(Math.pow(2, (12 / 6))));
        System.out.printf("After 24 hours: %.2f mg\n", caffeineMg / (double)(Math.pow(2, (24 / 6))));

        // other answer
        System.out.printf("After 6 hours: %.2f mg\n", caffeineMg / 2.0);
        System.out.printf("After 12 hours: %.2f mg\n", caffeineMg / 4.0);
        System.out.printf("After 24 hours: %.2f mg\n", caffeineMg / 16.0);

         */


        //21.3
        //My answer
        /*
        Scanner scnr = new Scanner(System.in);
        long phoneNumber;
        // Add more variables as needed
        phoneNumber = scnr.nextLong();

        // set a temporary variable
        double temp = phoneNumber;

        // get first four digits/line number
        int lineNumber = (int)(temp % 10000);

        // get the next three digits/prefix number
        temp = temp / 10000; //delete most right four digits
        int prefixNumber = (int)(temp % 1000);

        // get the area code
        temp = temp / 1000; //delete all the other number except the area code
        int area_code = (int)temp;


        System.out.printf("(%d) %d-%d%n", area_code, prefixNumber, lineNumber);


        // other answer
        tempNumber = phoneNumber; // Will be used to hold shifted amount

        lineNumber = tempNumber % 10000; // Rightmost 4 digits
        tempNumber = tempNumber / 10000; // Shift right by 4 digits

        prefixNumber = tempNumber % 1000; // Rightmost 3 digits
        tempNumber   = tempNumber / 1000; // Shift right by 3 digits

        areaCodeNumber = tempNumber; // Remaining 3 digits are the area code

        System.out.println("(" + areaCodeNumber + ") " + prefixNumber + "-" + lineNumber);
         */


        //21.4
        //My answer
        /*
        Scanner scnr = new Scanner(System.in);
        double initial_key_frequency = scnr.nextDouble();
        double first_key_frequency;
        double second_key_frequency;
        double third_key_frequency;
        double fourth_key_frequency;
        double r = Math.pow(2, (1.0 / 12.0));

        first_key_frequency = initial_key_frequency * r;
        second_key_frequency = first_key_frequency * r;
        third_key_frequency = second_key_frequency * r;
        fourth_key_frequency = third_key_frequency * r;

        System.out.printf("%.2f %.2f %.2f %.2f %.2f", initial_key_frequency, first_key_frequency, second_key_frequency, third_key_frequency,fourth_key_frequency);


        // other answer
        double startingFrequency;

        startingFrequency = scnr.nextDouble();
        r = Math.pow(2, 1.0 / 12.0);

        System.out.printf("%.2f %.2f %.2f %.2f %.2f\n", startingFrequency,
                startingFrequency * Math.pow(r, 1),
                startingFrequency * Math.pow(r, 2),
                startingFrequency * Math.pow(r, 3),
                startingFrequency * Math.pow(r, 4));

         */


        //21.7
        //My answer
        /*
        int seconds;
        int minutes;
        int hours;

        Scanner input = new Scanner(System.in);
        int input_seconds = input.nextInt(); // the unit is seconde;

        //3600 (number of seconds in an hour); 60 (number of seconds in a minute)
        hours = input_seconds / 3600;
        minutes = (input_seconds - (hours * 3600)) / 60;
        seconds = (input_seconds - (hours * 3600) - (minutes * 60)); //
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

        // other answer
        // get the number of seconds from the user
        Scanner scnr = new Scanner(System.in);
        seconds = scnr.nextInt();

        // calculate number of hours by dividing by 3600 (number of seconds in an hour)
        hours = seconds / 3600;
        // calculate the remaining number of seconds
        seconds = seconds % 3600;

        // calculate number of minutes by dividing by 60 (number of seconds in a minute)
        minutes = seconds / 60;
        // calculate the remaining number of seconds
        seconds = seconds % 60;

        // print the results
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

         */


        //21.17
        //My answer

        /*
        Scanner scnr = new Scanner(System.in);
        int userInt;
        double userDouble;
        // FIXME Define char and string variables similarly
        String userString;
        char userChar;

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();
        System.out.println("Enter double:");
        userDouble = scnr.nextDouble(); //"
        System.out.println("Enter char:");
        userChar = scnr.next().charAt(0);
        System.out.println("Enter string:");
        userString = scnr.next();




        // FIXME (1): Finish reading other items into variables, then output the four values on a single line separated by a space
        System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);
        // FIXME (2): Output the four values in reverse
        System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);
        // FIXME (3): Cast the double to an integer, and output that integer
        int cast_double = (int)userDouble;
        System.out.println(userDouble + " cast to an integer is " + cast_double);

         */

        // other answer for 21.17
        /*
        System.out.println("Enter integer:");
        userInt = scnr.nextInt();

        // FIXME (1): Finish reading other items into variables, then output the four values on a single line separated by a space
        System.out.println("Enter double:");
        userDouble = scnr.nextDouble();

        System.out.println("Enter character:");
        userChar  = scnr.next().charAt(0);

        System.out.println("Enter string:");
        userString = scnr.next();

        System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);

        // FIXME (2): Output the four values in reverse
        System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);

        // FIXME (3): Cast the double to an integer, and output that integer
        System.out.println(userDouble + " cast to an integer is " +(int)userDouble);

         */

        /*
        Scanner input = new Scanner(System.in);
        long num_1 = input.nextLong();
        long num_2 = input.nextLong();
        long num_3 = input.nextLong();
        long num_4 = input.nextLong();

        // product and average
        System.out.println(num_1 * num_2 * num_3 * num_4 + " " + (num_1 + num_2 + num_3 + num_4) / 4);

        // prduct and average with three digits
        System.out.printf("%.3f %.3f%n", (double)(num_1 * num_2 * num_3 * num_4), (num_1 + num_2 + num_3 + num_4) / 4.0);



         */

        /*
        Scanner scnr = new Scanner(System.in);
        double mile_per_gal = scnr.nextDouble();
        double dollar_per_gal = scnr.nextDouble();

        double cost = (1.0 / mile_per_gal) * dollar_per_gal;

        System.out.printf("%.2f %.2f %.2f%n", 20 * cost, 75 * cost, 500 * cost);

         */

        /*
        String s = "I'm ready!";
        System.setProperty(s, "true");
        if (Boolean.getBoolean(s)) {
            System.out.println("OK");
        }

         */




    }
}
