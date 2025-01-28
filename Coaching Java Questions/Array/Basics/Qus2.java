import java.util.Scanner;
public class Qus2 {
    public static void main(String[] args) {
       //Defining an array(1)
        // int arr[]=new int[4];
        // arr[0]=22;
        // arr[1]=99;
        // arr[2]=44;
        // arr[3]=55;
        
         //Defining an array(2)
        // int arr[]={3,5,6,8,9,10};

        // for(int i=0;i<=arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        //by taking input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
       System.out.println("enter the elements of the array :");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The given elements of the array are: ");

        for(int i=0;i<size;i++){
System.out.println(arr[i]);
        }
    }
}
