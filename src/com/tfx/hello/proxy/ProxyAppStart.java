package com.tfx.hello.proxy;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-03-23 15:09
 */
public class ProxyAppStart {
    public static void main(String[] args) {
        Printable printable = new PrinterProxy("Alice");
        System.out.println("现在的名字是" + printable.getPrinterName() + "。");
        printable.setPrinterName("Bob");
        System.out.println("现在的名字是" + printable.getPrinterName() + "。");
        printable.print("Hello,world.");
    }
}
