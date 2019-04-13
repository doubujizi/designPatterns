package com.tfx.hello.observer;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-04-13 14:47
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.println("DigitObserver:"+numberGenerator.getNumber());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
