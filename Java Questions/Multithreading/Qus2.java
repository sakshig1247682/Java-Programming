//Runable Interface

class MyThread implements Runnable {

    static MyThread mt;
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Sakshi");
        }
    }
}
class MyThread1 implements Runnable {

    static MyThread mt;

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Second Thread");
        }
    }
}

public class Qus2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread1 t2 = new MyThread1();
        Thread thread = new Thread(t1);
        Thread thread1 = new Thread(t2);
        thread.start();
        thread1.start();
        System.out.println(thread.getName());
        System.out.println(thread1.getName());
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread 5 baar");
        }

        Thread.currentThread().setName("Current Thread");
        System.out.println(Thread.currentThread().getName());

        System.out.println("Priority of thread : " + thread.getPriority());
        System.out.println("Priority of thread1 : " + thread1.getPriority());
        System.out.println("Priority of Main : " + Thread.currentThread().getPriority());

    }
}
