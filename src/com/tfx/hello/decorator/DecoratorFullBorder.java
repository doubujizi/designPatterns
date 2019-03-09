package com.tfx.hello.decorator;

import java.util.stream.IntStream;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-03-09 16:35
 */
public class DecoratorFullBorder extends DecoratorBorder {
    public DecoratorFullBorder(DecoratorDisplay decoratorDisplay) {
        super(decoratorDisplay);
    }

    @Override
    public int getColumns() {
        return 1 + decoratorDisplay.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return 1 + decoratorDisplay.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            //下边框
            return "+" + makeLine('-', decoratorDisplay.getColumns()) + "+";
        } else if (row == decoratorDisplay.getRows() + 1) {
            //上边框
            return "+" + makeLine('-', decoratorDisplay.getColumns()) + "+";
        } else {
            //其他边框
            return "|" + decoratorDisplay.getRowText(row - 1) + "|";
        }
    }

    private String makeLine(char ch, int count) {
        StringBuffer stringBuffer = new StringBuffer();
        IntStream.range(0, count).forEach(i -> stringBuffer.append(ch));
        return stringBuffer.toString();
    }
}
