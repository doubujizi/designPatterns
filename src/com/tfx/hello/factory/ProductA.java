package com.tfx.hello.factory;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018/12/21 11:37
 */
public class ProductA implements Product {
    public ProductA() {
        System.out.println("创建一个产品A");
    }

    @Override
    public void test() {
        System.out.println("我是一个产品A");
    }
}
