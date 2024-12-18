package com.example.project;

public class Day3 {
  public static String[][] generateSnowflake(int size) { // you will be tested on this method
    String[][] grid = new String[size][size];

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (i == j) { // Top left to bottom right
          grid[i][j] = "*";
        } else if (size - i - 1 == j) { // Top right to bottom left
          grid[i][j] = "*";
        } else if (i == size / 2) { // Horizontal center
          grid[i][j] = "*";
        } else if (j == size / 2) { // Vertical center
          grid[i][j] = "*";
        } else {
          grid[i][j] = " ";
        }
      }
    }

    return grid;
  }

  // Prints the snowflake will be useful if tests fail (you will not be tested on
  // this method)
  public static void printSnowflake(String[][] snowflake) {
    for (int i = 0; i < snowflake.length; i++) {
      for (int j = 0; j < snowflake[i].length; j++) {
        System.out.print(snowflake[i][j]);
      }
      System.out.println();
    }
  }

  // Test for the snowflake generation
  public static void main(String[] args) {
    printSnowflake(generateSnowflake(7));
  }
}
