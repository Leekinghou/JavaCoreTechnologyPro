package mulitiProcessAndThread;

public class ThreadDemo1 {
    public static void main(String []args)throws Exception{
        new TestThread1().start();
        while(true){
            System.out.println("main thread is running");
            Thread1.sleep(1000);
        }
    }
}

class TestThread1 extends Thread1 {
    public void run(){
        while(true){
            System.out.println(" TestThread1 is running");
            try {
                Thread1.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
