class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> sdnList = new ArrayList();
        String stringNum;
            
        for (int i = left; i <= right; i++) {
            int illegalCounter = 0;
            stringNum = String.valueOf(i);

            if (stringNum.length() == 1) {
                if (i % i == 0) sdnList.add(i);
            } else {
                for (int j = 0; j < stringNum.length(); j++) {
                    int singleInt = Character.digit(stringNum.charAt(j), 10);
                            
                    if (singleInt == 0 || i % singleInt > 0) illegalCounter++;
                }
                if (illegalCounter == 0) sdnList.add(i);
            }
        }
        return sdnList;
    }
}