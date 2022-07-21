package dat02.basic;

/**
 * 数据类型
 *
 * @author SYX
 */
public class DataType {
    public static void main(String[] args) {
        /*
        数值：整型，浮点型
        1字节=8个bit位

        */
        /*
        整型：
        byte:1字节
        short:2字节
        int:4字节
        long:8字节
        */
        byte b = 10;
        // b = b + 120;
        System.out.println(b);
        short s = 200;
        int i = 1000;
        long l = 100000000000000000L;


        /*
        浮点型
        小数默认看成double类型
        */
        float f = 12.34f;
        double d = 13.25;

        /*
        布尔类型
        Java中并不是非0即为真
        */
        boolean b1 = true;
        boolean b2 = false;

        /*
        字符型
         */
        char c1 = 'A';
        char c2 = '你';
        char c3 = '\u0061';
        System.out.println(c3);
        // 字符型和数值型可以转换
        char c4 = 97;
        int a = 'a';
        System.out.println(c4);
        System.out.println(a);
    }
}
