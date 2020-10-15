package gayer.javacert.justmytype;

import java.util.Scanner;

public class StabbingArrays {
    public static void main(String[] args){

        //initializing the board
        int boardHeight, boardWidth;
        boardHeight = 6;
        boardWidth = 10;

        char[][] board = new char[boardHeight][boardWidth];

        //blank board
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board[row].length; column++){
                board[row][column]='O';
            }
        }

        //print board
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board[row].length; column++){
                System.out.print(board[row][column] + "  ");
            }
            System.out.println();
        }

//        Thread.sleep(4000);

        //dropping person in random spot
        int x,y;
        y = (int)(Math.random() * boardHeight);
        x = (int)(Math.random() * boardWidth);

        System.out.println();
        System.out.println("Dropping you in a random place... (" + x +", " + y + ")");

        board[y][x] = 'K';

        //decide if a column or row gets axed
        int coin = (int) (Math.random() * 2);



        if(coin < 1){
            //row
            System.out.println("Destroying Row...");
            int randomRow = (int)(Math.random() * boardHeight);
            for(int count = 0; count <= (boardWidth -1); count++){
                if((randomRow == y) && (count == x)){
                    board[randomRow][count]='!';
                } else {
                    board[randomRow][count]='X';
                }

            }

        } else {
            //column
            System.out.println("Destroying Column.... ");
            int randomColumn = (int)(Math.random() * boardWidth);
            for(int count = 0; count <= (boardHeight -1); count++){
                if((count == y) && (randomColumn == x)){
                    board[count][randomColumn]='!';
                } else {
                    board[count][randomColumn]='X';
                }


            }
        }

        //print board
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board[row].length; column++){
                System.out.print(board[row][column] + "  ");
            }
            System.out.println();
        }

        if(board[y][x] == '!') {
            System.out.println("You died!!!");
        } else {
            System.out.println("You Lived!!!");
        }

    }
}
