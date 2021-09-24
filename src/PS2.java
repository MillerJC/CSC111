package Problem_Set_2;

import java.util.Random;
import java.util.Scanner;

public class PS2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Problem 1 HeartRateZones
        /*
        // declare variables
        int age, heart_rate, choice = 0;
        double zone_low = 0, zone_high = 0, d = 0, estimated_max_heart_rate = 0;
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter your resting heart rate: ");
        heart_rate = input.nextInt();
        System.out.println();

        // use while loop to calculate the min and max for zone
        while(true) {       // use true to keep while loop repeat
            System.out.println();
            System.out.println("Choose your target [1 - 5] or 0 to quit:\n" +
                    "1. Boost recovery, get ready to train at higher rates\n" +
                    "2. Building endurance, weight loss\n" +
                    "3. Improving cardio fitness, weight management\n" +
                    "4. Speed endurance\n" +
                    "5. Maximal effort, interval training\n");
            System.out.print("Your Choice? ");
            choice = input.nextInt();
            // when choice equals to 0, use break to stop the loop
            if (choice == 0) {
                System.out.println("Done");
                break;
            }
            else if (choice < 0 || choice > 5) {
                // when choice is not in that range, use continue to skip rest code in while loop
                System.out.println("Invalid input. Try again.");
                continue;
            }

            // calculate the min and max for zone when 1 <= choice <= 5
            estimated_max_heart_rate = 220 - age;
            d = estimated_max_heart_rate - heart_rate;
            if (choice == 1) {
                zone_low = d * 0.5 + heart_rate;
                zone_high = d * 0.6 + heart_rate;
            }
            else if (choice == 2) {
                zone_low = d * 0.6 + heart_rate;
                zone_high = d * 0.7 + heart_rate;
            }
            else if (choice == 3) {
                zone_low = d * 0.7 + heart_rate;
                zone_high = d * 0.8 + heart_rate;
            }
            else if (choice == 4) {
                zone_low = d * 0.8 + heart_rate;
                zone_high = d * 0.9 + heart_rate;
            }
            else if (choice == 5) {
                zone_low = d * 0.9 + heart_rate;
                zone_high = d * 1.0 + heart_rate;
            }
            System.out.printf("Exercise to keep your heart rate in the zone %.2f - %.2f beats per minute\n", zone_low, zone_high);
        }

         */

        // Problem 2 MultiplicationQuiz
        /*
        // use Random to get random numbers
        Random random = new Random();
        int number_problem, max, min;
        int num_1, num_2, answer, num_right = 0;
        double rate;

        System.out.println("Multiplication Quiz Wiz!\n");
        System.out.print("How many problems do you want to work on? ");
        number_problem = input.nextInt();
        System.out.print("What are the smallest and largest numbers to use? ");
        min = input.nextInt();
        max = input.nextInt();

        // use for loop to calculate and print each problem and its answer
        for (int i = 0; i < number_problem; i++) {
            num_1 = random.nextInt(max - min + 1) + min;
            num_2 = random.nextInt(max - min + 1) + min;
            System.out.println();
            System.out.print("Q" + (i + 1) + ": " + num_1 + " x " + num_2 +" ? ");
            answer = input.nextInt();
            // use if statement to decide if the answer ew input equals to the correct answer
            if (answer == num_1 * num_2) {
                System.out.println("Correct!");
                num_right++;
            }
            else {
                System.out.println("Oops... It’s " + num_1 * num_2);
            }
        }

        // calculate the correct rate
        // ler numb_right * 100.0 first to convert its datatype to double
        rate = num_right * 100.0 / number_problem;
        System.out.printf();
        System.out.printf("You got %d out of %d or %.1f%%%n", num_right, number_problem, rate);

         */

        // Problem 3 PredictGPA
        /*
        int hr, total_hr = 0, course_num = 1;
        double grade = 0, total_grade = 0, gpa;
        String yes_or_no = "y";
        String expected_grade;
        String course_name;
        System.out.println("Semester GPA Predictor: Let’s see what you GPA could be this semester...\n");

        // use while loop, only the string yes_or_no equals to "y", this loop executes
        while(yes_or_no.equalsIgnoreCase("y")) {
            System.out.print("Course" + course_num + ": Course title? ");
            course_name = input.nextLine();
            // use input.nextLine() to get the "\n" after the number we input
            System.out.print("Course" + course_num + ": Number of credit hours? ");
            hr = input.nextInt();
            input.nextLine();
            System.out.print("Course" + course_num + ": Expected grade? ");
            expected_grade = input.next();

            // use if statement to assign value to the grade for each course
            if (expected_grade.equalsIgnoreCase("A")) {
                grade = 4.00;
            }
            else if (expected_grade.equalsIgnoreCase("A-")) {
                grade  = 3.67;
            }
            else if (expected_grade.equalsIgnoreCase("B+")) {
                grade = 3.33;
            }
            else if (expected_grade.equalsIgnoreCase("B")) {
                grade = 3.00;
            }
            else if (expected_grade.equalsIgnoreCase("B-")) {
                grade = 2.67;
            }
            else if (expected_grade.equalsIgnoreCase("C+")) {
                grade = 2.33;
            }
            else if (expected_grade.equalsIgnoreCase("C")) {
                grade = 2.00;
            }
            else if (expected_grade.equalsIgnoreCase("C-")) {
                grade = 1.67;
            }
            else if (expected_grade.equalsIgnoreCase("D+")) {
                grade = 1.33;
            }
            else if (expected_grade.equalsIgnoreCase("D")) {
                grade = 1.00;
            }
            else if (expected_grade.equalsIgnoreCase("D-")) {
                grade = 0.67;
            }
            else if (expected_grade.equalsIgnoreCase("F")) {
                grade = 0.00;
            }
            else if (expected_grade.equalsIgnoreCase("I")) {
                grade = 0.00;
            }
            else if (expected_grade.equalsIgnoreCase("NR")) {
                grade = 0.00;
            }

            // calculate the total hours and total points for all the courses we take
            total_grade += grade * hr;
            total_hr += hr;
            course_num++;

            // use while loop, only when we get "y" or "n", use break to stop this loop
            while(true) {
                System.out.print("Continue (y/n)? ");
                yes_or_no = input.next();
                // use input.nextLine() to get the "\n" after the string
                input.nextLine();
                if (yes_or_no.equalsIgnoreCase("y") || yes_or_no.equalsIgnoreCase("n")) {
                    System.out.println();
                    break;
                }
            }

        }

        // calculate gpa using formula and use printf
        gpa = total_grade / total_hr;
        System.out.println();
        System.out.printf("Your semester GPA would be: %.4f%n", gpa);
         */

        // Problem 4 SimpleStatistics
        /*
        int num_of_numbers;
        double max = 0, min = 0, sum = 0, tmp;

        System.out.println("Simple Statistics ==========");
        System.out.print("How many numbers do you want to enter? ");
        num_of_numbers = input.nextInt();

        // use for loop because we have its conditions for starting and ending
        for (int i = 0; i < num_of_numbers; i++) {
            tmp = input.nextDouble();
            // we need to assign the default value to max and min, generally it will be 0.
            // we have to avoid the situation that all numbers are negative, so we need to make max and min equal to the first number we input
            // then let max and min compare with other numbers we input
            // only when i = 0, use if statement to do that
            if (i == 0) {
                min = tmp;
                max = tmp;
                sum += tmp;
            }
            // get the max number
            if (max < tmp) {
                max = tmp;
            }
            // get the min number
            if (min > tmp) {
                min = tmp;
            }
            // calculate sum of all nunbers
            sum += tmp;
        }

        System.out.println("=======================");
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Range: " + (max - min));
        System.out.printf("Average: %.1f%n", (sum / num_of_numbers));
         */



    }
}