package day02.func;

/**
 * @author SYX
 */
public class FuncDef {
    /**
     * 入口函数
     */
    public static void main(String[] args) {
        int s = add(50, 60);
        int o = add(7, 8);
        if (s > 100) {
            System.out.println("好大！");
        }

        /*
        int m = 1, n = 2;
        int sum = m + n;
        System.out.println(sum);

        if (sum > 100) {
            System.out.println(100);
        }
         */

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double add(int a, double b) {
        return a + b;
    }

    public static double add(double a, int b) {
        return a + b;
    }

    public static String add(char a, int b) {
        return String.format("%s%d", a, b);
    }

    // public static Object add(Object a, Object b) {
    //     if (a.getClass() == 0) {
    //         return a;
    //     }
    //
    //
    //     return a;
    // }


}
