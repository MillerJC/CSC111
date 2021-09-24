public class V_transit {
    public static void main(String[] arg){

        /*
         自动类型转化： 范围小 -> 范围大
         byte-short/char-int-long-float-double (数值型)
         */

        // Example

        double d = 10;
        System.out.println(d);

        byte b = 10;
        short s = b;
        System.out.println(s);

        /*
        强制类型转化：
        范围小 <- 范围大
            byte-short/char-int-long-float-double (数值型)

        格式：target data_type name_1 = (target) V;

         */

        int k = (int) 888.888;
        long l = Integer.toUnsignedLong(k);
        System.out.println(l);



    }
}
