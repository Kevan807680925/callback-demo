package com.liuqiwan;

/**
 * 异步回调
 * @author qiwan liu
 * @date 2018/5/17 16:56
 * @since CallBackDemo 1.0.0-SNAPSHOT
 */
public class AsyncCallbackTest {
    public static void main(String[] args) {
        Teacher liu = new Teacher();
        Student xiaoming = new Student("xiaoming");
        Student xiaohong = new Student("xiaohong");

        liu.askQuestion(new AskThread(xiaoming, liu, 12, 123));
        liu.askQuestion(new AskThread(xiaohong, liu, 12, 123));
    }
}

class AskThread extends Thread {

    private Student student;

    private Teacher teacher;

    private int a;

    private int b;

    @Override
    public void run() {
        student.answerQuestion(teacher, a, b);
    }

    public AskThread(Student student, Teacher teacher, int a, int b) {
        this.student = student;
        this.teacher = teacher;
        this.a = a;
        this.b = b;
    }
}