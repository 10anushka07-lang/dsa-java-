class Solution {
    public int[] twoSum(int[] n, int target) {
        Map<Integer, Integer> noVisited = new HashMap<>();
        for(int i =0 ; i<n.length ; i++){
            //current no is temp 
            int temp = n[i];
            // what no would we need to add to the current number that is stored in a variable named temp to reach the target value 
            int needNo = target - temp;
            // now checking if we have already visited the no in the array 
            if( noVisited . containsKey(needNo)){
                // if we find the key i.e the index of the no that needs to be added to reach the the target value we return index of both the current variable that is stored in temp and the index of the no that we needed and we have found it 
                // return a  new array 
                return new int[]{i, noVisited.get(needNo)};
               
                }
                noVisited.put(temp,i);
            }
             return new int[] {};
    }
    }