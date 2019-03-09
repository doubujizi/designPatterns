package com.tfx.hello.decorator;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-03-09 16:26
 */
public class DecoratorStringDisplay extends DecoratorDisplay {
    private String string;

    public DecoratorStringDisplay(String string) {
        this.string = string;
    }

    //字符数
    @Override
    public int getColumns() {
        return string.getBytes().length;
    }

    //行数
    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
