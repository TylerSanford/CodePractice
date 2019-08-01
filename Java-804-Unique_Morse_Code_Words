class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        List<String> morseList = new ArrayList();
        List<String> morseCodeList = Arrays.asList(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..");
        
        for (String word : words) {
            String morseWord = new String();
            
            if (word != null && word.length() <= 12) {
                char[] ch  = word.toCharArray();
                
                for (char c : ch) {
                    int charPlace = (int)c-96;
                    morseWord += morseCodeList.get(charPlace-1);
                }
                if (!morseList.contains(morseWord)) {
                    morseList.add(morseWord);
                }
            }
        }
        return morseList.size();
    }
}
