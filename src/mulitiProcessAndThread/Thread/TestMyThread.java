package mulitiProcessAndThread.Thread;

public class TestMyThread {
    public static void main(String[] args) {
        //3. 创建Thread类的子类对象
        MyThread mt = new MyThread();

        new MyThread("hello").start();
        //4. 调用Thread类中的方法start方法，开启新的线程，执行run方法
        mt.start();
        for(int i = 0;i < 20 ;i++){
            System.out.println("main:" + i);
        }
    }

}
