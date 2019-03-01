package com.tfx.hello.adapterobj;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019/2/2 17:09
 */
public class AppStart {
    public static void main(String[] args) {
        Print p =new PrintBanner("Hello");
        p.printWeek();
        p.pringString();
    }

}
