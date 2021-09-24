import java.util.Scanner; // Allow inputs from the user

public class grading {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("How many questions do you wanna answer?");
        System.out.println("Please enter the specific number.");
        int userNum = scnr.nextInt();

        System.out.println("What are the smallest and largest numbers you wanna use in your questions?");
        System.out.println("(They can be negative numbers.)");
        int userMin = scnr.nextInt(); // the first number the user puts in, which is the minimum
        int userMax = scnr.nextInt(); // the second number the user puts in, which is the maximum
        /*String abc = scnr.nextLine();
         */// takes all the blank space left in the user's input in case the program won't be functioning

        int x1; // the random number that the system would automatically generate, based on the maximum and minimum given by the user
        int x2; // the random number that the system would automatically generate, based on the maximum and minimum given by the user
        // nextInt(8) generates 0-8; nextInt(8) + 2 generates 2-8
        // Likewise, x would be ranged from userMin to userMax
        x1 = scnr.nextInt(userMax) + userMin;
        x2 = scnr.nextInt(userMax) + userMin;
        int result;
        int userAnswer;
        int success = 0; // The number of the questions that the user gets right

        int i; // the number of the questions
        for (i = 0; i <= userNum; ++i) {
            System.out.print("Q " + i);
            System.out.print(": What is " + x1 + " x " + x2 + " ?");
            userAnswer = scnr.nextInt();
            result = x1 * x2;
            if (userAnswer == result) {
                success +=1; // if the user gets the question correct, the number of success questions would increase by 1
                System.out.println("Correct!");
            }
            else {
                System.out.println("Oops... It's " + result);
            }
        }
        // using type casting to convert the integers to double to make this equation possible
        double sucessRate = (double) (success) / (double) userNum;
        System.out.print("You got " + success + "  of" + userNum + " or ");
        System.out.printf("%.2f%%\n", sucessRate);

    }
}