package com.tfx.hello.abstractfactory;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018/12/27 9:34
 */
public class ProductA2 implements AbstractProductA {
    public ProductA2() {
        System.out.println("生产出了产品A2使用型");
    }
    @Override
    public void use() {
        System.out.println("生产");
    }
}
