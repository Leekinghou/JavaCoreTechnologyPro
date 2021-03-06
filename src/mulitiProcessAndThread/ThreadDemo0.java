package mulitiProcessAndThread;

public class ThreadDemo0 {
    public static void main(String []args)throws Exception{
        new TestThread0().run();
        while(true){
            System.out.println("main thread is running");
            Thread.sleep(10);
        }
    }

}
