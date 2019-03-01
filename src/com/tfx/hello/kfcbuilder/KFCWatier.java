package com.tfx.hello.kfcbuilder;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019/1/15 17:05
 */
public class KFCWatier {
    public Meal construct(MealBuilder mealBuilder){
        mealBuilder.builderDrink();
        mealBuilder.builderFood();
        return mealBuilder.getMeal();
    }
}
