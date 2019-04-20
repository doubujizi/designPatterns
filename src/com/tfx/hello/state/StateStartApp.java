package com.tfx.hello.state;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-04-20 16:07
 */
public class StateStartApp {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
