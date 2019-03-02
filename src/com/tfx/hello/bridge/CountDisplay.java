package com.tfx.hello.bridge;

import java.util.stream.IntStream;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-03-02 15:38
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    @Override
    public void opean() {
        super.opean();
    }

    @Override
    public void print() {
        super.print();
    }

    @Override
    public void close() {
        super.close();
    }

    public void multiDisplay(int times){
        opean();
        //循环显示 times次
        IntStream.range(0,times).forEach(i-> print());
        close();
    }
}
