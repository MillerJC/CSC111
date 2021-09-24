public class operator_sign {
    public static void main(String[] arg){
        /*
        算数表达式：+ - * / %
        int a;
        int b;
        int c = a + - * / b;
        除法得到商；
        取余得到余数；
         */

        /*
        字符的 "+":
        int a = 10;
        char c = 'A'; //参与计算的是ASC码值
        System.out.println(a + c);

        计算结果类型的提升：
            byte/short/char -> int;
            byte/short/char -> int -> long -> float -> double



        int k = 10;
        double k_1 = k + 13;
        System.out.println(k_1);
         */


        /*
        字符串的 "+":
        string_1 + string_2 = 拼接两个字符串；

        计算结果类型的提升：
           byte/short/char -> int;
           byte/short/char -> int -> long -> float -> double
         */
         // out.println(666 + 666 + "string"); // 先相加，再拼接

        /*
        赋值运算符：
            = 赋值 （a = 10）
            += 相加并赋值给左边的变量 （a += 10）
            /= -= *= %= (类似)
            注意：
                扩展的赋值运算符包含了强制类型转换；
         */

        /*
        short s = 10;
        s += 20;
        System.out.println(s);
        s = (short) (s + 20);
        System.out.println(s);
         */

        /*
        自增自减运算符：
            ++ 自增 （i++ / ++i）
            -- 自减 （i-- / --i）



        int i;

        // 单独使用时，i++和++i效果一样；
        i = 10;
        i++;
        System.out.println(i);

        i = 10;
        ++i;
        System.out.println(i);

        // 参与操作使用 i++ 和 ++i的区别：
        i = 10;
        int j_1 = i++;
        System.out.println(j_1);



        i = 10;
        int j_2 = ++i;
        System.out.println(j_2);
        // 参与操作时，
            // ++i 先自增，再操作；
            // i++ 先操作，再自增

         */

        /*
        关系运算符：
            == 相等  (a == b -> true/false)
            != 不相等 (a != b -> true/false)
            > 大于
            >= 大于等于
            < 小于
            <=  小于等于

         */

        /*
        逻辑运算符：
            先拆解，在合并
            (3 < X < 6) -> (X > 3 && X < 6)

            & 逻辑与
            ｜ 逻辑或
            ！逻辑非
            ^ 逻辑异或
         */

        /*
        短路逻辑运算符：
            && 短路与
            ｜｜ 短路或


        // && 和 &
        // 逻辑与&:
        //      左右都需要计算；
        // 短路与&&；
        //      只有左边为真，右边才参与计算；

         */

        /*
        三元运算符：
            格式: 关系表达式 ? 表达式1 : 表达式2; (a > b ? a : b)


        int a = 10, b = 20;
        boolean res = a > b ? true : false;
        System.out.println(res);
         */

    }
}
