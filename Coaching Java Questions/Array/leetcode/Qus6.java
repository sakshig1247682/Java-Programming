// Given an integer array nums, find the 
// subarray
//  with the largest sum, and return its sum.

 

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.


public class Qus6 {
    
        public int maxSubArray(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0; 
            }
            
            int maxSum = nums[0];
            int currentSum = nums[0];
            
            for (int i = 1; i < nums.length; i++) {
                currentSum = Math.max(nums[i], currentSum + nums[i]);
                maxSum = Math.max(maxSum, currentSum);
            }
            
            return maxSum;
        }
        
        public static void main(String[] args) {
            Qus6 solution = new Qus6();
            int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            int result = solution.maxSubArray(nums);
            System.out.println("The maximum subarray sum is: " + result); // Output: 6
        }
    }
    

