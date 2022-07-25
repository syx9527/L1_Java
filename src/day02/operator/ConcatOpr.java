package day02.operator;

/**
 * 连接符: +
 *
 * @author icas-tt
 */
public class ConcatOpr {
    public static void main(String[] args) {
        System.out.println("sad" + "srt");
        System.out.println("hello" + 5);
        System.out.println("----------");

        int m = 1, n = 2;
        System.out.println(m + n);
        System.out.println(m + n + "");
        System.out.println("" + m + n);
    }
}
