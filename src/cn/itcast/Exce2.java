package cn.itcast;

import java.util.Random;
import java.util.Scanner;

public class Exce2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        while (true) {
            System.out.print("请输入数字：");
            try {
                temp = sc.nextInt();
            } catch (Exception e) {
                System.out.println("请认真输入，请必须输入数字。");
                sc.next();
                continue;
            }
            if (temp > num) {
                System.out.println("太大了");
            } else if (temp < num) {
                System.out.println("太小了");
            } else {
                System.out.println("恭喜，猜对了.");
                break;
            }
        }
    }
}
