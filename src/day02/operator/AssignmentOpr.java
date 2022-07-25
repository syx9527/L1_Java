package day02.operator;

/**
 * 赋值运算
 *
 * @author icas-tt
 */
public class AssignmentOpr {
    public static void main(String[] args) {
        int a = 3;
        // --->a=a+5
        a += 5;

        byte s = 3;
        // 不需要强转，内部做了自动类型转换
        s += 2;
        System.out.println(s);

    }
}
