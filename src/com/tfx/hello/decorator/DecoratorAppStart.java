package com.tfx.hello.decorator;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-03-09 16:44
 */
public class DecoratorAppStart {
    public static void main(String[] args) {
        DecoratorDisplay decoratorDisplay = new DecoratorStringDisplay("Hello,world.");
        DecoratorDisplay decoratorDisplay1 = new DecoratorSideBorder(decoratorDisplay, '#');
        DecoratorDisplay decoratorDisplay2 = new DecoratorFullBorder(decoratorDisplay1);
        decoratorDisplay.show();
        decoratorDisplay1.show();
        decoratorDisplay2.show();
        DecoratorDisplay decoratorDisplay3 = new DecoratorSideBorder(
                new DecoratorFullBorder(
                        new DecoratorFullBorder(
                                new DecoratorSideBorder(
                                        new DecoratorFullBorder(
                                                new DecoratorStringDisplay("你好，世界.")
                                        ), '*')
                        )
                ), '/'
        );
        decoratorDisplay3.show();
    }
}
