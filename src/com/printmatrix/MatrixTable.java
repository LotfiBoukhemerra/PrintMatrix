/*
 * CopyRight © 2022, LOTFI BOUKHEMERRA.
 * All rights reserved.
 */
package com.printmatrix;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Lotfi BOUKHEMERRA.
 * @repository https://github.com/LotfiBoukhemerra
 */
public class MatrixTable {

    public static void printMatrix(int[][] matrix) {
        int cellWidth = 0;
        for (int[] row : matrix) {
            for (int x : row) {
                cellWidth = String.valueOf(x).length() > cellWidth ? String.valueOf(x).length() : cellWidth;
            }
        }
        System.out.print("\n");
        int matrixWidth = matrix.length * (cellWidth + 2) + (matrix.length - 1);
        for (int row = 0; row < matrix.length; row++) {
            System.out.print("+");
            for (int i = 0; i < matrixWidth; i++) {
                System.out.print("-");
            }
            System.out.println("+");
            int distance;
            String after = "";
            for (int i = 1; i <= matrix[row].length; i++) {
                distance = cellWidth - String.valueOf(matrix[row][i - 1]).length();
                for (int j = 0; j < distance; j++) {
                    after += " ";
                }
                System.out.printf("| %d%S ", matrix[row][i - 1], after);
                after = "";
            }
            System.out.println("|");
            if (row == matrix.length - 1) {
                System.out.print("+");
                for (int i = 0; i < matrixWidth; i++) {
                    System.out.print("-");
                }
                System.out.println("+");
            }
        }//nd first for loop.
    }//end printMatrix

    public static void printMatrix(String[][] matrix) {
        int cellWidth = 0;
        for (String[] row : matrix) {
            for (String x : row) {
                if (x != null) {
                    cellWidth = x.length() > cellWidth ? x.length() : cellWidth;
                }
            }
        }
        System.out.print("\n");
        int matrixWidth = matrix.length * (cellWidth + 2) + (matrix.length - 1);
        for (int row = 0; row < matrix.length; row++) {
            System.out.print("+");
            for (int i = 0; i < matrixWidth; i++) {
                System.out.print("-");
            }
            System.out.println("+");
            int distance;
            String after = "";
            for (int i = 1; i <= matrix[row].length; i++) {
                distance = matrix[row][i - 1] == null ? cellWidth - 4 : cellWidth - matrix[row][i - 1].length();
                for (int j = 0; j < distance; j++) {
                    after += " ";
                }
                System.out.printf("| %s%s ", matrix[row][i - 1], after);
                after = "";
            }
            System.out.println("|");
            if (row == matrix.length - 1) {
                System.out.print("+");
                for (int i = 0; i < matrixWidth; i++) {
                    System.out.print("-");
                }
                System.out.println("+");
            }
        }//nd first for loop.
    }//end printMatrix

    public static void exportToFile(int[][] matrix, String path) {
        List<String> lines = new ArrayList<>();
        String line;
        int cellWidth = 0;
        for (int[] row : matrix) {
            for (int x : row) {
                cellWidth = String.valueOf(x).length() > cellWidth ? String.valueOf(x).length() : cellWidth;
            }
        }
        int matrixWidth = matrix.length * (cellWidth + 2) + (matrix.length - 1);
        for (int row = 0; row < matrix.length; row++) {
            line = new String();
            line += "+";
            for (int i = 0; i < matrixWidth; i++) {
                line += "-";
            }
            line += "+\n";
            lines.add(line);
            line = new String();
            int distance;
            String after = new String();
            for (int i = 1; i <= matrix[row].length; i++) {
                distance = cellWidth - String.valueOf(matrix[row][i - 1]).length();
                for (int j = 0; j < distance; j++) {
                    after += " ";
                }
                line += String.format("| %d%S ", matrix[row][i - 1], after);
                after = new String();
            }
            line += "|\n";
            lines.add(line);
            line = new String();
            if (row == matrix.length - 1) {
                line += "+";
                for (int i = 0; i < matrixWidth; i++) {
                    line += "-";
                }
                line += "+\n";
                lines.add(line);
            }
        }//nd first for loop. 
        PrintWriter writer;
        try {
            writer = new PrintWriter(path);
            lines.forEach(writer::println);
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MatrixTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//end exportToFile
    
    public static void exportToFile(String[][] matrix, String path) {
        List<String> lines = new ArrayList<>();
        String line;
        int cellWidth = 0;
        for (String[] row : matrix) {
            for (String x : row) {
                cellWidth = x.length() > cellWidth ? x.length() : cellWidth;
            }
        }
        int matrixWidth = matrix.length * (cellWidth + 2) + (matrix.length - 1);
        for (int row = 0; row < matrix.length; row++) {
            line = new String();
            line += "+";
            for (int i = 0; i < matrixWidth; i++) {
                line += "-";
            }
            line += "+\n";
            lines.add(line);
            line = new String();
            int distance;
            String after = new String();
            for (int i = 1; i <= matrix[row].length; i++) {
                distance = cellWidth - matrix[row][i - 1].length();
                for (int j = 0; j < distance; j++) {
                    after += " ";
                }
                line += String.format("| %s%s ", matrix[row][i - 1], after);
                after = new String();
            }
            line += "|\n";
            lines.add(line);
            line = new String();
            if (row == matrix.length - 1) {
                line += "+";
                for (int i = 0; i < matrixWidth; i++) {
                    line += "-";
                }
                line += "+\n";
                lines.add(line);
            }
        }//nd first for loop. 
        PrintWriter writer;
        try {
            writer = new PrintWriter(path);
            lines.forEach(writer::println);
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MatrixTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//end exportToFile

}
