package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean showTree = false;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("> ");

            String line = scanner.nextLine();
            if (line.trim().isEmpty()) {
                return;
            }

            if (line.equals("#showTree"))
            {
                showTree = !showTree;
                System.out.println(showTree ? "Showing parse trees." : "Not showing parse trees");
                continue;
            }
            else if (line.equals("#cls"))
            {
                clearScreen();
                continue;
            }
        }
    }
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}