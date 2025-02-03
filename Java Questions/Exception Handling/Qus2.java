 import java.util.Scanner;
 public class Qus2 {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    System.out.println("hello");
    System.out.println("world");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    try{
    System.out.println(num1/num2);
    }
    catch(ArithmeticException e){
         System.out.println("ArithmeticException");
        // e.printStackTrace();
        // System.out.println(e.toString());
       // System.out.println(e.getMessage());
    }

    System.out.println("hello sakshi");
   } 
}
