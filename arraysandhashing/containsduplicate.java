class Solution {
    public boolean containsDuplicate(int[] nums) {
       // nums[1,2,3,1](given)
       // return true if any value appears twice in the arrya
       Arrays.sort(nums); 
        for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i+1]) {
                    return true;
                }
        }
        return false;
    }
}
