package Demo;

import java.util.Scanner;

public class Test {
    //static int a = 10;
    public static void main(String[] args){
        //out.println("hello world");

        //out.println(a);

        //Scanner input = new Scanner(in);
        //int b = input.nextInt();
        //String c= input.next();
        //out.println(b);
        //out.print(c);

        //out.print(1 / 2.0);

        //String ccc1 = "a a";
        //out.println(0.3431 * 10);
        //out.println('\n');

        // problem A
        /*
        Scanner input = new Scanner(in);
        int d1 = input.nextInt();
        // get number in tens
        int d2 = (d1 / 10) % 10;
        out.println(d2);
         */

        // printf() two parameters
        //out.printf("%s  %d  %f", "jam", 44, 24.7);
        /*
        %s string e.g. %2s
        %d int
        %f double
        %c char
        %n change to another line
         */

        //System.out.printf("%14s", "78.1", "%s%n", "213");
        //out.printf("%.2f", 78.1);

        /*
        %n　　换行　　相当于 \n

        %c　　单个字符

        %d　　十进制整数

        %u　　无符号十进制数

        %f　　十进制浮点数

        %o　　八进制数

        %x　　十六进制数

        %s　　字符串

        %%　　输出百分号
         */


        // if
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        if(userInput.indexOf("darn") == -1){
            System.out.println(userInput);
        }
        else {
            System.out.println("Censored");
        }




    }



}