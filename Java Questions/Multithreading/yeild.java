class MyThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(" Child Thread");
        }
        Thread.yield();
}
}

public class yeild {   
    public static void main(String[] args) {
        MyThread t= new MyThread();
        t.setPriority(2);
        t.start();

        Thread.currentThread().setPriority(10);
        for(int i=0;i<5;i++){
            System.out.println("Main Thread");
        }
    }
}
