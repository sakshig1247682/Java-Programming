class A1 {
    private int age;
    private String name;

    public void set(int a, String n) {
        age = a;
        name = n;
    }

    void print() {
        System.out.println(age);
        System.out.println(name);
    }
}

class B1 extends A1 {

    public void display() {
        B1 b = new B1();
        System.out.println("Age is ");
        b.print();
        System.out.println("Name is ");
    }
}
class C1 extends B1 {
    void show() {
        System.out.println("This concept is multiple inheritence");
    }
}

public class IS_A_RElationship extends C1 {

    public static void main(String[] args) {
        IS_A_RElationship obj = new IS_A_RElationship();
        obj.set(20, "Ram");
        obj.display();
        obj.show();
        obj.print();
    }
}

//
