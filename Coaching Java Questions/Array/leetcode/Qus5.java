// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:

// Input: nums = [], target = 0
// Output: [-1,-1]

public class Qus5 {
    
        public int[] searchRange(int[] nums, int target) {
            int[] result = new int[2];
            result[0] = findFirstPosition(nums, target);
            result[1] = findLastPosition(nums, target);
            return result;
        }
    
        private int findFirstPosition(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int firstPosition = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    firstPosition = mid;
                    right = mid - 1; // Continue to search in the left half
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return firstPosition;
        }
    
        private int findLastPosition(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int lastPosition = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    lastPosition = mid;
                    left = mid + 1; // Continue to search in the right half
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return lastPosition;
        }
    
        public static void main(String[] args) {
            Qus5 solution = new Qus5();
            int[] nums1 = {5, 7, 7, 8, 8, 10};
            int target1 = 8;
            int[] result1 = solution.searchRange(nums1, target1);
            System.out.println("Result1: [" + result1[0] + ", " + result1[1] + "]");
    
            int[] nums2 = {5, 7, 7, 8, 8, 10};
            int target2 = 6;
            int[] result2 = solution.searchRange(nums2, target2);
            System.out.println("Result2: [" + result2[0] + ", " + result2[1] + "]");
    
            int[] nums3 = {};
            int target3 = 0;
            int[] result3 = solution.searchRange(nums3, target3);
            System.out.println("Result3: [" + result3[0] + ", " + result3[1] + "]");
        }
    }
    

