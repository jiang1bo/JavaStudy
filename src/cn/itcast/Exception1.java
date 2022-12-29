package cn.itcast;

public class Exception1 {
    public static void main(String[] args) {
        System.out.println("你好");

        try {
        int a = 3 / 0;
        System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("不为零");
        }

    }
}
