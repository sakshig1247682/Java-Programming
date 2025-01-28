//Develop a Java program to replace all occurrences of a specified character in a string with another character.
import java.util.Scanner;
public class StringQ3 {
    public static String charreplace(String input,char target,char replace){
        StringBuilder newstr=new StringBuilder();
        for(char ch:input.toCharArray()){
            if(ch==target){
                newstr.append(replace);
                
            }
            else{
                newstr.append(ch);
            }
        }
        return newstr.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input=sc.nextLine();
        System.out.print("Enter the character to replace: ");
        char target = sc.next().charAt(0);
        System.out.print("Enter the replacement character: ");
        char replace = sc.next().charAt(0);
        String newstr = charreplace(input,target,replace);
        System.out.println("Modified String is: " + newstr);
    }
}
