package day02.operator;

/**
 * 算数运算法
 *
 * @author icas-tt
 */
public class ArithmeticOpr {
    public static void main(String[] args) {
        System.out.println(5 + 2);
        System.out.println(5 - 2);
        System.out.println(5 * 2);

        // 整数除法
        System.out.println(5 / 2);
        System.out.println(5 / 2.);
        System.out.println("---------------------------");

        // 取余数,结果由被除数决定
        System.out.println(5 % 2);
        System.out.println(-5 % 2);
        System.out.println(5 % -2);
        System.out.println("---------------------------");

        // 1+2+3=??
        int m = 123;

        System.out.println(m % 10 + m / 10 + m / 100);
        System.out.println("---------------------------");

        int b = 20;
        // b++  先赋值，在运算
        System.out.println(b++);
        System.out.println(b);

        int c = 10;
        // ++c 先运算，再赋值
        System.out.println(++c);
        System.out.println(c);

    }
}
