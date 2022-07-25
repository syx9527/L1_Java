package day02.sdatement.branch;

import java.util.Random;

/**
 * 表达式的值：byte, short, int, char, JDK5以后支持枚举， JDK8以后支持String.
 *
 * switch 分支
 *
 * @author icas-tt
 */
public class SwitchState {
    public static void main(String[] args) {
        Random r = new Random();
        int n;
        n = r.nextInt(6);
        // System.out.println(n);
        switchState(n);
    }

    public static void switchState(int n) {
        switch (n) {
            case 1: {
                System.out.println(1);
                break;
            }
            case 2: {
                System.out.println(2);
                break;
            }
            case 3: {
                System.out.println(3);
                break;
            }
            default:
                System.out.println("default:" + n);
        }
    }
}
