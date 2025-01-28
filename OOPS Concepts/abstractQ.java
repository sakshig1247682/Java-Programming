abstract class A{
    public void show(){
        System.out.println("show");
    }
    public  void show1(){
        System.out.println("show1");
    }
    abstract void display();
}
    
public class abstractQ extends A {
   public static void main(String[] args) {
    A a = new abstractQ();
    a.show();
    a.show1();
    a.display();
   } 
   void display(){
    System.out.println("display");
    }
}
