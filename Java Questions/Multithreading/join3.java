class MYJoinThread extends Thread{
    static Thread mt;

    public void run(){

try {
    mt.join(); // Here join method usee for waiting this thread
} catch (Exception e) {
    throw new RuntimeException(e);
}

        for(int i=0;i<5;i++){
            System.out.println("Hello from MYJoinThread");

            try{
                Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println("Exception handled");
                    }
                }
            }
}

public class join3{
    public static void main(String[] args) throws InterruptedException {
        
        MYJoinThread.mt = Thread.currentThread();
        MYJoinThread t = new MYJoinThread();
        t.start();
        for(int i=0;i<4;i++){
            System.out.println("Mian Thread");
            Thread.sleep(500);

               }
    }
}
