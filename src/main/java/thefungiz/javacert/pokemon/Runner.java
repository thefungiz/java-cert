package thefungiz.javacert.pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Runner {
  public static void main(String[] args) {
    BattleLoop battleLoop = new BattleLoop(
      new Charmander(110, 110, new ArrayList<>(Arrays.asList(new Ember(), new DragonBreath(), new FireFang(), new Slash()))),
      new Rattata(90, 90, new ArrayList<>(Arrays.asList(new Tackle(), new QuickAttack(), new SuperFang(), new Crunch()))));
    Pokemon winner = battleLoop.determineWinner();
    Logger.println(winner.getName() + " was the winner!");
  }
}

class BattleLoop {
  private Pokemon yourPokemon;
  private Pokemon opponentPokemon;

  public BattleLoop(Pokemon yourPokemon, Pokemon opponentPokemon) {
    this.yourPokemon = yourPokemon;
    this.opponentPokemon = opponentPokemon;
  }

  public Pokemon determineWinner() {
    Logger.println("Wild " + opponentPokemon.getName() + " appeared!");
    Pokemon winner = null;
    while (winner == null) {
      printScene();
      yourTurn();
      winner = checkWinner();
      if (winner != null) {
        break;
      }
      opponentTurn();
      winner = checkWinner();
    }
    return winner;
  }

  private void printScene() {
    Logger.println(opponentPokemon.getBattleScene());
    Logger.println(yourPokemon.getBattleScene());
  }

  private Pokemon checkWinner() {
    Pokemon winner = null;
    if (opponentPokemon.getCurrentHp() == 0) {
      winner = yourPokemon;
    }
    if (yourPokemon.getCurrentHp() == 0) {
      winner = opponentPokemon;
    }
    return winner;
  }

  private void yourTurn() {
    Move move = InputHelper.getMoveSelection(yourPokemon);
    Logger.println(yourPokemon.getName() + " used " + move.getName() + "!");
    Logger.println(opponentPokemon.getName() + " took " + move.getPower() + " damage!");
    opponentPokemon.takeDamage(move.getPower()); // TODO: accuracy and type should come into account here
  }

  private void opponentTurn() {
    Move move = RandomHelper.getMoveSelection(opponentPokemon);
    Logger.println(opponentPokemon.getName() + " used " + move.getName() + "!");
    Logger.println(yourPokemon.getName() + " took " + move.getPower() + " damage!");
    yourPokemon.takeDamage(move.getPower());
  }
}

class Charmander extends Pokemon {

  public Charmander(int maxHp, int currentHp, ArrayList<Move> moves) {
    super(maxHp, currentHp, moves);
  }

  @Override
  public Type getType() {
    return Type.FIRE;
  }
}

class Rattata extends Pokemon {
  public Rattata(int maxHp, int currentHp, ArrayList<Move> moves) {
    super(maxHp, currentHp, moves);
  }

  @Override
  public Type getType() {
    return Type.NORMAL;
  }
}

abstract class Pokemon {
  int maxHp;
  int currentHp;
  ArrayList<Move> moves; // requiring arraylist because order is important

  public Pokemon(int maxHp, int currentHp, ArrayList<Move> moves) {
    this.maxHp = maxHp;
    this.currentHp = currentHp;
    this.moves = moves;
  }
  abstract Type getType();
  public List<Move> getMoves() {
    return moves;
  }
  public int getMaxHp() {
    return maxHp;
  }
  public int getCurrentHp() {
    return currentHp;
  }
  public void takeDamage(int damage) {
    currentHp = Math.max(currentHp - damage, 0);
  }
  public String getName() {return this.getClass().getSimpleName();}
  public String getBattleScene() { return getName() + "\tHP: " + getCurrentHp() + " / " + getMaxHp(); }
  public String getMoveSelection() {
    StringBuilder stringBuilder = new StringBuilder("Moves: \n");
    for (int i = 0; i < moves.size(); i++) {
      stringBuilder.append(i + ": " + moves.get(i).getName() + "\n");
    }
    return stringBuilder.toString();
  }
}

enum Type { FIRE, NORMAL}

abstract class Move {
  public Move(int power) {
    this.power = power;
  }
  int power;
  public int getPower() {
    return power;
  }

  public String getName() {
    return this.getClass().getSimpleName();
  }
}

class Ember extends Move {
  public Ember() {
    super(40);
  }
}

class DragonBreath extends Move {
  public DragonBreath() {
    super(60);
  }
}

class FireFang extends Move {
  public FireFang() {
    super(65);
  }
}

class Slash extends Move {
  public Slash() {
    super(70);
  }
}

class Tackle extends Move {
  public Tackle() {
    super(40);
  }
}

class QuickAttack extends Move {
  public QuickAttack() {
    super(40);
  }
}

class SuperFang extends Move {
  public SuperFang() {
    super(40);
  }
}

class Crunch extends Move {
  public Crunch() {
    super(40);
  }
}

final class Logger{
  public static void println(String string) {
    System.out.println(string);
  }
  public static void print(String string) {
    System.out.print(string);
  }
}

final class InputHelper {
  private static Scanner scanner = new Scanner(System.in);

  public static Move getMoveSelection(Pokemon pokemon) {
    Logger.println(pokemon.getMoveSelection());
    Logger.println("What move will " + pokemon.getName() + " use? ");
    while(!scanner.hasNext("[0-3]")){
      Logger.println("Please select a number 0 - 3");
      Logger.println("What move will " + pokemon.getName() + " use? ");
      scanner.nextLine();
    }
    return pokemon.getMoves().get(Integer.parseInt(scanner.nextLine()));
  }
}

final class RandomHelper {
  public static Move getMoveSelection(Pokemon pokemon) {
    return pokemon.getMoves().get(new Random().ints(0, 4).findFirst().getAsInt());
  }
}