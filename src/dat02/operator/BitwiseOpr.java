package dat02.operator;

/**
 * 位运算
 *
 * @author icas-tt
 */
public class BitwiseOpr {
    public static void main(String[] args) {
        // 4
        System.out.println(6 & 4);
        System.out.println(7 | 3);
        System.out.println(7 ^ 4);

        // 取反
        System.out.println(~7);


        // 移位 <<(左移), >>(右移)
        System.out.println(6 << 2);
        System.out.println(6 >> 2);
    }
}
