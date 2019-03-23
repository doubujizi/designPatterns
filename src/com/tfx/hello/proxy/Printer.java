package com.tfx.hello.proxy;

import java.util.stream.IntStream;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-03-23 14:25
 */
public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("Printer的实例生成中");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Printer的实例生成中(" + name + ")");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }
    //显示带打印机名字的文字
    @Override
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    private void heavyJob(String msg) {
        System.out.print(msg);
        IntStream.range(0, 5).forEach(i -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.print(".");
        });
        System.out.println("结束。");
    }
}
