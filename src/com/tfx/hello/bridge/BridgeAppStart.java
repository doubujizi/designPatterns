package com.tfx.hello.bridge;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-03-02 15:27
 */
public class BridgeAppStart {
    public static void main(String[] args) {
        Display display = new Display(new StringDisplayImpl("Hello,China"));
        Display display1 =new CountDisplay(new StringDisplayImpl("Hello,World"));
        CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl("Hello,Universe"));
        display.display();
        display1.display();
        countDisplay.display();
        countDisplay.multiDisplay(5);
    }
}
