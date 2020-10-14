package thefungiz.javacert.multidimensionalgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GameRunner {

    public static void main(String[] args) {
        Cell[][] board = new Cell[3][3];
        for (int i = 0; i < 3; i++) {
            final int finalI = i;
            IntStream.range(0, 2).forEach(it -> board[finalI][it] = new Cell(finalI * 3 + it + 1));
        }
        TicTacToeGame game = new TicTacToeGame(
                new Player[] { new Player('X'), new Player('O') },
                board);
        while (game.getWinner() == null) {
            Player currentPlayer = game.getNextPlayer();
            game.displayBoard();
            game.playerSelect(currentPlayer);
        }
        System.out.println("Winner was " + game.getWinner().getIcon());
    }
}

class TicTacToeGame {

    private Player[] players;
    private Cell[][] cells;
    private List<Line> lines;
    private Player currentPlayer;

    public TicTacToeGame(Player[] players, Cell[][] cells) {
        if (cells == null || cells[0] == null || cells.length != cells[0].length) { throw new RuntimeException("Invalid table size"); }
        this.players = players;
        this.cells = cells;
        this.lines = initLines(cells);
    }

    private static List<Line> initLines(Cell[][] cells) {
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < cells.length; i++) {
            final int finalI = i;
            lines.add(new Line(IntStream.range(0, cells.length).mapToObj(it -> cells[finalI][it]).collect(Collectors.toList())));
        }
        for (int i = 0; i < cells.length; i++) {
            final int finalI = i;
            lines.add(new Line(IntStream.range(0, cells.length).mapToObj(it -> cells[it][finalI]).collect(Collectors.toList())));
        }
        lines.add(new Line(IntStream.range(0, cells.length).mapToObj(it -> cells[it][it]).collect(Collectors.toList())));
        // todo add the final diagonal
        return lines;
    }

    public String displayBoard() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int border = 0; border < cells.length; border++) stringBuilder.append("===");
        for (int row = 0; row < cells.length; row++) {
            stringBuilder.append("|");
            for (int column = 0; column < cells[0].length; column++) {
                stringBuilder.append(cells[row][column].display());
                stringBuilder.append("|");
            }
            for (int border = 0; border < cells.length; border++) stringBuilder.append("===");
        }
        return stringBuilder.toString();
    }

    public Player getNextPlayer() {
        currentPlayer = currentPlayer == players[0] ? players[1] : players[0]; // TODO do this better
        return currentPlayer;
    }

    public void playerSelect(Player player) {
        int choice = -1;
        do {
            int potentialChoice = InputHelper.getValidInput(player.getIcon(), cells.length ^ 2);
            if (!getCell(potentialChoice).isChosen()) {
                choice = potentialChoice;
            } else {
                System.out.println("That selection has already been chosen. Please select another");
            }
        } while (choice < 0);
        getCell(choice).setPlayer(player);
    }

    public Player getWinner() {
        return lines.stream().filter(it -> it.getWinner() != null).map(Line::getWinner).findFirst().orElse(null);
    }

    private Cell getCell(int id) {
        return cells[id / cells.length][id % cells.length];
    }
}


class Cell {
    private int id;
    private Player player;

    public Cell(int id) {
        this.id = id;
    }

    public boolean isChosen() {
        return player != null;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String display() {
        return isChosen() ? String.valueOf(player.getIcon()) : String.valueOf(id);
    }
}

class Player {
    private char icon;

    public Player(char icon) {
        this.icon = icon;
    }

    public char getIcon() {
        return icon;
    }
}

class Line {
    private List<Cell> cells;

    public Line(List<Cell> cells) {
        this.cells = cells;
    }

    public Player getWinner() {
        Player winner = null;
        if (!cells.stream().allMatch(it -> it.getPlayer() == null)
                && cells.stream().allMatch(it -> cells.get(0).equals(it)))
            winner = cells.get(0).getPlayer();
        return winner;
    }
}

class InputHelper {
    public static int getValidInput(char playerIcon, int maxRange) {
        int choice = -1;
        try (Scanner scanner = new Scanner(System.in)) {
            while (choice < 0) {
                System.out.print("Player " + playerIcon + " select a number in range: ");
                String input = scanner.next();
                if (isInteger(input) && Integer.parseInt(input) <= maxRange) {
                    choice = Integer.parseInt(input);
                } else {
                    System.out.println("Input invalid. Please try again.");
                }
            }
        }
        return choice;
    }

    private static boolean isInteger(String input) {
        return input != null && input.matches("\\d+");
    }
}

class DisplayHelper {

}
