class Parent{
    public static void Shadi(){
        System.out.println("Arrange Marriage");
    }
}

public class Overriding extends Parent {
    public static void Shadi() {
        System.out.println("Love Marriage");
    }
    public static void main(String[] args) {
    Overriding.Shadi();

    }
}
