import java.util.Scanner;
public class StringQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("enter a string");
        String inputStr = sc.nextLine().toLowerCase();

        int vowels=0;
        int consonants=0;
        for(int i=0; i<inputStr.length();i++){
            char ch=inputStr.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("number of vowels : "+vowels);
        System.out.println("number of consonants : "+ consonants);

        }
    }
    
