package com.tfx.hello;

/**
 * @author tianfuxian
 * @Description: 工厂类中含有必要的判断逻辑，可以决定什么时候创建哪一个产品的实例，客户端可以免除直接创建产品对象的责任
 * 而仅仅"消费"产品； 简单工厂模式实现了对责任的分割。它提供了专门的工厂类用于创建对象。
 * @Date: 2018/12/20 15:55
 */
public class Factory {
    /**
     * 客户端无需知道创建的具体产品类的类名，只需要知道具体产品类所对应的参数即可，对于一些复杂的类名，
     * 通过简单工厂模式可以减少使用者的记忆量
     *
     */
    public Product createProduct(String type){
        if(type.equals("A")){
            return new ConcreteProductA();
        }else if(type.equals("B")){
            return new ConcreteProductB();
        }
        return null;
    }
    /*
    * 由于工厂类集中了所有产品创建逻辑，一旦不能正常工作，整个系统都要受到影响
    * 使用简单工厂模式将会增加系统中类的个数，在一定程度上增加了系统的复杂度和理解难度
    * 系统扩展困难，一旦添加新的产品就需要修改工厂逻辑，产品类型过多时，造成工厂逻辑过于复杂，
    * 不利于系统扩展和维护
    * 简单工厂模式使用了静态工厂方法，造成工厂角色无法形成基于继承的等级结构
     */
}
