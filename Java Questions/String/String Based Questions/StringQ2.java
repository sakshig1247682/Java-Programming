import java.util.Scanner;
public class StringQ2 {
    public static String findLongestWord(String str) {
        String[] words = str.split("\\s"); 
        String longestWord = "";
    
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
          
        return longestWord;
    }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();
    
    String longestWord = findLongestWord(input);
    
    System.out.println("Longest word in the string: " + longestWord);

  }  
}
