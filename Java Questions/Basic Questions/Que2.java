public class Que2 {
    public static void main(String[] args) {
        String input = "YourStringHere";
        boolean containsDigit = false;
        
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                containsDigit = true;
                break;
            }
        }
        
        if (containsDigit) {
            System.out.println("The string contains at least one digit.");
        } else {
            System.out.println("The string does not contain any digits.");
        }
    }
}
