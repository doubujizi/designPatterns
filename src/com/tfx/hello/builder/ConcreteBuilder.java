package com.tfx.hello.builder;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019/1/15 16:10
 */
public class ConcreteBuilder implements Builder {
    @Override
    public void bulidPartA() {
        System.out.println("A部件生产出来");
    }

    @Override
    public void bulidPartB() {
        System.out.println("B部件生产出来");
    }

    @Override
    public void bulidPartC() {
        System.out.println("C部件生产出来");
    }

    @Override
    public Product getResult() {
        System.out.println("准备组装");
        return new Product();
    }
}
