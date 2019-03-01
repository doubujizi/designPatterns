package com.tfx.hello;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018/12/20 15:57
 */
public class AppStart {
    public static void main(String[] args) {
        Factory factory=new Factory();
        factory.createProduct("A");
        factory.createProduct("B");
    }
}
