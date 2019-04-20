package com.tfx.hello.state;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-04-20 15:11
 */
public interface State {
    //设置时间
    void doClock(Context context, int hour);

    //使用金库
    void doUse(Context context);

    //按下警铃
    void doAlarm(Context context);

    //正常通话
    void doPhone(Context context);
}
