import java.util.Scanner;

public class scnr {
    public static void main(String[] args){
        Scanner Miller = new Scanner(System.in);
        double li = Miller.nextDouble();
        int li_1 = Miller.nextInt();
        char li_2 = Miller.next().charAt(0);



        System.out.println(li + " " +  li_1 + " " + li_2);
    }
}
