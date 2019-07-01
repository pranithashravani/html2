package com.stackroute.junitdemo3;

public class Consecutive {
    boolean result = true;

    public boolean consecutive(String input) {
        String[] array = input.split(",");
        int len = array.length;
        if (len > 2) {
            for (int i = 0; i < len - 1; i++) {


                int difference = (Integer.parseInt(array[i + 1]) - Integer.parseInt(array[i]));
                if (difference == 1 || difference == -1) {
                    result = true;
                } else {
                    result = false;
                    break;
                }

            }
            return result;
        }
        else
        {
            return false;
        }
        }

}
