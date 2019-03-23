package com.tfx.hello.proxy;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-03-23 14:21
 */
public interface Printable {
    void setPrinterName(String name);

    String getPrinterName();

    void print(String string);

}
