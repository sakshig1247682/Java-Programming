import java.util.Scanner;

 class MyThread extends Thread {//Define a multithreading
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Hellooo!!!!!");//Job Of Thread 
             }
     }
}
     class SecondThread extends Thread {
        public void run() {
            for(int i=0;i<5;i++){
                System.out.println("hyyyy!!!");
        }
    }
    
}
public class Qus1{
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        SecondThread t2=new SecondThread();
        t2.start();
        for(int i=0;i<5;i++){
            System.out.println("kese ho");
        }
    }

    
}