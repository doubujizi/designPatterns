package com.tfx.hello.command;

import java.awt.*;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-03-30 14:13
 */
public class DrawCommand implements Command {
    //绘制对象
    private Drawable drawable;
    //绘制位置
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
