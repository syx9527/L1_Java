package day02.basic;

/**
 * 数据类型转换
 *
 * @author icas-tt
 */
public class DataTypeConvert {
    public static void main(String[] args) {
        // 容量小的-->容量大的

        // 隐式数据转换:计算时
        byte b = 1;
        int i = 2;
        int sum = i + b;

        // 赋值时
        int a = b;

        // 容量大的-->容量小的

        int m = 1;
        // java: 不兼容的类型: 从int转换到short可能会有损失
        // short s = m;

        // 强制转换
        short s = (short) m;

        // 还有数据溢出的风险
        int n = 999;
        byte x = (byte) n;
        System.out.println("x:" + x);
    }
}

