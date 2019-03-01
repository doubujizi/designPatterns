package com.tfx.hello.builder;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019/1/15 11:13
 */
public interface Builder {
    void bulidPartA();
    void bulidPartB();
    void bulidPartC();
    Product getResult();
}
