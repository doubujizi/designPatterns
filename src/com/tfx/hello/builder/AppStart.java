package com.tfx.hello.builder;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019/1/15 16:06
 */
public class AppStart {
    public static void main(String[] args) {
         Builder builder =new ConcreteBuilder();
         Director  director = new Director();
         director.constuct(builder);

    }
}
