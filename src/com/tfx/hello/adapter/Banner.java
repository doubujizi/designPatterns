package com.tfx.hello.adapter;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019/2/2 16:46
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
