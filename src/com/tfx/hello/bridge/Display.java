package com.tfx.hello.bridge;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-03-02 15:27
 */
public class Display {
    private DisplayImpl displayImpl;
    public Display(DisplayImpl displayImpl){
        this.displayImpl=displayImpl;
    }
    public void opean(){
        displayImpl.rawOpean();
    }
    public void print(){
        displayImpl.rawPrint();
    }
    public void close(){
        displayImpl.rawClose();
    }
    public final void display(){
        opean();
        print();
        close();
    }
}
