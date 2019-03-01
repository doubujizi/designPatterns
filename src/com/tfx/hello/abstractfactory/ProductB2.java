package com.tfx.hello.abstractfactory;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018/12/27 9:35
 */
public class ProductB2 implements AbstractProductB {
    public ProductB2() {
        System.out.println("生产出了产品B2食用型");
    }

    @Override
    public void eat() {

    }
}
