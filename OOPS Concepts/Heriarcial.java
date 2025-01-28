// hybrid inheritence

class A{
    public void display1(){
        System.out.println("display1");
        }
}
class B extends A{
    public void display2(){
        System.out.println("display2");
    }
}
class C extends A{
    public void display3(){
        System.out.println("display3");
    }
}
class D extends C{
    public void display4(){
        System.out.println("display4");
        }
    }

public class Hybrid_Inheritence {
    public static void main(String[] args) {
        D d=new D();
        d.display1();
       
        d.display3();
        d.display4();

        B n=new B();
        n.display1();
        n.display2();
    }
}
