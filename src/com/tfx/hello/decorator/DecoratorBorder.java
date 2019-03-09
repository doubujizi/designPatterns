package com.tfx.hello.decorator;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-03-09 16:29
 */
public class DecoratorBorder extends DecoratorDisplay {
    //表示被装饰物
    public DecoratorDisplay decoratorDisplay;
    //生成实例
    public DecoratorBorder(DecoratorDisplay decoratorDisplay) {
        this.decoratorDisplay = decoratorDisplay;
    }

    @Override
    public int getColumns() {
        return 0;
    }

    @Override
    public int getRows() {
        return 0;
    }

    @Override
    public String getRowText(int row) {
        return null;
    }
}
