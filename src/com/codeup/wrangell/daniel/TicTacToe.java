package com.codeup.wrangell.daniel;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    private char[][] board;

    private char currentTurn;

    public char whosTurn() {
        return this.currentTurn;
    }

    public TicTacToe() {
        this.board = new char[3][3];
        for (char[] row:board) {
            Arrays.fill(row, ' ');
        }
        // X goes first
        this.currentTurn = 'X';
        this.printBoard();
    }

    public void printBoard() {
        for (char[] row : this.board) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (char cell : row) {
                System.out.print(cell + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");
        System.out.println("It is " +this.currentTurn+ "'s turn.");
    }

    public void takeTurn(int row, int col) {
        if (board[row][col] == ' ') {
            board[row][col] = this.currentTurn;
            if (this.currentTurn == 'X') this.currentTurn = 'O';
            else this.currentTurn = 'X';
        } else {
            System.out.println("That square is occupied");
        }
        this.printBoard();
    }

    public void takeTurn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where would you like to go? (i.e. 0 2)");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        this.takeTurn(row,col);
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
//        game.takeTurn(1,1);
//        game.takeTurn(2,2);
//        game.takeTurn(1,2);
//        game.takeTurn(1,0);
//        game.takeTurn(2,0);
//        game.takeTurn(0,2);
//        game.takeTurn(0,1);
//        game.takeTurn(2,1);
//        game.takeTurn(0,0);

        while (true) {
            game.takeTurn();
        }

    }

}
