package com.stackroute.junitdemo3;

public class Chess {
    public String[][] boardDisplay(int row, int column) {
        {
            String output[][] = new String[row][column];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (((i + j) % 2) == 0) {
                        output[i][j] = "WW";
                    } else {
                        output[i][j] = "BB";
                    }

                }
            }
            return output;
        }
    }
}
