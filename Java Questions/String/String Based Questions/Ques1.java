import java.util.Scanner;
//Check if a String Contains Only Digits:
// Write a method to checks if a given string contains only numeric digits.
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter YOur String : ");
    String str=sc.nextLine();
    char[] arr=str.toCharArray();
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(Character.isDigit(arr[i])){
            count=1;
        }
        else {
            count=0;
            break;
        }
    }
    if(count==1){
        System.out.println("The given string only contain numeric ");
    }
    else{
        System.out.println("The given string is not numeric ");

    }
    }
}
