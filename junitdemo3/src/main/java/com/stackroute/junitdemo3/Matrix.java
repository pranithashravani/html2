package com.stackroute.junitdemo3;

public class Matrix {
    public int[][] Sum(int row, int column, int matrix1[][], int matrix2[][]) {
        int sum[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }
}
