import java.util.Scanner;
public class Name{
    public static void main(String []args){
        //taking input
        Scanner obj= new Scanner( System.in);
        //output
        System.out.println("enter a name : ");
        String str =obj.nextLine();
        System.out.println("enter a number :");
        int a=obj.nextInt();
        System.out.println(str);
        System.out.println(a);
    }
    
}
