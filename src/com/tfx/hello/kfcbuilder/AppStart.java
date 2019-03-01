package com.tfx.hello.kfcbuilder;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019/1/15 16:54
 */
public class AppStart {
    public static void main(String[] args) {
        MealBuilder mealBuilder=new SubMealBuilderA();
        MealBuilder mealBuilder1=new SubMealBuilderB();
        KFCWatier kfcWatier=new KFCWatier();
       Meal meal= kfcWatier.construct(mealBuilder);
        Meal meal1= kfcWatier.construct(mealBuilder1);

    }
}
