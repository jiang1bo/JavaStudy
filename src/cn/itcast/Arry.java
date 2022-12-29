package cn.itcast;

import java.util.Arrays;
import java.util.Random;

public class Arry {
    public static void main(String[] args) {
        m();
    }

    public static void m() {
        //int anInt;
        int[] a = new int[10];//生成一个长度为10的整型数组
        Random r = new Random();//生成一个随机生成器
        for (int i = 0; i < a.length; i++) {//循环遍历将生成的数存储进数组中
            int anInt = r.nextInt(100);
            a[i] = anInt;
        }
        System.out.println("生成的数组"+ Arrays.toString(a));//生成的数组


        //冒泡排序
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j]<a[j+1]){
                    int p =a[j];
                    a[j]=a[j+1];
                    a[j+1]=p;
                }
            }
        }
        System.out.println("排序后的数组为"+Arrays.toString(a));
    }
}
