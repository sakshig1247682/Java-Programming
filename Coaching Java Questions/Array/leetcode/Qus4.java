// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
// Example 1:

// Input: nums = [3,0,1]
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
// Example 2:

// Input: nums = [0,1]
// Output: 2
// Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
// Example 3:

// Input: nums = [9,6,4,2,3,5,7,0,1]
// Output: 8
// Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

 public class Qus4 {
    
        public static int findMissingNumber(int[] nums) {
            int n = nums.length;
            int expectedSum = n * (n + 1) / 2;
            int actualSum = 0;
            for (int num : nums) {
                actualSum += num;
            }
        
            return expectedSum - actualSum;
        }
    
        public static void main(String[] args) {
            int[] nums1 = {3, 0, 1};
            System.out.println("Missing number: " + findMissingNumber(nums1)); // Output: 2
            
            int[] nums2 = {0, 1};
            System.out.println("Missing number: " + findMissingNumber(nums2)); // Output: 2
            
            int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
            System.out.println("Missing number: " + findMissingNumber(nums3)); // Output: 8
        }
    }

