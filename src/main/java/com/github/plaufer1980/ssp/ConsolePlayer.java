package com.github.plaufer1980.ssp;

import java.util.Scanner;

public class ConsolePlayer extends Player {

    private final Scanner scanner = new Scanner(System.in);

    ConsolePlayer(String name) {
        super(name);
    }

    @Override
    public Choice choose() {
        System.out.print("Choose: ");
        return Choice.valueOf(scanner.next());
    }

}
