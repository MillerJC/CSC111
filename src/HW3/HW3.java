package HW3;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        //3.22
        // my answer
        /*
        Scanner input = new Scanner(System.in);
        int num_1 = input.nextInt();
        int num_2 = input.nextInt();
        int num_3 = input.nextInt();
        int min_num;

        if (num_1 <= num_2) {
            min_num = num_1;
        }
        else {
            min_num = num_2;
        }

        if (min_num < num_3){
            System.out.println(min_num);
        }
        else {
            System.out.println(num_3);
        }


        // standard answer
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();

        if ((num1 <= num2) && (num1 <= num3)) {    // num1 is smaller than both num2 and num3, so is smallest
            System.out.println(num1);
        }
        else if ((num2 <= num1) && (num2 <= num3)) { // num2 is smaller than both num1 and num3, so is smallest
            System.out.println(num2);
        }
        else { // Neither num1 nor num2 are smallest, so num3 must be smallest
            System.out.println(num3);
        }

         */



        // 3.23
        // my answer
        /*
        Scanner input = new Scanner(System.in);
        int highwayNumber;
        int primaryNumber;

        highwayNumber = input.nextInt();

        if (highwayNumber > 0 && highwayNumber < 99) {
            System.out.println("I-" + highwayNumber + ", going east/west.");
        }
        else if (highwayNumber > 99 && highwayNumber < 1000) {
            primaryNumber = highwayNumber % 100;
            if (primaryNumber == 0) {
                System.out.println(highwayNumber + " is not a valid interstate highway number. ");
            }
            else {
                System.out.println("I-" + highwayNumber + " is auxiliary, serving I-"
                        + primaryNumber + ", going east/west.");
            }
        }
        else {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        }

        // standard answer
        if ((highwayNumber < 1) || (highwayNumber > 999) || ((highwayNumber % 100) == 0)) { // Invalid
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        }
        else { // Valid
            if (highwayNumber > 99) {
                System.out.print("I-" + highwayNumber + " is auxiliary");
                // Get the primary
                primaryNumber = highwayNumber % 100; // Gets the rightmost 2 digits
                System.out.print(", serving I-" + primaryNumber);
            }
            else { // Must be 1-99
                primaryNumber = highwayNumber;
                System.out.print("I-" + primaryNumber + " is primary");
            }

            // Ready now to output the direction.
            if ((primaryNumber % 2) == 0) { // Even
                System.out.println(", going east/west.");
            }
            else { // Odd
                System.out.println(", going north/south.");
            }

         */


        // 3.24
        // my answer
        /*
        Scanner input = new Scanner(System.in);
        int input_Pennies = input.nextInt();
        int num_dollars, num_quarters, num_dimes, num_nickels, num_pennies;

        if (input_Pennies <= 0) {
            System.out.println("No change");
        }
        else {
            // calculate num of dollars
            num_dollars = input_Pennies / 100;

            // calculate num of quarters
            input_Pennies = input_Pennies - (num_dollars * 100);
            num_quarters = input_Pennies / 25;

            // calculate num of dimes
            input_Pennies = input_Pennies - (num_quarters * 25);
            num_dimes = input_Pennies / 10;

            // calculate num of nickels
            input_Pennies = input_Pennies - (num_dimes * 10);
            num_nickels = input_Pennies / 5;

            // calculate num of pennies
            input_Pennies = input_Pennies - (num_nickels * 5);
            num_pennies = input_Pennies / 1;

            // print num of each coin types
            // dollar or dollars
            if (num_dollars == 1) {
                System.out.println(num_dollars + " Dollar");
            }
            else if (num_dollars > 1) {
                System.out.println(num_dollars + " Dollars");
            }
            // quarter or quarters
            if (num_quarters == 1) {
                System.out.println(num_quarters + " Quarter");
            }
            else if (num_quarters > 1) {
                System.out.println(num_quarters + " Quarters");
            }
            // dime or dimes
            if (num_dimes == 1) {
                System.out.println(num_dimes + " Dime");
            }
            else if (num_dimes > 1) {
                System.out.println(num_dimes + " Dimes");
            }
            // nickel or nickels
            if (num_nickels == 1) {
                System.out.println(num_nickels + " Nickel");
            }
            else if (num_nickels > 1) {
                System.out.println((num_nickels + " Nickels"));
            }
            // penny or pennies
            if (num_pennies == 1) {
                System.out.println(num_pennies +  "Penny");
            }
            else if (num_pennies > 1) {
                System.out.println(num_pennies + " Pennies");
            }
        }

        // standard answer
        Scanner scnr = new Scanner(System.in);
        int inputVal;
        int numDollars;
        int numQuarters;
        int numDimes;
        int numNickels;
        int numPennies;

        inputVal = scnr.nextInt();

        if (inputVal <= 0) {
            System.out.println("No change");
        } // Could return at this point

        numDollars = inputVal / 100;
        inputVal = inputVal - (numDollars * 100);

        numQuarters = inputVal / 25;
        inputVal = inputVal - (numQuarters * 25);

        numDimes = inputVal / 10;
        inputVal = inputVal - (numDimes * 10);

        numNickels = inputVal / 5;
        inputVal = inputVal - (numNickels * 5);

        numPennies = inputVal;

        if (numDollars > 0) {
            System.out.print(numDollars);
            if (numDollars == 1) {
                System.out.println(" Dollar");
            }
            else {
                System.out.println(" Dollars");
            }
        }

        if (numQuarters > 0) {
            System.out.print(numQuarters);
            if (numQuarters == 1) {
                System.out.println(" Quarter");
            }
            else {
                System.out.println(" Quarters");
            }
        }

        if (numDimes > 0) {
            System.out.print(numDimes);
            if (numDimes == 1) {
                System.out.println(" Dime");
            }
            else {
                System.out.println(" Dimes");
            }
        }

        if (numNickels > 0) {
            System.out.print(numNickels);
            if (numNickels == 1) {
                System.out.println(" Nickel");
            }
            else {
                System.out.println(" Nickels");
            }
        }

        if (numPennies > 0) {
            System.out.print(numPennies);
            if (numPennies == 1) {
                System.out.println(" Penny");
            }
            else {
                System.out.println(" Pennies");
            }
        }

         */


        // 3.27
        // my answer
        /*
        Scanner input = new Scanner(System.in);
        String first_name = input.next();
        String last_name = input.next();
        int year_birth = input.nextInt();

        if (last_name.length() <= 5) {
            System.out.println("Your login name: "
                    + last_name + first_name.charAt(0) + (year_birth / 100));
        }
        else if (last_name.length() > 5) {
            System.out.println("Your login name: "
                    + last_name.substring(0, 5) + first_name.charAt(0) + (year_birth / 100));
        }

        // standard answer
        Scanner sc = new Scanner(System.in);

        String first = sc.next();
        String last = sc.next();
        int number = sc.nextInt();

        String login;

        if (last.length() < 5)  {
            login = last + first.charAt(0) + (number % 100);
        }
        else {
            login = last.substring(0, 5) + first.charAt(0) + (number % 100);

        }
        System.out.println("Your login name: " + login);

         */


        // 22.2
        // my answer
        /*
        Scanner scnr = new Scanner(System.in);
        String inputMonth;
        int inputDay;

        inputMonth = scnr.next();
        inputDay = scnr.nextInt();

        if (inputMonth.equalsIgnoreCase("January")) {
            if (inputDay > 0 || inputDay < 32) {
                System.out.println("Winter");
            }
            else {
                System.out.println("Invalid");
            }
        }
        else if (inputMonth.equalsIgnoreCase("February")) {
            if (inputDay > 0 || inputDay < 31) {
                System.out.println("Winter");
            }
            else {
                System.out.println("Invalid");
            }
        }
        else if (inputMonth.equalsIgnoreCase("March")) {
            if (inputDay < 1 || inputDay > 31) {
                System.out.println("Invalid");
            }
            else if (inputDay < 20) {
                System.out.println("Winter");
            }
            else {
                System.out.println("Spring");
            }
        }
        else if (inputMonth.equalsIgnoreCase("April")) {
            if (inputDay > 0 || inputDay < 31) {
                System.out.println("Spring");
            }
            else {
                System.out.println("Invalid");
            }
        }
        else if (inputMonth.equalsIgnoreCase("May")) {
            if (inputDay > 0 || inputDay < 31) {
                System.out.println("Spring");
            }
            else {
                System.out.println("Invalid");
            }
        }
        else if (inputMonth.equalsIgnoreCase("June")) {
            if (inputDay < 1 || inputDay > 30) {
                System.out.println("Invalid");
            }
            else if (inputDay < 21) {
                System.out.println("Spring");
            }
            else {
                System.out.println("Summer");
            }
        }
        else if (inputMonth.equalsIgnoreCase("July")) {
            if (inputDay > 0 || inputDay < 31) {
                System.out.println("Summer");
            }
            else {
                System.out.println("Invalid");
            }
        }
        else if (inputMonth.equalsIgnoreCase("August")) {
            if (inputDay > 0 || inputDay < 31) {
                System.out.println("Summer");
            }
            else {
                System.out.println("Invalid");
            }
        }
        else if (inputMonth.equalsIgnoreCase("September")) {
            if (inputDay <= 0 || inputDay > 30){
                System.out.println("Invalid");
            }
            else if (inputDay < 22) {
                System.out.println("Summer");
            }
            else {
                System.out.println("Autumn");
            }
        }
        else if (inputMonth.equalsIgnoreCase("October")) {
           if (inputDay > 0 || inputDay < 32) {
               System.out.println("Autumn");
           }
           else {
               System.out.println("Invalid");
           }
        }
        else if (inputMonth.equalsIgnoreCase("November")) {
            if (inputDay > 0 || inputDay < 31) {
                System.out.println("Autumn");
            }
            else {
                System.out.println("Invalid");
            }
        }
        else if (inputMonth.equalsIgnoreCase("December")) {
            if (inputDay < 1 || inputDay > 30){
                System.out.println("Invalid");
            }
            else if (inputDay < 22) {
                System.out.println("Autumn");
            }
            else {
                System.out.println("Winter");
            }
        }
        else {
            System.out.println("Invalid");
        }

        // standard answer
        if (inputMonth.equals("January") && inputDay > 0 && inputDay <= 31) {
            System.out.println("Winter");
        }
        else if (inputMonth.equals("February") && inputDay > 0 && inputDay <= 29) {
            System.out.println("Winter");
        }
        else if (inputMonth.equals("March")) {
            if (inputDay > 0 && inputDay <= 19) {
                System.out.println("Winter");
            }
            else if (inputDay > 19 && inputDay <= 31) {
                System.out.println("Spring");
            }
            else {
                System.out.println("Invalid");
            }
        }
        else if (inputMonth.equals("April") && inputDay > 0 && inputDay <= 30) {
            System.out.println("Spring");
        }
        else if (inputMonth.equals("May") && inputDay > 0 && inputDay <= 31) {
            System.out.println("Spring");
        }
        else if (inputMonth.equals("June")) {
            if (inputDay > 0 && inputDay <= 20) {
                System.out.println("Spring");
            }
            else if (inputDay > 20 && inputDay <= 30) {
                System.out.println("Summer");
            }
            else {
                System.out.println("Invalid");
            }
        }
        else if (inputMonth.equals("July") && inputDay > 0 && inputDay <= 31) {
            System.out.println("Summer");
        }
        else if (inputMonth.equals("August") && inputDay > 0 && inputDay <= 31) {
            System.out.println("Winter");
        }
        else if (inputMonth.equals("September")) {
            if(inputDay > 0 && inputDay <= 21) {
                System.out.println("Summer");
            }
            else if (inputDay > 21 && inputDay <= 30) {
                System.out.println("Autumn");
            }
            else {
                System.out.println("Invalid");
            }
        }
        else if (inputMonth.equals("October") && inputDay > 0 && inputDay <= 31) {
            System.out.println("Autumn");
        }
        else if (inputMonth.equals("November") && inputDay > 0 && inputDay <= 30) {
            System.out.println("Autumn");
        }
        else if (inputMonth.equals("December")) {
            if (inputDay > 0 && inputDay <= 20) {
                System.out.println("Autumn");
            }
            else if (inputDay > 20 && inputDay <= 31) {
                System.out.println("Winter");
            }
            else {
                System.out.println("Invalid");
            }
        }
        else {
            System.out.println("Invalid");
        }

         */


        // 22.4
        // my answer
        /*
        Scanner input = new Scanner(System.in);
        String str_1 = input.nextLine();
        String str_2 = input.nextLine();

        if(str_1.length() > str_2.length()) {
            System.out.println(str_1);
        }
        else {
            System.out.println(str_2);
        }

        // standard answer
        Scanner scnr = new Scanner(System.in);
        String str1;
        String str2;
        String longest;

        str1 = scnr.next();
        str2 = scnr.next();

        // Initially assume the first string is longest.
        longest = str1;
        // Change "longest" if the second string has equal or greater length.
        if (str2.length() >= str1.length()) {
            longest = str2;
        }
        System.out.println(longest);

         */


        // 22.8
        // my answer
        /*
        Scanner input = new Scanner(System.in);

        String sentence = input.nextLine();

        if (sentence.indexOf("BFF") != -1) {
            System.out.println("BFF: best friend forever");
        }

        if (sentence.indexOf("IDK") != -1) {
            System.out.println("IDK: I don't know");
        }

        if (sentence.indexOf("JK") != -1) {
            System.out.println("JK: just kidding");
        }

        if (sentence.indexOf("TMI") != -1) {
            System.out.println("TMI: too much information");
        }

        if (sentence.indexOf("TTYL") != -1) {
            System.out.println("TTYL: talk to you later");
        }

        // standard answer
        Scanner scnr = new Scanner(System.in);
        String userLine;

        System.out.println("Enter text:");
        userLine = scnr.nextLine();
        System.out.println("You entered: " + userLine);

        // Note that a series of if's are used, NOT if-else (common error)
        if (userLine.indexOf("BFF") != -1) {
            System.out.println("BFF: best friend forever");
        }

        if (userLine.indexOf("IDK") != -1) {
            System.out.println("IDK: I don't know");
        }

        if (userLine.indexOf("JK") != -1) {
            System.out.println("JK: just kidding");
        }

        if (userLine.indexOf("TMI") != -1) {
            System.out.println("TMI: too much information");
        }

        if (userLine.indexOf("TTYL") != -1) {
            System.out.println("TTYL: talk to you later");
        }

         */


        // 22.9
        // my answer
        /*
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println("");

        String result_str = text;

        if (text.indexOf("BFF") != -1) {
            result_str = result_str.replaceAll("BFF", "best friend forever");
            System.out.println("Replaced " +"\"BBF\"" + " with" + " \"best friend forever\"");
        }

        if (text.indexOf("IDK") != -1) {
            result_str = result_str.replace("IDK", "I don't know");
            System.out.println("Replaced " +"\"IDK\"" + " with" + " \"I don't know\"");
        }

        if (text.indexOf("JK") != -1) {
            result_str = result_str.replace("JK", "just kidding");
            System.out.println("Replaced " +"\"JK\"" + " with" + " \"just kidding\"");
        }

        if (text.indexOf("TMI") != -1) {
            result_str = result_str.replace("TMI", "too much information");
            System.out.println("Replaced " +"\"TMI\"" + " with" + " \"too much information\"");
        }

        if (text.indexOf("TTYL") != -1) {
            result_str = result_str.replace("TTYL", "talk to you later");
            System.out.println("Replaced " +"\"TTYL\"" + " with" + " \"talk to you later\"");

        }

        System.out.println("");
        System.out.println("Expanded: "+ result_str);

        // standard answer
        Scanner scnr = new Scanner(System.in);
        String userLine;

        // Prompt user for text
        System.out.println("Enter text:");
        userLine = scnr.nextLine();
        System.out.println("You entered: " + userLine);
        System.out.println("");

        // Check for abbreviations
        if (userLine.indexOf("BFF") != -1) {
            System.out.println("Replaced \"BFF\" with \"best friend forever\".");
            userLine = userLine.replace("BFF", "best friend forever");
        }

        if (userLine.indexOf("IDK") != -1) {
            System.out.println("Replaced \"IDK\" with \"I don't know\".");
            userLine = userLine.replace( "IDK", "I don't know");
        }

        if (userLine.indexOf("JK") != -1) {
            System.out.println("Replaced \"JK\" with \"just kidding\".");
            userLine = userLine.replace("JK", "just kidding");
        }

        if (userLine.indexOf("TMI") != -1) {
            System.out.println("Replaced \"TMI\" with \"too much information\".");
            userLine = userLine.replace("TMI", "too much information");
        }

        if (userLine.indexOf("TTYL") != -1) {
            System.out.println("Replaced \"TTYL\" with \"talk to you later\".");
            userLine = userLine.replace("TTYL", "talk to you later");
        }

        // Output expanded text
        System.out.println("");
        System.out.println("Expanded: " + userLine);

         */

    }
}
