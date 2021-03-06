package mulitiProcessAndThread.Thread;

//1. 创建一个Thread类的子类
public class MyThread extends Thread{
    public MyThread(){}


    //用父类的带参构造方法，把线程名称传递给父类，让父类（Thread)给子线程起一个名字
    public MyThread(String name) {
        super(name);
    }
    //2. 在Thread类的子类中重写Thread类中的run方法，设置线程任务（开启线程要做什么？)
    @Override
    public void run(){
        for(int i = 0;i < 20 ;i++){
            System.out.println("run:" + i);
        }
    }
}
