package day02.sdatement.jumpcontrol;

import java.util.Scanner;

/**
 * @author icas-tt
 */
public class JumpControlState {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int a;
        Scanner s = new Scanner(System.in);
        while (true) {
            a = s.nextInt();
            System.out.println("您输入的是：" + a);
            if (a == 5) {
                System.out.println("ok!");
                // continue;  // 结束本次，继续下一次循环
                // 终止循环
                break;
            } else {
                System.out.println("请继续输入：");
            }
        }
    }
}
