//using hashmap 
class Solution {
public int[] twoSum(int[] nums, int target) {
        // This map stores numbers we've already seen, along with their index.
        // key = the number itself, value = the index where we found it
        Map<Integer, Integer> seenNumbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            
            // What number would we need to add to currentNum to reach target?
            int numNeeded = target - currentNum;

            // Have we already seen that number earlier in the array?
            if (seenNumbers.containsKey(numNeeded)) {
                // Yes! So currentNum + numNeeded = target.
                // Return the current index and the index where numNeeded was found.
                return new int[] { i, seenNumbers.get(numNeeded) };
            }

            // We haven't found a match yet, so remember this number and its index
            // in case a future number needs it.
            seenNumbers.put(currentNum, i);
        }

        // No solution found (shouldn't happen if the problem guarantees one exists)
        return new int[] {};
    }
}
