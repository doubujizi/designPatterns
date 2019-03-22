package com.tfx.hello.facadepattern;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-03-22 10:58
 */
public class AppStart {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.facadeWrapOpration();
    }
}
