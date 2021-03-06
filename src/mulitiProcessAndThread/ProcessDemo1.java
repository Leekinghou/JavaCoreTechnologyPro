package mulitiProcessAndThread;

public class ProcessDemo1 {
    public static void main(String []args){
        while(true){
            int a = (int) (Math.random() * 100);
            System.out.println(" main thread is running " + a);
            try{
                Thread1.sleep(5000);
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
