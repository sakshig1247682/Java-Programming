public class Qus1 {
    public static void main(String[] args) {
        String input = "sakshi3"; 
          boolean containsDigit = false;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= '0' && ch <= '9') {
                containsDigit = true;
                break;
            }
        }
        
        if (containsDigit) {
            System.out.println("The string contains digit.");
        } else {
            System.out.println("The string does not contain any digits.");
        }
    }
}