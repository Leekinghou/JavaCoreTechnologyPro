package mulitiProcessAndThread.Synchronized;

/*
模拟卖票
创建三个线程，同时开启，对共享的票进行出售

解决线程安全问题：重复票和不存在票
方案：使用同步代码块

格式：
    synchronized(锁对象){
        可能会出现线程安全问题的代码（访问了共享数据的代码）
    }

注意：
    1. 通过代码块中的锁对象，可以使用任意的对象 Object obj = new Object();
    2. 但是必须保证多个线程使用的锁对象是同一个
    3. 锁对象作用：
        把同步代码块锁住，只让一个线程在同步代码块中执行
 */
public class Demo01Ticket {
    public static void main(String[] args) {
        //创建runnable接口实现类
        RunnableImpl run = new RunnableImpl();

        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run); //开启了3个线程一起抢夺CPU执行权
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        //调用start方法开启多线程
        t0.start();
        t1.start();
        t2.start();

        //有问题，线程不安全
    }
}
