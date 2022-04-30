package com.company;

import java.util.Random;
import java.util.Scanner;

public class TicTakToe {
    public static void main(String[] args) {
        playGame();
    }

    public static Scanner scan = new Scanner(System.in);

    public static String[][] board = new String[3][3];

    public static String playerName;

    public static String playerSymbol;
    public static String computerSymbol;

    public static int row, column;

    public static boolean winPlayer;
    public static boolean winComputer;

    public static void welcome() {
        System.out.println("Tic Tac Toe");
        System.out.println("Please enter your name");
        playerName = scan.nextLine();

        System.out.println(playerName + " vs Computer");
    }

    public static void initializeBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = "-";
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static boolean isPlayerTurn(){
        Random random = new Random();
        if (random.nextBoolean()) {
            playerSymbol = "X";
            computerSymbol = "O";
            return true;
        } else {
            playerSymbol = "O";
            computerSymbol = "X";
            return false;
        }
    }

    public static void playerTurn() {
        System.out.println(playerName + "s turn. Please input two coordinates from 0 to 2");
        row = scan.nextInt();
        column = scan.nextInt();

        if(board[row][column] == "-") {
            board[row][column] = playerSymbol;
            printBoard();
            System.out.println();
        } else {
            System.out.println("Invalid input. Please go again");
            playerTurn();
        }

        if (checkWin()) {
            winPlayer = true;
        }
    }

    public static void computerTurn() {
        Random random = new Random();
        row = random.nextInt(3);
        column = random.nextInt(3);
        if(board[row][column] == "-") {
            board[row][column] = computerSymbol;
            System.out.println("Computers turn");
            printBoard();
            System.out.println();
        } else {
            computerTurn();
        }
        if (checkWin()) {
            winComputer = true;
        }
    }

    public static boolean checkWin() {
        return (checkDiagonalWin() || checkHorizontalWin() || checkVerticalWin());
    }

    public static boolean checkHorizontalWin() {
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                if (board[i][j] == board[i][j + 1] && board[i][j] != "-") {
//                    return true;
//                }
//            }
//        }
        if ((board[0][0] == board[0][1]) && (board[0][0] == board[0][2]) && (board[0][0] != "-")) {
            return true;
        }
        if ((board[1][0] == board[1][1]) && (board[1][0] == board[1][2]) && (board[1][0] != "-")) {
            return true;
        }
        if ((board[2][0] == board[2][1]) && (board[2][0] == board[2][2]) && (board[2][0] != "-")) {
            return true;
        }
        return false;
    }

    public static boolean checkVerticalWin() {
        if ((board[0][0] == board[1][0]) && (board[0][0] == board[2][0]) && (board[0][0] != "-")) {
            return true;
        }
        if ((board[0][1] == board[1][1]) && (board[0][1] == board[2][1]) && (board[0][1] != "-")) {
            return true;
        }
        if ((board[0][2] == board[1][2]) && (board[0][2] == board[2][2]) && (board[0][2] != "-")) {
            return true;
        }
        return false;
    }

    public static boolean checkDiagonalWin() {
        if ((board[0][0] == board[1][1]) && (board[0][0] == board[2][2]) && (board[1][1] != "-")) {
            return true;
        }
        if ((board[0][2] == board[1][1]) && (board[0][2] == board[2][0]) && (board[1][1] != "-")) {
            return true;
        }
        return false;
    }

    public static boolean checkDraw() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == "-") {
                    return false;
                }
            }
        }
        return true;
    }

    public static void playGame() {
        welcome();
        initializeBoard();
        printBoard();
        System.out.println();

        if (isPlayerTurn()) {
            while ((!checkWin()) && (!checkDraw())) {
                playerTurn();
                if ((!checkWin()) && (!checkDraw())) {
                    computerTurn();
                }
            }
        } else {
            while ((!checkWin()) && (!checkDraw())) {
                computerTurn();
                if ((!checkWin()) && (!checkDraw())) {
                    playerTurn();
                }
            }
        }

        if (winPlayer){
            System.out.println("The winner is " + playerName);
        }

        if (winComputer) {
            System.out.println("The winner is Computer");
        }

        if (checkDraw() && !checkWin()) {
            System.out.println("Draw");
        }
    }

}
