package com.tfx.hello.bridge;

import java.util.stream.IntStream;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-03-02 15:45
 */
public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rawOpean() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" +string +"|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        IntStream.range(0,width).forEach(i-> System.out.print("-"));
        System.out.println("+");
    }
}
