package day03.arr;

/**
 * 数组初始化
 * 数组长度固定不变
 *
 * @author SYX
 */
public class ArrDef {
    public static void main(String[] args) {
        // 动态初始化，只指定长度，未赋值
        int[] arr1 = new int[3];

        // 静态初始化
        int[] arr2 = {1, 2, 3};

        int[] arr3 = new int[]{1, 2, 3};

        //访问遍历
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
            System.out.println(arr1[i]);
        }
        System.out.println("-------");
        for (int i : arr1) {
            System.out.println(i);
        }
        // 索引越界异常
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4

        // System.out.println(arr2[4]);
    }
}
