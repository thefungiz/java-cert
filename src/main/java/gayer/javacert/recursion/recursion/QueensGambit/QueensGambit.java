package gayer.javacert.recursion.recursion.QueensGambit;

import java.util.Arrays;

public class QueensGambit {

    //https://codepumpkin.com/n-queen-problem/

    public static QueenPosition[] positions;


    public static void main (String[] args){
        //how many queens and how many rows/columns.
        int numberOfQueens = 8;

        positions = new QueenPosition[numberOfQueens];

        if(isQueenSafe(numberOfQueens,0)){

            int[][] result = new int[numberOfQueens][numberOfQueens];

            //wtf
            Arrays.stream(positions).forEach(pos->result[pos.row][pos.column]=1);

            System.out.println("Resulsts");

            //wtf x 2
            Arrays.stream(result).forEach(rw -> Arrays.stream(rw).forEach(rw1 -> System.out.println(rw1 + " ")));
            System.out.println();



        } else {
            System.out.println("Solution Not Available");
        }

    }

    public static boolean isQueenSafe(int number, int row){



        //mathly proven conditions
        if(number == 2 || number == 3) return false;
        if(row == number) return  true;

        for(int column = 0; column < number; column ++){
            boolean isSafe = true;

            positions[row] = new QueenPosition(row,column);

            for(int placedQueen = 0; placedQueen < row; placedQueen++){
                if(positions[placedQueen].column == column ||
                        positions[placedQueen].row-positions[placedQueen].column == row - column ||
                        positions[placedQueen].row+positions[placedQueen].column == row + column ) {
                    isSafe = false;
                }

            }


        }

        return false;
    }


}
