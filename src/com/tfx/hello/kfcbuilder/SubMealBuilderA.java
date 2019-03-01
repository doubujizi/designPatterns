package com.tfx.hello.kfcbuilder;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019/1/15 17:00
 */
public class SubMealBuilderA implements MealBuilder{
    @Override
    public void builderDrink() {
        System.out.println("可乐");
    }

    @Override
    public void builderFood() {
        System.out.println("炸鸡");
    }

    @Override
    public Meal getMeal() {
        return null;
    }
}
