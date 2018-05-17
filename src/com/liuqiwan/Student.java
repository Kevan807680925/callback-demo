package com.liuqiwan;

/**
 * @author qiwan liu
 * @date 2018/5/17 16:47
 * @since CallBackDemo 1.0.0-SNAPSHOT
 */
public class Student {

    private String name;

    void answerQuestion(Callback callback, int a, int b) {
        callback.response(this.name + " say " + a + " + " + b + " = " + add(a, b));
    }

    private int add(int a, int b) {
        try {
            // 假装在思考
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a + b;
    }

    public Student(String name) {
        this.name = name;
    }
}
