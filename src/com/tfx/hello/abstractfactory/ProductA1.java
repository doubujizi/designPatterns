package com.tfx.hello.abstractfactory;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018/12/27 9:34
 */
public class ProductA1 implements AbstractProductA {
    public ProductA1() {
        System.out.println("生产出了产品A1使用型");
    }

    @Override
    public void use() {
    }
}
