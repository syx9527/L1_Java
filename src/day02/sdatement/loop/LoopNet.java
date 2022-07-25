package day02.sdatement.loop;

import java.util.Random;
import java.util.Scanner;

/**
 * @author icas-tt
 */
public class LoopNet {
    public static void main(String[] args) {
        int a, b;
        Random r = new Random();
        a = r.nextInt(8);
        b = r.nextInt(12);
        System.out.println(a + "," + b);
        testFunction(a, b);
    }

    public static void testFunction(int a, int b) {
        /*
         ********
         ********
         ********
         ********
         */
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print('*');
            }
            if (i < a - 1) {
                System.out.println();
            }
        }
    }
}
