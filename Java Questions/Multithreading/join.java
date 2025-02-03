class MyThread extends Thread{
        public void run(){
            for(int i=0;i<5;i++){
                System.out.println(" Child Thread");
                try{
                    Thread.sleep(1000);
                } catch(InterruptedException e){

                }
            }
       }
    }
    
public class join {
    
        public static void main(String[] args)throws InterruptedException {
            MyThread t= new MyThread();
            t.start();
            t.join();
    
            Thread.currentThread().setPriority(10);
            for(int i=0;i<5;i++){
                System.out.println("Main Thread");
            }
        }
    }
    

