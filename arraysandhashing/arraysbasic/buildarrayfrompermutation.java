// Given a zero-based permutation nums (0-indexed),
//  build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

// given - build an array named ans of same length 
// step 1 
// build an array name ans of same length 
class Solution {
    public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
//         where ans[i] = nums[nums[i]] for each 0 <= i < nums.length deriving condition from the question , given 
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
            // the condition of where till the loop should end is already specified in the question 
            // the condition that ans[i]=nums[nums[i]]
        }
        return ans;
    }
}
//Input: nums = [0,2,1,5,3,4]
//Output: [0,1,2,4,5,3]
// dry run 
// new array ans[i]=nums