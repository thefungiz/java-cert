package thefungiz.javacert.inheritance;

import java.util.Arrays;

public class Runner {
  public static void main(String[] args) {
    Cat[] cats = new Cat[] {new HouseCat(), new Tiger(), new DemonCat()};
    Arrays.stream(cats).forEach(cat -> cat.interactWithKitty());
  }
}

interface Cat {

  String getProfilePicture();

  boolean isDeadly();

  boolean isRoarable();

  default void interactWithKitty() {
    System.out.println("You see a " + getClass().getSimpleName());
    System.out.println("The kitty's profile picture is " + getProfilePicture());
    System.out.println("This kitty is " + (isPurrable() ? "" : "not ") + "purring and is " + (isRoarable() ? "" : "not ") + "roaring.");
    System.out.println("You decide this kitty is " + (isLovable() ? "" : "not ") + "lovable");

    System.out.println("You decide to pet the kitty");
    System.out.println(isDeadly() ? "And now you're dead" : "And it brought joy to your life");
    System.out.println();
    System.out.println();
  }

  default boolean isPurrable() {
    return !isRoarable();
  }

  default boolean isLovable() {
    return true;
  }
}

class Tiger implements Cat {

  @Override
  public String getProfilePicture() {
    return "https://c402277.ssl.cf1.rackcdn.com/photos/18134/images/priority_species_small/Medium_WW226365.jpg?1574452099";
  }

  @Override
  public boolean isDeadly() {
    return true;
  }

  @Override
  public boolean isRoarable() {
    return true;
  }
}

class HouseCat implements Cat {

  @Override
  public String getProfilePicture() {
    return "http://www.cbc.ca/natureofthings/content/interactives/lioninyourlivingroom/kit/images/cat_940.jpg";
  }

  @Override
  public boolean isDeadly() {
    return false;
  }

  @Override
  public boolean isRoarable() {
    return false;
  }
}

class DemonCat implements Cat {

  @Override
  public String getProfilePicture() {
    return "https://i.redd.it/8j6ctj10df841.jpg";
  }

  @Override
  public boolean isDeadly() {
    return true;
  }

  @Override
  public boolean isRoarable() {
    return false;
  }
}
