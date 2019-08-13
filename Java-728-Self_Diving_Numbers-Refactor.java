class Solution {
  public Boolean isModNum(int num) {
      String stringNum = String.valueOf(num);
      
      if (stringNum.length() == 1) {
          return (num % num == 0) ? true : false;
      } else {
          for (int i = 0; i < stringNum.length(); i++) {
              int singleInt = Character.digit(stringNum.charAt(i), 10);
              
              if (singleInt == 0 || num % singleInt > 0) {
                  return false;
              }
          }
          return true;
      }
  }
  
  public List<Integer> selfDividingNumbers(int left, int right) {
      List<Integer> sdnList = new ArrayList();
      
      for (int i = left; i <= right; i++) {
          if (isModNum(i) == true) sdnList.add(i);
      }
      return sdnList;
  }
}