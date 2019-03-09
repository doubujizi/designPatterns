package com.tfx.hello.decorator;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-03-09 16:32
 */
public class DecoratorSideBorder extends DecoratorBorder {
    //装饰边框的字符
    private char borderChar;

    public DecoratorSideBorder(DecoratorDisplay decoratorDisplay, char borderChar) {
        super(decoratorDisplay);
        this.borderChar = borderChar;
    }

    //字符数为字符串字符数加上 两侧边框字符数
    @Override
    public int getColumns() {
        return 1 + decoratorDisplay.getColumns() + 1;
    }

    //行数即被装饰物的行数
    @Override
    public int getRows() {
        return decoratorDisplay.getRows();
    }

    //指定的那一行的字符串为被装饰物的字符串 加上两侧的边框字符
    @Override
    public String getRowText(int row) {
        return borderChar + decoratorDisplay.getRowText(row) + borderChar;
    }
}
