package com.liuqiwan;

/**
 * 异步回调
 * @author qiwan liu
 * @date 2018/5/17 16:56
 * @since CallBackDemo 1.0.0-SNAPSHOT
 */
public class AsyncCallbackTest {
    public static void main(String[] args) {
        Leader liu = new Leader();
        Developer xiaoming = new Developer("xiaoming");
        Developer xiaohong = new Developer("xiaohong");

        liu.assignTask(new DoJobThread(xiaoming, liu));
        liu.assignTask(new DoJobThread(xiaohong, liu));
    }

    static class DoJobThread extends Thread {
        private Developer student;
        private Leader teacher;

        @Override
        public void run() {
            student.doTask(teacher);
        }

        public DoJobThread(Developer student, Leader teacher) {
            this.student = student;
            this.teacher = teacher;
        }
    }
}

