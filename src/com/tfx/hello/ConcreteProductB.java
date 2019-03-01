package com.tfx.hello;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018/12/20 16:05
 */
public class ConcreteProductB implements Product{
    public ConcreteProductB() {
        System.out.println("我调用了默认的构造方法B");
    }
    public ConcreteProductB(String type) {
        System.out.println("我调用了传参构造方法B");
    }
    @Override
    public void test() {

    }
}
