package thefungiz.javacert;

import org.apache.commons.lang3.StringUtils;

public class Mod10BruitForce {

  private static int COUNT_MAX = 1_000;

  public static void main(String[] args) {
    int count = 0;
    for (int i = 0; i < 1_000_000_000 || COUNT_MAX >= count; i++) {
      String routingNumber = StringUtils.leftPad(String.valueOf(i), 9, '0');
      if (isMod10Valid(routingNumber)) {
        count++;
        System.out.println(routingNumber);
      }
    }
  }

  public static boolean isMod10Valid(String number) {
    int[] weights = { 3, 7, 1 };
    if (number == null || number.length() != 9 || "000000000".equals(number)) {
      return false;
    }
    int c = 0;
    int sum = 0;
    int wi = 0;
    for (int i = 0; i < 9; ++i) {
      c = Character.digit(number.charAt(i), 10);
      if (c == -1) {
        return false;
      }

      sum += c * weights[wi++];
      if (wi == 3) {
        wi = 0;
      }
    }
    return sum % 10 == 0;
  }
}
