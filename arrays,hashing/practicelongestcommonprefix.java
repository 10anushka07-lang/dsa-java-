public String longestCommonPrefix(String[] strs) {
    // sort the array of strings in ascending order 
    Arrays.sort(strs);
    // pick the first string after sorting 
    String s1= strs[0];
    // pick the last string after sorting comparing just first and last is enough to compare the comman prefix 
    String s2=strs[strs.length - 1 ];
    //  idx tracks how many leading characters match between s1 and s2.
    // leading characters means the left most common characters 
      int idx = 0;
    while (idx < s1.length() && idx < s2.length()) {
    if (s1.charAt(idx) == s2.charAt(idx)) {
        idx++;   // this leading character matched, check the next one
    } else {
        break;   // mismatch — the common leading part stops here
    }
     // Return the substring from index 0 to idx (exclusive),
        // which is the longest commn prefix shared by all strings.
        return s1.substring(0, idx);
    }
}
