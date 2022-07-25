package day02.sdatement.jumpcontrol;

import java.util.Scanner;

/**
 * @author icas-tt
 */
public class JumpControlState {
    public static void main(String[] args) {

    }

    public static void test() {
        int a = 0;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println(a);
            a=s.nextInt();
            System.out.println("");
            if(a==5){
                System.out.println("ok!");
            }
        }
    }
}
