package com.company;

import java.util.Scanner;

public class GeometricFigures {
    public static void main(String[] args) {

        setka();
    }

    public static int input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number greater than 1:");
        int n = input.nextInt();
        return n;
    }

    public static void rectangular1() {
        int n = input();
        for (int i = 0; i < n + 3; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void rectangular2() {
        int n = input();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 3; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void emptySquare() {
        int n = input();
        for (int i = 0; i < n; i++) {

            if (i == 0 || i == (n - 1)) {

                for (int j = 0; j < (n - 1); j++) {
                    System.out.print("*  ");
                }

            } else {
                System.out.print("*  ");
                for (int j = 0; j < (n - 2); j++) {
                    System.out.print("   ");
                }
            }
            System.out.println("*  ");
        }
    }

    public static void triangle1() {
        int n = input();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void triangle2() {
        int n = input();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void triangle3() {
        int n = input();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("   ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void triangle4() {
        int n = input();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void emptyTriangle() {
        int n = input();
        for (int i = 0; i <= n; i++) {
            if (i == n) {
                for (int j = 0; j <= n; j++) {
                    System.out.print("*  ");
                }
            } else {
                System.out.print("*  ");
                for (int j = 0; j < (i - 1); j++) {
                    System.out.print("   ");
                }
                if (i != 0) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void diagonal1() {
        int n = input();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*   ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }

    }

    public static void diagonal2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any even number greater than 3:");
        int n = input.nextInt();
        if (n % 2 == 0 && n > 3) {
            for (int i = 1; i <= n; i += 2) {
                for (int j = 0; j <= n - i; j += 2) {
                    System.out.print("  ");
                }
                for (int j = i; j > 0; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            for (int i = n - 2; i >= 0; i -= 2) {
                for (int j = 0; j <= n - i; j += 2) {
                    System.out.print("  ");
                }
                for (int j = 1; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            if (n % 2 != 0) {
                System.out.println("The entered number is odd!");
                diagonal2();
            } else if (n <= 3) {
                System.out.println("The entered number is less than 3!");
                diagonal2();
            }
        }
    }

    public static void emptyDiagonal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any even number greater than 3:");
        int n = input.nextInt();
        if (n % 2 == 0 && n > 3) {
            for (int i = 1; i <= n; i += 2) {
                for (int j = 0; j <= n - i; j += 2) {
                    System.out.print("  ");
                }
                System.out.print("* ");
                for (int j = (i - 2); j > 0; j--) {
                    System.out.print("  ");
                }
                if (i != 1) {
                    System.out.println("*");
                } else {
                    System.out.println();
                }
            }

            for (int i = n - 2; i > 0; i -= 2) {
                for (int j = 0; j <= n - i; j += 2) {
                    System.out.print("  ");
                }
                System.out.print("* ");
                for (int j = 1; j < (i - 2); j++) {
                    System.out.print("  ");
                }
                if (i != 2) {
                    System.out.println("*");
                } else {
                    System.out.println();
                }
            }
        } else {
            if (n % 2 != 0) {
                System.out.println("The entered number is odd!");
                emptyDiagonal();
            } else if (n <= 3) {
                System.out.println("The entered number is less than 3!");
                emptyDiagonal();
            }
        }
    }

    public static void setka() {
        for (int i = 0; i < 10; i++) {
            if ((i == 0) || (i == 3) || (i == 6) || (i == 9)) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("*  ");
                }
            } else {
                System.out.print("*  ");
                for (int j = 0; j < 9; j++) {
                    if ((j == 2) || (j == 5) || (j == 8)) {
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }

}
