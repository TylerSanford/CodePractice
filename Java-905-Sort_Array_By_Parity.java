class Solution {
    public int[] sortArrayByParity(int[] A) {
        int floor = 0;
        int ceil = A.length - 1;
        
        while (floor < ceil) {
            while (A[floor] % 2 == 0 && floor < ceil) {
                floor++;
            }
            
            while (A[ceil] % 2 == 1 && floor < ceil) {
                ceil--;
            }
            
            if (floor < ceil) {
                int temp = A[floor];
                A[floor] = A[ceil];
                A[ceil] = temp;
                
                floor++;
                ceil--;
            }
        }
        return A;
    }
}