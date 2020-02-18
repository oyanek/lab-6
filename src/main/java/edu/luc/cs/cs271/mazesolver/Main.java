package edu.luc.cs.cs271.mazesolver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(final String[] args) {

    // create scanner for data input
    final Scanner input = new Scanner(System.in);

    // TODO read row and column for the starting point
    final int startRow = -1;
    final int startCol = -1;

    // TODO read maze data as rows
    final List<String> rawData = new ArrayList<>();

    // attempt to solve the maze and print the result
    final Maze maze = new Maze(rawData);
    final boolean result = maze.solve(startRow, startCol);
    maze.print(System.out);
    System.out.println();
    System.out.println(result ? "We're so out of here!" : "Bummer, we're stuck...");
  }
}
