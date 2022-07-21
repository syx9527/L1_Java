package dat02.operator;

/**
 * 逻辑运算符： &, |, !, ^, &&, ||
 *
 * @author icas-tt
 */
public class LogicalOpr {
    public static void main(String[] args) {
        System.out.println(5 > 4 && 5 > 3);
        System.out.println(5 < 4 || 5 > 3);

        System.out.println(!(5 > 4));

        System.out.println(5 < 4 ^ 5 > 3);

        System.out.println("-----------------");


        int a = 10, b = 20;
        System.out.println(a < 9 && b++ > 10);
        System.out.println(b);

        b = 20;
        System.out.println(a < 9 & b++ > 10);
        System.out.println(b);
        System.out.println("-----------------");

        // 位运算


    }
}
