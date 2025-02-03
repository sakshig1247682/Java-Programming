import java.util.Scanner;

public class RemoveWhitespace {
    
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string with white spaces: ");
        String input = scanner.nextLine();
        
        String result = removeWhitespace(input);
        
        System.out.println("String after removing white spaces: " + result);
        

    }
}

