package thefungiz.javacert.story;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Runner {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder();
    World world = new World();
    Person firstPerson = world.getRandomPerson();
    s.append(firstPerson.getWhatItIsCalled());
    s.append(" was hanging out in" + firstPerson.getPossessivePronoun());
    Residence firstHouse = world.getRandomResidence();
    s.append(firstHouse.getWhatItIsCalled());
    s.append(" one day, playing with" + firstPerson.getPossessivePronoun());
    s.append(firstHouse.getRandomItem().getWhatItIsCalled());
    Person secondPerson = world.getRandomPerson();
    Residence secondHouse = world.getRandomResidence();
    s.append(" when all of the sudden " + secondPerson.getWhatItIsCalled() + " came running over from" + secondPerson.getPossessivePronoun());
    s.append(secondHouse.getWhatItIsCalled() + " to say, \"Watch out for that " + firstHouse.getRandomItem().getWhatItIsCalled() + "!\"");
    s.append("\nMany laughs were had and they became good friends bonding over the " + firstHouse.getWhatItIsCalled() + "'s " + firstHouse.getRandomItem().getWhatItIsCalled());
    s.append("\nThe end.");

    System.out.println(s.toString());
  }
}

interface Itable { default String getWhatItIsCalled() { return this.getClass().getSimpleName().toLowerCase(); }}

class World {
  private static List<Residence> residences = Arrays.asList(new Apartment(), new House(), new Tree(), new Cave());
  private static List<Person> people = Arrays.asList(new Armie(), new Kelly(), new Jenifer(), new Kiru(), new Derek(), new Brant(), new James(), new Aaron());
  Residence getRandomResidence() {
    Collections.shuffle(residences);
    return residences.get(0);
  }

  Person getRandomPerson() {
    Collections.shuffle(people);
    return people.get(0);
  }
}
interface Person extends Itable, Pronounable {}
interface Pronounable {
  String getPossessivePronoun();
}
interface Guy extends Pronounable {

  default String getPossessivePronoun() {
    return " his ";
  }
}
interface Gal extends Pronounable {

  default String getPossessivePronoun() {
    return " her ";
  }
}
class Armie implements Person, Gal{}
class Kelly implements Person, Gal{}
class Jenifer implements Person, Gal{}
class Kiru implements Person, Gal{}
class Aaron implements Person, Guy{}
class Derek implements Person, Guy{}
class James implements Person, Guy{}
class Brant implements Person, Guy{}

interface Item extends Itable {}
class Computer implements Item{}
class Rock  implements Item{}
class Treasure  implements Item{}
class Plate  implements Item{}
class Leaf  implements Item{}
class Branch  implements Item{}
class Ghost implements Item{}
class Painting implements Item{}

interface Residence extends Itable {
  default Item getRandomItem() {
    List<Item> items = getItems();
    Collections.shuffle(items);
    return items.get(0);
  }
  List<Item> getItems();
}

class Apartment implements Residence {

  @Override
  public List<Item> getItems() {
    return Arrays.asList(new Computer(), new Plate(), new Painting());
  }
}

class House implements Residence {

  @Override
  public List<Item> getItems() {
    return Arrays.asList(new Computer(), new Plate(), new Ghost());
  }
}

class Tree implements  Residence {

  @Override
  public List<Item> getItems() {
    return Arrays.asList(new Leaf(), new Branch(), new Ghost());
  }
}

class Cave implements Residence {

  @Override
  public List<Item> getItems() {
    return Arrays.asList(new Rock(), new Treasure(), new Painting());
  }
}