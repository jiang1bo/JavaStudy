package cn.itcast;

import org.jsoup.Jsoup;

import javax.swing.*;
import java.io.IOException;

public class dict {
    public static void main(String[] args) throws IOException {
        String w = "美国";
//        有道翻译
//        String u = "https://youdao.com/result?word="+w+"&lang=en";
//        中国翻译英文
//        String ok = Jsoup.connect(u).get().select("a[class=point]").get(0).text();
//        英文翻译中国
//        String ok = Jsoup.connect(u).get().select("span[class=trans]").get(0).text();
//
//        微软词典
        w = JOptionPane.showInputDialog("请输入词汇：");
        String u = "https://cn.bing.com/dict/search?q=" + w;
        String ok = Jsoup.connect(u).get().select("span[class=def b_regtxt]").get(0).text();
        //System.out.println(ok);
        JOptionPane.showMessageDialog(null,ok);
    }
}
