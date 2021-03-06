package mulitiProcessAndThread.anonymousClass;

import mulitiProcessAndThread.RunnableCode.RunnableImple;

public class Demo01InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        //new myThread().start();

        new Thread() {
            //重写run方法
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "---->" + "111");
                }
            }
        }.start();

        //线程的接口Runnable
        //RunnableImple r = new RunnableImple(); //多态
        Runnable r = new Runnable() {
            //重写run方法
            @Override
            public void run(){
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "---->" + "222");
                }
            }
        };
        new Thread(r).start();

        //简化接口方式
        new Thread(
                new Runnable() {
                    //重写run方法
                    @Override
                    public void run(){
                        for (int i = 0; i < 20; i++) {
                            System.out.println(Thread.currentThread().getName() + "---->" + "333");
                        }
                    }
                }
        ).start();
    }
}
