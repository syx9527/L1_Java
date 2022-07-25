package day02.sdatement.branch;

import java.util.Random;

/**
 * if 分支
 *
 * @author icas-tt
 */
public class IfState {
    public static void main(String[] args) {
        int score;
        char grade;
        Random r = new Random();
        score = r.nextInt(100);
        System.out.println("Your score is " + score);
        grade = scoreFloor(score);
        System.out.println(grade);
    }

    public static char scoreFloor(int score) {
        if (score >= 90) {
            // System.out.println("Good!");
            return 'A';
        } else if (score >= 60) {
            // System.out.println("You will be good.");
            return 'B';
        } else {
            // System.out.println("Try yourself!");
            return 'C';
        }

    }
}

