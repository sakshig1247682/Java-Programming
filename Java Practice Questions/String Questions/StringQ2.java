//Write a Java program to find the longest word in a given string.
import java.util.Scanner; 
public class StringQ2 {
    public static String longestWord(String str) {
        String [] word =str.split(" ");
  String longestWString="";
  for(String words:word){
    if(words.length()>longestWString.length()){
        longestWString=words;
    }
  }
  return longestWString;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        String longestWString=longestWord(str);
        System.out.println("The longest string is: "+ longestWString);
    }
}
