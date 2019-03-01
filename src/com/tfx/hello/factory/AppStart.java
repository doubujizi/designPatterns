package com.tfx.hello.factory;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018/12/21 11:39
 */
public class AppStart {
    public static void main(String[] args) {
        Factory factory = new FactoryA();
        Product product = factory.getNewProduct();
        product.test();
    }
}
