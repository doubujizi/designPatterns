package com.tfx.hello.adapterobj;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019/2/2 17:05
 */
public class Banner {
    public Banner(String string) {
        this.string = string;
    }
    private String string;


    public void showWithParen(){
        System.out.println("(" + string + ")");
    }
    public void showWithAster(){
        System.out.println("*" + string + "*");
    }
}
