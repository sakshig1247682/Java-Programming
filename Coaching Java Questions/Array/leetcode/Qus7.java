// Given an integer array nums of unique elements, return all possible 
// subsets
//  (the power set).
// The solution set must not contain duplicate subsets. Return the solution in any order.

// Example 1:
// Input: nums = [1,2,3]
// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

 
import java.util.ArrayList;
import java.util.List;

public class Qus7 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        result.add(new ArrayList<>(tempList)); // Add the current subset to the result
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]); // Include the current element
            backtrack(result, tempList, nums, i + 1); // Recurse with the next elements
            tempList.remove(tempList.size() - 1); // Exclude the current element and backtrack
        }
    }
    
    public static void main(String[] args) {
        Qus7 solution = new Qus7();
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = solution.subsets(nums);
        System.out.println(subsets);
    }
}


