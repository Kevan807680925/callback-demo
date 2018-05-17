package com.liuqiwan;

/**同步回调
 * @author qiwan liu
 * @date 2018/5/17 16:56
 * @since CallBackDemo 1.0.0-SNAPSHOT
 */
public class SyncCallbackTest {
    public static void main(String[] args) {
        Leader leader = new Leader();
        Developer xiaoming = new Developer("xiaoming");
        Developer xiaohong = new Developer("xiaohong");
        leader.assignTask(xiaoming);
        leader.assignTask(xiaohong);
    }
}
