//Write a Java program to capitalize the first letter of each word in a given string.
public class StringQ4 {
        public static void main(String[] args) {
        String input="my name is sakshi";
        String capitalletter= capiltalfirstletter(input);
        System.out.println("Original String is: "+input);
        System.out.println(capitalletter);
    }
    public static String capiltalfirstletter(String str){
        String[] words = str.split("\\s");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                char firstLetter = Character.toUpperCase(word.charAt(0));
                result.append(firstLetter).append(word.substring(1)).append(" ");
    }
}
return result.toString();

    }
}