package com.tfx.hello.builder;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019/1/15 16:12
 */
public class Director {
    public Product constuct(Builder builder){
        builder.bulidPartA();
        builder.bulidPartB();
        builder.bulidPartC();
        return builder.getResult();
    }
}
