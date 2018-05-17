package com.liuqiwan;

/**
 * @author qiwan liu
 * @date 2018/5/17 16:46
 * @since CallBackDemo 1.0.0-SNAPSHOT
 */
public class Teacher implements Callback {

    public void askQuestion(Student student) {
        student.answerQuestion(this, 123, 456);
    }

    public void askQuestion(Thread thread) {
        thread.start();
    }

    @Override
    public void response(String string) {
        System.out.println(string);
    }
}


