//Write a program in java to find the subarray in array 
//The formula of subarray is n*(n+1)/2

public class Qus8 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int targetSum = 5;
        
        outerbreak:
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum == targetSum) {
                    System.out.println("The sum of subarray is:" +sum );
                    for (int k = i; k <= j; k++) {

                        System.out.println(arr[k]);
                        
                    }
                    System.out.println();
                    break outerbreak; // Break out of all loops once the subarray is found
                }
            }
        }
    }
}
