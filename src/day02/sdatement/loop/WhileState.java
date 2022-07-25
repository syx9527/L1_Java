package day02.sdatement.loop;

/**
 * While 循环
 *
 * @author icas-tt
 */
public class WhileState {
    public static void main(String[] args) {
        testFunction();
    }

    public static void testFunction() {
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
}
