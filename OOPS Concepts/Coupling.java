class A{
 static int k=B.j;
}
class B{
static int j=C.i;
}
class C{
static int i=D.m1();
}
class D{
    public static int m1(){
        return 10;
    }

}
public class Coupling extends D {
    public static void main(String[] args) {
      
    }
}

// If dependency is more then this is consider as tightly coupling and if dependecy is less then it is considered as Loosyly coupling.

// Tightly coupling is not a good programming practice because it has several disadvantages -
// 1. It is difficult to maintain the code.
// 2. It is difficult to reuse the code.
// 3. It is difficult to test the code.




