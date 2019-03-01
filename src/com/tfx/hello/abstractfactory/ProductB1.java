package com.tfx.hello.abstractfactory;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018/12/27 9:35
 */
public class ProductB1 implements AbstractProductB {
    public ProductB1() {
        System.out.println("生产出了产品B1食用型");
    }

    @Override
    public void eat() {

    }
}
