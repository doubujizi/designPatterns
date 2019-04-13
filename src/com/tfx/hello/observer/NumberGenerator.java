package com.tfx.hello.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-04-13 14:32
 */
public abstract class NumberGenerator {
    //保存Obsever们
    private List observers= new ArrayList();
    //注册Observer
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    //删除Observer
    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }
    //向Observer发送通知
    public void notifyObserver(){
        Iterator iterator =observers.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(this);
        }
    }
    //获取数值
    public abstract int getNumber();
    //生成数值
    public abstract void execute();
}
