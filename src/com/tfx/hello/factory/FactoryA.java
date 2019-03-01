package com.tfx.hello.factory;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018/12/21 11:36
 */
public class FactoryA implements Factory {
    @Override
    public Product getNewProduct() {

            return new ProductA();

    }
}
