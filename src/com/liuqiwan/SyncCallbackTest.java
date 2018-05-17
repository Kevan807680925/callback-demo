package com.liuqiwan;

/**同步回调
 * @author qiwan liu
 * @date 2018/5/17 16:56
 * @since CallBackDemo 1.0.0-SNAPSHOT
 */
public class SyncCallbackTest {
    public static void main(String[] args) {
        Teacher liu = new Teacher();
        Student xiaoming = new Student("xiaoming");
        Student xiaohong = new Student("xiaohong");
        liu.askQuestion(xiaoming);
        liu.askQuestion(xiaohong);
    }
}
