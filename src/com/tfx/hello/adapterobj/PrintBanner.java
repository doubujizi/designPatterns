package com.tfx.hello.adapterobj;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019/2/2 17:08
 */
public class PrintBanner extends Print {
    private Banner banner;
    public PrintBanner(String string) {
        this.banner =new Banner(string);
    }



    @Override
    public void printWeek() {
        banner.showWithAster();
    }

    @Override
    public void pringString() {
        banner.showWithParen();
    }
}
