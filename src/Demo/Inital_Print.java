import java.util.Scanner;
import static java.lang.System.*;


public class Inital_Print {
    public static void main(String[] args){

        // priny initial name
        /*
        out.println("  ====      ====    ||");
        out.println("//    \\\\  //    \\\\  ||");
        out.println("||    ||  ||        ||");
        out.println("\\\\    //  \\\\    //  ||");
        out.println("  ==== \\\\   ====    =======");
         */


        // print input

        Scanner vname = new Scanner(in);
        //out.printf("What's your name? %n");

        String s = vname.next();
        out.println(s);
        int i = vname.nextInt();
        out.println(i);
        float f = vname.nextFloat();
        out.println(f);
        double d = vname.nextDouble();
        out.println(d);
        boolean b = vname.nextBoolean();
        out.println(b);

        // out.println("My name is " + name + ". Nice to meet you!");

        //
    }



}
