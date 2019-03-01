package com.tfx.hello.adapter;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019/2/2 16:47
 */
public class AppStart {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeek();
        p.printStrong();
    }
}
