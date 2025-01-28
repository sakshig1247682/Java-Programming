
class Engine{
    public void petrolEngine(){
        System.out.println("petrol engine");
    }
}

public class HAS_A_RELATIONSHIP {
    public static void main(String[] args) {
        //HAS_A_RELATIONSHIP
        // here ,we can class using  refrence variable .


        Engine e = new Engine(); 
        e.petrolEngine();

    }
}



// HAS-A- RELATIONSHIP IS ALSO KNOWN as agregation and composition.
// THere is no specific keyword to implement hAS-a relationship. but most of the time we are depending on new keyword .
// The main advantage of has-a relationship is reusibility of the code 
// HAS-A- RELATIONSHIP is a type of association where one class has a reference to another class. It is a "has a" relationship. It is a "is a" relationship


// AGREGATION - Independent - Both are independent on each other.
// Aggregation is a special type of HAS-A relationship where the child object can exist independently of the parent object. In other words, the child object has a life of its own. It is a "has a" relationship.

// COMPOSITION - Dependent - Both are dependent on each other.
// Composition is a special type of HAS-A relationship where the child object cannot exist independently of the parent object. In other words, the child object is dependent on the parent object for its existence.

// Example of agregation -
// A car has a engine. The engine can exist independently of the car. The car can run
// without the engine. The engine can run without the car. The engine is a part of the
// car, but it is not the whole car. The engine is a component of the car.


// example of compostite
// A car has a engine. The engine cannot exist independently of the car. The car cannot run
// without the engine. The engine cannot run without the car. The engine is a part of the
// car, and it is the whole car. The engine is a component of the car.


// simple code Example of agregation  -
// class Engine{
//     public void petrolEngine(){
//         System.out.println("petrol engine");
//     }
// }
// class Car{
//     Engine e = new Engine();
//     public void runCar(){
//         e.petrolEngine();
//     }
// }
// class Main{
//     public static void main(String[] args) {
//         Car c = new Car();
//         c.runCar();
//     }
// }
// simple code Example of compostite  -
// class Engine{
//     public void petrolEngine(){
//         System.out.println("petrol engine");
//     }
// }
// class Car{
//     Engine e = new Engine();
//     public void runCar(){
//         e.petrolEngine();
//     }
//     public void stopCar(){
//         e = null;
//     }
// }
// class Main{
//     public static void main(String[] args) {
//         Car c = new Car();
//         c.runCar();
//         c.stopCar();
//     }
// }



///////////////////////////////////////////////////////