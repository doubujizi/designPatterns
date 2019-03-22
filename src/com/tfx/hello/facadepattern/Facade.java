package com.tfx.hello.facadepattern;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-03-22 10:47
 */
public class Facade {
    SystemA systemA = new SystemA();
    SystemB systemB = new SystemB();
    SystemC systemC = new SystemC();

    public void facadeWrapOpration() {
        systemA.operationA();
        systemB.operationB();
        systemC.operationC();
    }
}
