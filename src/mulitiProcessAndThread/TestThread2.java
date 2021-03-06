package mulitiProcessAndThread;

class TestThread2 extends Thread{

    public void run(){
        while(true){
            System.out.println("TestThread2" + " is runing");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
                System.out.println();
            }
        }
    }
}
