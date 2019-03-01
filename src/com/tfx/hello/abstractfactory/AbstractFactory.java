package com.tfx.hello.abstractfactory;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018/12/27 9:23
 */
public interface AbstractFactory {
    AbstractProductA createProductA();
    AbstractProductB createProductB();
}
