class Solution {   
    public int lengthOfLongestSubstring(String s) {
        Integer counter = 0;
        Integer tempCount = 0;
        List arr = new ArrayList();
        
        for (int i = 0; i < s.length(); i++) {
            tempCount = 0;
            arr.clear();
            
            for (int t = i; t < s.length(); t++) {
                if (arr.contains(s.charAt(t))) {
                    break;
                }
                
                arr.add(s.charAt(t));
                tempCount++;
            }
        
            if (tempCount > counter) {
                counter = tempCount;
            }
        }
        return counter;
    }
}
