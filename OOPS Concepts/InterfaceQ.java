//We use interface for supporting the multiple inheritance!!

interface Engine{
    public void carEngine();
    public void bikeEngine();
};

interface Birds extends Engine{
    public void fly();
};

public class InterfaceQ  implements Birds{
    public static void main(String[] args) {
        InterfaceQ obj = new InterfaceQ();
         obj.carEngine();
         obj.bikeEngine();
        obj.fly();
        
    }
    public void carEngine(){
        System.out.println("Car Engine");
    }
    public void bikeEngine(){
        System.out.println("Bike Engine");
    }
    public void fly(){
        System.out.println("Fly");
    }
}
