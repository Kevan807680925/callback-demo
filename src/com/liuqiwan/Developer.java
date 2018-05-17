package com.liuqiwan;

/**
 * @author qiwan liu
 * @date 2018/5/17 16:47
 * @since CallBackDemo 1.0.0-SNAPSHOT
 */
public class Developer {
    private String name;

    void doTask(Callback callback) {
        try {
            // 假装在认真工作
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        callback.receiveNotification(this.name + " completed the task.");
    }

    public Developer(String name) {
        this.name = name;
    }
}
