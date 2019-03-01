package com.tfx.hello.abstractfactory;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018/12/27 9:29
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA2 createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB2 createProductB() {
        return new ProductB2();
    }
}
