public class Polimorphism {
    public static int addme(int x,int y){
        return x+y;
    }
    public static float addme(int x,float y){
        return x+y;
    }

    public static void main(String[] args) {
        
       
System.out.println(Polimorphism.addme(2,2.5f));
System.out.println( Polimorphism.addme(2,2));

    }
}


// IN java method signature consist of method names followed by argument type return type is not part of method signature in java 
// EX->  public static int addme(int x,int y);
// here addme(int x,int y) is 

// COmpiler will use method signature to resolve method calls.
// within a class two with same signature not allow 


// Types of polimorphism -
// 1. Compile time polimorphism - Overloading
// 2. Runtime polimorphism - Overriding



// OVERRIDING - for this, methods have to be same name
// Whatever method parents has by default available to the child through inheritence ,if child class not satisfied with parent class implementaion then child is allow to redefine that method ,based on our requiment ,this process is called overriding .
// EX->
// class A{
//     public void display(){
//         System.out.println("Hello");
//     }
// }
// class B extends A{
//     public void display(){
//         System.out.println("Hi");
//     }
// }
// here display() method is overriden in class B

//NOtes- In overriding method resolution always take care by JVM based on run time object. and hence overiding is also considered as runtime polimorphism , dynamic polimorphism , late binding .


// OVERLOADING - in this method resolution always take care by compiler , this is also consided as compiltime polimorphism or static polimorphism or early binding.




