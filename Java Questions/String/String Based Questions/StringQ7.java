public class StringQ7 {

        public static String removeConsecutiveDuplicates(String input) {
            if (input == null || input.length() == 0) {
                return input;
            }
    
            StringBuilder result = new StringBuilder();
            char lastChar = input.charAt(0);
            result.append(lastChar);
    
            for (int i = 1; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (currentChar != lastChar) {
                    result.append(currentChar);
                    lastChar = currentChar;
                }
            }
    
            return result.toString();
        }
        public static void main(String[] args) {
            String input = "aaabbbcccaaa";
            String output = removeConsecutiveDuplicates(input);
            System.out.println(output);  // Output: "abca"
        }
    }
    

