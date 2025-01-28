/*
 * Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.
Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.
Example 1:
Input: nums1 = [1,2,3], nums2 = [2,4]
Output: 2
Explanation: The smallest element common to both arrays is 2, so we return 2.
 */

public class Ques2 {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int arr2[]={2,4};
        System.out.println(commonElement(arr,arr2));

    }

    public static int commonElement(int[] arr, int[] arr2) {
        int min=0;
        for(int i=0;i<arr.length;i++){
            
            for(int j=0;j<arr2.length;j++){
                if(arr[i]==arr2[j]){
                   if(min>arr[i]){
                    min=arr[i];
                    break;
                   }
                    }
                }

        }


        return min;
    }
}
