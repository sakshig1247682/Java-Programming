// You are given an integer array nums. In one move, you can pick an index i where 0 <= i < nums.length and increment nums[i] by 1.
// Return the minimum number of moves to make every value in nums unique.

// The test cases are generated so that the answer fits in a 32-bit integer.

// Example 1:

// Input: nums = [1,2,2]
// Output: 1
// Explanation: After 1 move, the array could be [1, 2, 3].


    import java.util.Arrays;
    public class Qus11 {

    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int moves = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int increment = nums[i - 1] - nums[i] + 1;
                nums[i] += increment;
                moves += increment;
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        Qus11 solution = new Qus11();
        int[] nums1 = {1, 2, 2};
        System.out.println(solution.minIncrementForUnique(nums1)); // Output: 1

        int[] nums2 = {3, 2, 1, 2, 1, 7};
        System.out.println(solution.minIncrementForUnique(nums2)); // Output: 6
    }
}


