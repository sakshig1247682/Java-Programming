import java.util.Scanner;
  
public class inputQ3 {
    public static double Calculatearea(double lenght,double breadth ){
        return  lenght*breadth ;
      }
     
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        double len=sc.nextDouble();

        System.out.println("Enter the breadth");
        double brea=sc.nextDouble();
        double area=Calculatearea(len, brea);
        System.out.println("Area of rectangle"+ "is" + area);        

    }
}

