import java.util.Scanner; 

 public class input {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter age");
     int age=sc.nextInt();
     System.out.println(age);
     System.out.println("Enter your name");
     String name=sc.next();
     System.out.println(name);

     System.out.println("Enter roll number");
     int rollno=sc.nextInt();
     System.out.println(rollno);
     
     System.out.println("Enter your full name");
     sc.nextLine();
     String Fname=sc.nextLine();
     System.out.println(Fname);
    }
}
