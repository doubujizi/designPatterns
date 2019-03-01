package com.tfx.hello.kfcbuilder;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019/1/15 16:54
 */
public interface MealBuilder {
    void builderDrink();
    void builderFood();
    Meal getMeal();
}
