package day02.work.basic;


import java.util.Scanner;

/**
 * 利用条件运算符额嵌套完成此题：
 * score
 * >=90    ->  A;
 * 60-89   ->  B;
 * <60     ->  C.
 *
 * @author icas-tt
 */
public class Test3 {
    public static void main(String[] args) {
        int n;
        char grade;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter student score: ");
        n = s.nextInt();

        grade = score(n);
        System.out.println(grade);



    }

    public static char score(int n) {
        return (n >= 90) ? 'A' : n >= 60 ? 'B' : 'C';
    }
}
