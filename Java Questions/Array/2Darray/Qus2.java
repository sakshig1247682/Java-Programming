// Write a Java program to find the sum of all elements in a 2D array.

public class Qus2 {
   public static void main(String[] args) {
    int arr[][]={{10,20},{40,50}};
    int sum=0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            sum += arr[i][j];
        }
    }
    System.out.println("The sum of all elements in 2D array is:"+ sum);
   } 
   
}
