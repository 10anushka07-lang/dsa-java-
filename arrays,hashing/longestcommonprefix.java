class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // Sort the array lexicographically (alphabetically).
        // After sorting, the two strings that differ the MOST from each other
        // (in terms of shared prefix) will end up at the first and last positions.
        // Any other pair in the array will share a prefix at least as long as
        // the one shared between the first and last strings.
        Arrays.sort(strs);
        
        // Pick the first string after sorting.
        String s1 = strs[0];
        
        // Pick the last string after sorting.
        // Comparing just s1 and s2 is enough to find the common prefix
        // of the ENTIRE array, thanks to the sorting trick above.
        String s2 = strs[strs.length - 1];
        
        // idx tracks how many leading characters match between s1 and s2.
        int idx = 0;
        
        // Loop while idx is within bounds of BOTH strings
        // (prevents IndexOutOfBoundsException on shorter string).
        while (idx < s1.length() && idx < s2.length()) {
            
            if (s1.charAt(idx) == s2.charAt(idx)) {
                // Characters match at this position -> move to next character.
                idx++;
            } else {
                // Mismatch found -> common prefix ends here, stop looping.
                break;
            }
        }
        
        // Return the substring from index 0 to idx (exclusive),
        // which is the longest common prefix shared by all strings.
        return s1.substring(0, idx);
    }
}

/*
 * EXAMPLE WALKTHROUGH:
 * Input: ["flower", "flow", "flight"]
 * 1. After sorting: ["flight", "flow", "flower"]
 * 2. s1 = "flight", s2 = "flower"
 * 3. Compare character by character:
 *      f == f -> idx = 1
 *      l == l -> idx = 2
 *      i != o -> break
 * 4. Return "fl"
 *
 * TIME COMPLEXITY:  O(N log N) for sorting + O(M) for comparison
 *                    (N = number of strings, M = length of shortest string)
 * SPACE COMPLEXITY: O(1) extra space (ignoring internal sort overhead,
 *                    which is typically O(log N) in Java)
 */