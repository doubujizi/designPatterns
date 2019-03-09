package com.tfx.hello.decorator;

import java.util.stream.IntStream;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-03-09 16:21
 */
public abstract class DecoratorDisplay {
    //获取横向字符数
    public abstract int getColumns();

    //获取纵向字符数
    public abstract int getRows();

    //获取第row行的字符串
    public abstract String getRowText(int row);

    public final void show() {
        IntStream.range(0, getRows()).forEach(i -> System.out.println(getRowText(i)));
    }

}
