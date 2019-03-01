package com.tfx.hello.adapter;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019/2/2 16:53
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeek() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
