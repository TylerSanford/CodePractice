class Solution {
  public int[] dailyTemperatures(int[] T) {
    int[] tempDays = new int[T.length];

    for (int i = 0; i < T.length; i++) {
      for (int k = i + 1; k < T.length; k++) {
        if (T[k] > T[i]) {
          tempDays[i] = k - i;
          break;
        }
      }
    }
    return tempDays;
  }
}