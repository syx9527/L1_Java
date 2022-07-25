package work.basic;

import java.util.Scanner;

/**
 * 有一对兔子，从出生后第3个月起，每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子。
 * 假如兔子都不死，问每个月的兔子总数为多少？
 *
 * @author SYX
 */
public class Test02 {
    public static void main(String[] args) {
        int a = 1, b = 1, temp;
        int n;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i < 3) {
                System.out.printf("第%d个月的兔子对数:1%s", i, (i == n ? "" : "\n"));
            } else {
                temp = b;
                b = a + b;
                a = temp;
                System.out.printf("第%d个月的兔子对数:%d%s", i, b, (i == n ? "" : "\n"));
            }

        }
    }


}
