// Abstract class - 
// 1. Abstract class cannot be instantiated
// 2. Abstract class can have abstract methods and non-abstract methods
// 3. For using Abstract class , we can't directly call using obj in main , we have to inherite this class into main or child to use this class methods.



abstract class A{
 
    abstract void show();

    void display(){ // non-abstract method
        System.out.println("Hello");
        }

        
}

public class AbstractClass extends A{

    public static void main(String[] args) {
        AbstractClass obj = new AbstractClass();
        obj.display();
    }

    void show(){
        System.out.println("Abstract method");
    }
    
}


// Hiding internal implementation and just highlight the set of services we are offering is concept of Abstraction.
// For-EX -> Through BAnk ATM GUI Screen , abnk people are hightlighting the set of services what they are offering without highlighting internal implementation .

// ADAVANTAGE OF ABSTRACTION IS-
// 1.We can achive security brcause we are not highlighting  internal implemnation.
// 2. We can achive reusability because we are not highlighting internal implementation.
//2 .Without effecting outisde person , we can able to perform any type of changes in our internal system and hence inhencement wil become easy.
// 3. It improve mentanability of the application.
// 4. It improve easynness to use our system.
// 5.By using interface and abstract class we can implement abstraction.

