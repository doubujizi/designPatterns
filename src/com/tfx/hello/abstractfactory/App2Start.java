package com.tfx.hello.abstractfactory;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018/12/27 9:22
 */
public class App2Start {
    public static void main(String[] args) {
        AbstractFactory abstractFactory=new ConcreteFactory1();
        AbstractFactory abstractFactory1=new ConcreteFactory2();
        abstractFactory.createProductA();
        abstractFactory.createProductB();
        abstractFactory1.createProductA();
        abstractFactory1.createProductB();

    }
}
