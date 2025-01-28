import java.util.Scanner;
public class Qus3 {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an email address:");
    String email = scanner.nextLine();
    
    if (isValidEmail(email)) {
        System.out.println("The email address is valid.");
    } else {
        System.out.println("The email address is not valid.");
    }
   }
   public static boolean isValidEmail(String email) {
    return email.contains("@gmail.com");
}
}