public class StringQ6 {
    public static String reverseWords(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");
        
        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word);
            result.append(reverseWord.reverse().toString()).append(" ");
        }
        
        // Remove the trailing space
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "Hello World";
        String reversedSentence = reverseWords(sentence);
        System.out.println(reversedSentence);  // Output: "olleH dlroW"
    }
}

