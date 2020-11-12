package thefungiz.javacert.multidimensionalgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.List.*;

public class GameRunner {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame(SetupHelper.initPlayers(), SetupHelper.initCells());
        while (game.getWinner() == null) { // TODO add tie!!
            Player currentPlayer = game.getNextPlayer();
            System.out.println(game.generateDisplayBoard());
            game.performPlayerTurn(currentPlayer);
        }
        System.out.println("Winner was " + game.getWinner().getIcon());
        System.out.println(game.generateDisplayBoard());
    }
}

class TicTacToeGame {

    private Player[] players;
    private Player currentPlayer;
    private Cell[][] cells;
    private List<Line> lines;

    TicTacToeGame(Player[] players, Cell[][] cells) {
        if (cells == null || cells[0] == null || (cells.length != cells[0].length && cells.length != 3)) { throw new RuntimeException("Invalid table size"); }
        this.players = players;
        this.currentPlayer = players[0];
        this.cells = cells;
        this.lines = SetupHelper.initLines(cells);
    }

    String generateDisplayBoard() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Cell[] cellRow : cells) {
            stringBuilder.append("\n|");
            for (Cell cell : cellRow) {
                stringBuilder.append(cell.display()).append("|");
            }
        }
        return stringBuilder.toString();
    }

    Player getNextPlayer() {
        currentPlayer = currentPlayer == players[0] ? players[1] : players[0]; // TODO do this better
        return currentPlayer;
    }

    void performPlayerTurn(Player player) {
        int choice = -1;
        do {
            int potentialChoice = InputHelper.getValidInput(player.getIcon());
            if (!getCell(potentialChoice).isChosen()) {
                choice = potentialChoice;
            } else {
                System.out.println("That selection has already been chosen. Please select another");
            }
        } while (choice < 0);
        getCell(choice).setPlayer(player);
    }

    Player getWinner() {
        return lines.stream().filter(it -> it.getWinner() != null).map(Line::getWinner).findFirst().orElse(null);
    }

    private Cell getCell(int id) {
        return cells[(id - 1) / 3][(id - 1) % 3];
    }
}


class Cell {
    private int id;
    private Player player;

    Cell(int id) {
        this.id = id;
    }

    boolean isChosen() {
        return player != null;
    }

    Player getPlayer() {
        return player;
    }

    void setPlayer(Player player) {
        this.player = player;
    }

    String display() {
        return isChosen() ? String.valueOf(player.getIcon()) : String.valueOf(id);
    }
}

class Player {
    private char icon;

    Player(char icon) {
        this.icon = icon;
    }

    char getIcon() {
        return icon;
    }
}

class Line {
    private List<Cell> cells;

    Line(List<Cell> cells) {
        this.cells = cells;
    }

    Player getWinner() {
        Player winner = null;
        if (cells.get(0).getPlayer() != null
          && cells.get(0).getPlayer() == cells.get(1).getPlayer()
          && cells.get(1).getPlayer() == cells.get(2).getPlayer()) {
            winner = cells.get(0).getPlayer();
        }
        return winner;
    }
}

class InputHelper {
    static Scanner scanner = new Scanner(System.in);
    static int getValidInput(char playerIcon) {
        int choice = -1;
        System.out.println("Player " + playerIcon + " select a number in range: ");
        while (!scanner.hasNext("[1-9]")) { // thanks Kiru
            System.out.println("Player " + playerIcon + " selection invalid. Please try again: ");
            scanner.next();
        }
        choice = Integer.parseInt(scanner.next());
        return choice;
    }
}

class SetupHelper {
    static Player[] initPlayers() {
        return new Player[] { new Player('X'), new Player('O') };
    }

    static Cell[][] initCells() {
        Cell[][] cells = new Cell[3][3];
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
              cells[row][column] = new Cell(row * 3 + column + 1);
            }
        }
        return cells;
    }

    static List<Line> initLines(Cell[][] cells) {
        List<Line> lines = new ArrayList<>();
        lines.add(new Line(of(cells[0][0], cells[0][1], cells[0][2])));
        lines.add(new Line(of(cells[1][0], cells[1][1], cells[1][2])));
        lines.add(new Line(of(cells[2][0], cells[2][1], cells[2][2])));

        lines.add(new Line(of(cells[0][0], cells[1][0], cells[2][0])));
        lines.add(new Line(of(cells[0][1], cells[1][1], cells[2][2])));
        lines.add(new Line(of(cells[0][2], cells[1][2], cells[2][2])));

        lines.add(new Line(of(cells[0][0], cells[1][1], cells[2][2])));
        lines.add(new Line(of(cells[0][2], cells[1][1], cells[2][0])));
        return lines;
    }
}