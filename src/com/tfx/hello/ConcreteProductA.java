package com.tfx.hello;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018/12/20 16:02
 */
public class ConcreteProductA implements Product {
    public ConcreteProductA() {
        System.out.println("我调用了默认的构造方法A");
    }
    public ConcreteProductA(String type) {
        System.out.println("我调用了传参构造方法A");
    }

    @Override
    public void test() {

    }
}
