import java.util.Scanner;
public class Qus4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter search item :");
        int data[]=new int [5];
        
        int arr[]={1,2,3,4,1,2,3,1,1,2,3,4};
        int count=0;
        int item=sc.nextInt();

        for(int i=0;i<arr.length;i++){
         if(item==arr[i])   {
           count++;
         }
        }
        System.out.println(count);
    }
}
