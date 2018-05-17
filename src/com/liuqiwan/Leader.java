package com.liuqiwan;

/**
 * @author qiwan liu
 * @date 2018/5/17 16:46
 * @since CallBackDemo 1.0.0-SNAPSHOT
 */
public class Leader implements Callback {

    public void assignTask(Developer student) {
        student.doTask(this);
    }

    public void assignTask(Thread thread) {
        thread.start();
    }

    @Override
    public void receiveNotification(String string) {
        System.out.println(string);
    }
}


