package thefungiz.javacert;

import java.util.Arrays;

public class OneDimensionalArray {

  public static void main(String args[]) {
    James[] differentJames; // declare
    differentJames = new James[] {new HappyJames(), new SleepyJames(), new GrumpyJames()}; // initialize
    Arrays.stream(differentJames).forEach(it -> System.out.println(it.getClass().getSimpleName() + " says: \"" + it.comment() + "\"")); // use
  }
}

interface James {
  String comment();
}
class HappyJames implements James{

  @Override
  public String comment() {
    return "Lookin' fab. mmlove you";
  }
}

class SleepyJames implements James{

  @Override
  public String comment() {
    return "Zzzzzzz";
  }
}

class GrumpyJames implements James{

  @Override
  public String comment() {
    return "Get outta my way bitch!!";
  }
}
