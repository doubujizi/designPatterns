package com.tfx.hello.factory;

/**
 * @author tianfuxian
 * @Description: 工厂方法模式中，工厂方法用来创建客户所需要的产品，同时还向客户隐藏了哪种具体产品类将被实例化这一细节，
 * 用户只需要关心产品对应的工厂，无须关心创建细节，甚至无须知道具体产品类的类名。
 * 基于工厂角色和产品角色的多态性设计是工厂方法模式的关键，它能够使工厂可以自主确定创建何种产品对象。
 * 而如何创建这个对象的细节则完全封装在具体工厂内部。工厂方法模式之所以又被称为多态工厂模式的另一个优点是
 * 在系统中加入新的产品时
 * @Date: 2018/12/21 11:32
 */
public interface Factory {
    Product getNewProduct();
}
