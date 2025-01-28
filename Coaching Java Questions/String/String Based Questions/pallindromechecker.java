import java.util.Scanner;
public class pallindromechecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String input=sc.nextLine();
       String str="";
       for(int i=0;i<input.length();i++){
        str=input.charAt(i)+str;  
    }
    if(str.equals(input)){
        System.out.println("it is a pallindrome");
    }
    else{
        System.out.println("it is not a pallindrome");
    }
}
}