// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.

// Example 1:
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

public class Qus8 {
    
        public void sortColors(int[] nums) {
            // Initialize pointers
            int low = 0;
            int mid = 0;
            int high = nums.length - 1;
            
            // Iterate through the array
            while (mid <= high) {
                if (nums[mid] == 0) {
                    // Swap nums[low] and nums[mid]
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                } else if (nums[mid] == 1) {
                    // Move to the next element
                    mid++;
                } else {
                    // Swap nums[mid] and nums[high]
                    int temp = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp;
                    high--;
                }
            }
        }
    
        public static void main(String[] args) {
            Qus8 solution = new Qus8();
            int[] nums = {2, 0, 2, 1, 1, 0};
            solution.sortColors(nums);
            // Print the sorted array
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
    }
    

