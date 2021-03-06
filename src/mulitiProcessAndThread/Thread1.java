package mulitiProcessAndThread;

public class Thread1 extends Thread {
    public void run(){
        System.out.println("hello");
    }
    public static void main(String[]args){
        new Thread1.start();
    }

    private static class start {
    }
}
