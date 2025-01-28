// Interface - 
// 1. It is a contract between the developer and the compiler.
// 2. It is used to define the structure of the data type,function,contact,library,interface , event ,error,exception,transaction,block.

// Interface is use in place of multiple inheritence.

interface Engine{
    void carEngine();
    void truckEngine();

}

interface Bird{
    void fly();
}

public class Interface_Concept implements Engine,Bird{
    
    public static void main(String[] args) {
       Interface_Concept obj = new Interface_Concept();
       obj.carEngine();
       obj.truckEngine();
       obj.fly();
        
    }
    @Override
    public void fly() {
      System.out.println("Bird is flying");
    }

    @Override
    public void carEngine() {
       System.out.println("Car Engine is running");
    }

    @Override
    public void truckEngine() {
      System.out.println("Truck Engine is running");
    }
}
