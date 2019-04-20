package com.tfx.hello.state;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2019-04-20 15:12
 */
public interface Context {
    //设置时间
    void setClock(int hour);

    //改变状态
    void changeState(State state);

    //联系警报中心
    void callSecurityCenter(String msg);

    //在警报中心留下记录
    void recordLog(String msg);
}
