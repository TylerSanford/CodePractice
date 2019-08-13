class Solution {
  String romanStr = "";

  public String intToRoman(int num) {
    if (num >= 0) {
      if (num - 1000 >= 0) {
        romanStr = romanStr + "M";

        return intToRoman(num - 1000);
      }

      if (num - 900 >= 0) {
        romanStr += "CM";

        return intToRoman(num - 900);
      }

      if (num - 500 >= 0) {
        romanStr = romanStr + "D";

        return intToRoman(num - 500);
      }

      if (num - 400 >= 0) {
        romanStr = romanStr + "CD";

        return intToRoman(num - 400);
      }

      if (num - 100 >= 0) {
        romanStr = romanStr + "C";

        return intToRoman(num - 100);
      }

      if (num - 90 >= 0) {
        romanStr += "XC";

        return intToRoman(num - 90);
      }

      if (num - 50 >= 0) {
        romanStr = romanStr + "L";

        return intToRoman(num - 50);
      }

      if (num - 40 >= 0) {
        romanStr += "XL";

        return intToRoman(num - 40);
      }

      if (num - 10 >= 0) {
        romanStr = romanStr + "X";

        return intToRoman(num - 10);
      }

      if (num - 9 >= 0) {
        romanStr += "IX";

        return intToRoman(num - 9);
      }

      if (num - 5 >= 0) {
        romanStr = romanStr + "V";

        return intToRoman(num - 5);
      }

      if (num - 4 >= 0) {
        romanStr += "IV";

        return intToRoman(num - 4);
      }

      if (num - 1 >= 0) {
        romanStr = romanStr + "I";

        return intToRoman(num - 1);
      }
    }

    return romanStr;
  }
}