package day02.sdatement.loop;

/**
 * do while 循环
 *
 * @author icas-tt
 */
public class DoWhileState {
    public static void main(String[] args) {
        testFunction();
    }

    public static void testFunction() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 20);
    }
}
