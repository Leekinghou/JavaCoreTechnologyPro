package mulitiProcessAndThread.RunnableCode;

public class RunnableImple2 implements Runnable{
    public void run(){
        for(int i = 0;i < 20;i++){
            System.out.println("Hello World!");
        }
    }
}
