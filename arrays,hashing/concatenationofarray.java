class Solution {
    public int[] getConcatenation(int[] nums) {
        // array[1,2,3](given) n=3
        //ans   ans[i]==nums[i]
        //concatenation
        int len = nums.length;
        int[] ans = new int[2*len];
        for(int i = 0; i < len; i++){
            ans[i] = nums[i];
            ans[i+len] = nums[i];
        }
        return ans;              

    }
}