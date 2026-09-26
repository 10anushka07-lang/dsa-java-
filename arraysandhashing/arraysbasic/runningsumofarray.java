//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

//Return the running sum of nums.

 

//Example 1:
//Input: nums = [1,2,3,4]

class Solution {
    public int[] runningSum(int[] nums) {
         for(int i=1;i<nums.length;i++){
              nums[i]+=nums[i-1];
              // this will work like this for eg n = 5 
              // in the first iteration i=1
              //nums[1]+=nums[1-1];
              // now in this the assignment operator will work as follows 
              // to calculate the running sum of array in 1 d array 
              // nums[1]+=nums[0]
              // the value of nums[1]for the eg 1 is 2 
              // and the value for nums[0] is 1
              // now to calculate the running sum of 1d array and assign it to a new aarya 
              // we will first calculate the value of index 0 which will be how the assignment operator will work ass follows 
              // we will first add the value of nums[1] which is on the left side of the assignment operator 
              // i.e  2 to the value of nums[0] which is on the left side to calculate the value of the nums[0] 
              // which is a running sum 1 d array // so it will work like this the assignemnt will work from left to right
              // the assignment opeartor will work from left to right first the value will be added then assigned to 0 index 
              // so the value at first index will be added to 0th index and then assigned 
              // so the value of first index of the running array will be 2+1=3
              // basically in simple words 
            // the running sum of 1 d array now will look like [1,3]
           // we did this in a short way with assignemnet operator and made a standard pattern for each index and iteration 
           // it will work in the same way for all the indexes 
           //nums[2]+=nums[1]
           //now we will add the value of nums[2] which is on left side to the index of 1 which is on the right side 
           // and then assign to index 2 which is on the left side 
           // basically this owrks liek 
           //nums[i]=nums[i-1]+nums[i]
           //we did this in a short way with assignment operator
           // now it will work for the second index like thsi 
           // nums[2]=nums[1]+nums[2]
           // 3+3=6
           //nums[3]=nums[2]+nums[30]
           //6+4=10
           // so the array will look like [1,3,6,10]

        return nums;
    }
}
}