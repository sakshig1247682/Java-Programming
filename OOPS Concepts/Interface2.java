

interface Engine{
    void carEngine();
    void truckEngine();

}

interface Bird extends Engine{
    void fly();
}



public class Interface2 implements Bird {
    public static void main(String[] args) {
        Interface2 obj=new Interface2();
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
