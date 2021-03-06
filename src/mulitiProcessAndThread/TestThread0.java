package mulitiProcessAndThread;

public class TestThread0 {
    public void run(){
        System.out.println("RUN");
        while(true){
            System.out.println(" TestThread1 is running");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
