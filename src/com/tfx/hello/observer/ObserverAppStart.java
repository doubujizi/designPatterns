package com.tfx.hello.observer;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-04-13 14:58
 */
public class ObserverAppStart {
    public static void main(String[] args) {
        NumberGenerator numberGenerator=new RandomNumberGenerator();
        Observer observer=new DigitObserver();
        Observer observer1 = new GraphObserver();
        numberGenerator.addObserver(observer);
        numberGenerator.addObserver(observer1);
        numberGenerator.execute();
    }
}
