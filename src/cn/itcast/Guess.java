package cn.itcast;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100);
        System.out.println("All right");
        System.out.println("输入数字：");
        Scanner sc = new Scanner(System.in);
        int enterNumber = sc.nextInt();

        while(enterNumber != randomNumber){

            if(enterNumber>randomNumber) {

                System.out.println("sorry,有点大");
            }else {

                System.out.println("sorry，有点小");
            }

            System.out.println("输入你的数字：");
            enterNumber = sc.nextInt();
        }
        System.out.println("成功了！");
    }

}
