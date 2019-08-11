class Solution {
    public int binarySwitch(int num) {
        return (num > 0) ? 0 : 1;
    }
    
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] intArr : A) {
            int lenDiv2 = intArr.length / 2;
            
            for (int i = 0; i < lenDiv2; i++) {
                int temp = binarySwitch(intArr[i]);
                
                intArr[i] = binarySwitch(intArr[intArr.length - i - 1]);
                intArr[intArr.length - i - 1] = temp;
            }
            if (intArr.length % 2 != 0) {
                intArr[lenDiv2] = binarySwitch(intArr[lenDiv2]);
            }
        }
        return A;
    }
}