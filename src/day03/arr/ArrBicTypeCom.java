package day03.arr;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 对比基本数据类型和引用数据类型
 *
 * @author SYX
 */
public class ArrBicTypeCom {
    public static void main(String[] args) {
        int m = 5, n = 6;
        change(m, n);
        System.out.printf("m: %d, n: %s%n", m, n);

        System.out.println("----------");
        int[] arr = {5, 6};
        change(arr);
        System.out.printf("arr[0]: %d, arr[1]: %s%n", arr[0], arr[1]);
        System.out.println("--------------");

        int a = 1;
        char b = 'A';
        String str = "asfdsa";
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println("str.length(): " + str.length());

        str.concat("sadas");
        System.out.println("str: " + str);
        System.out.println("str.startsWith(): " + str.startsWith("asfdsasadas"));
        System.out.println("str.contains(): " + str.contains("sa"));
        System.out.println("str.toUpperCase(): " + str.toUpperCase());
        System.out.println("str.toLowerCase(): " + str.toLowerCase());

        char[] chars = str.toCharArray();
        System.out.println("str.toCharArray(): " + Arrays.toString(str.toCharArray()));
        for (char c : chars) {
            System.out.println(c);
        }

        System.out.println("--------------");

        Scanner scanner = new Scanner(System.in);
        String str3 = scanner.next();
        System.out.println(str3);

    }


    /**
     * 数据交换
     */
    public static void change(int a, int b) {
        int c;
        c = a;

        a = b;
        b = c;
        System.out.printf("a: %d, b: %s%n", a, b);
    }

    public static void change(int @NotNull [] arr) {
        int c;
        c = arr[0];
        arr[0] = arr[1];
        arr[1] = c;
        System.out.printf("arr[0]: %d, arr[1]: %s%n", arr[0], arr[1]);
    }


}
