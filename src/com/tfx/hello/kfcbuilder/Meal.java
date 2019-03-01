package com.tfx.hello.kfcbuilder;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019/1/15 16:56
 */
public class Meal {
    public Meal() {
        System.out.println("先生您的套餐好了");
    }
    private String food;
    private String drink;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
