public class ReverseWords {
    public static void main(String[] args) {
        String input = "Sakshi Gupta";
        String reversedString = reverseEachWord(input);
        System.out.println(reversedString);
    }

    public static String reverseEachWord(String input) {
        String[] words = input.split("\\s+");
        
        StringBuilder reversedString = new StringBuilder();
        
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedString.append(reversedWord).append(" ");
        }
        
        
        return reversedString.toString().trim();
    }
}
