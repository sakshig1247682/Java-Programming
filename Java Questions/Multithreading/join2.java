class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class join2 { 
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
            // Thread.sleep(1000);
        }
        
        t.start();
        t.join(); 

    }
}
