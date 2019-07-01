package com.stackroute.junitdemo3;

public class Student {
    public String marks(int grades[], int numofStudents) {
        for (int i = 0; i < numofStudents; i++)
            if (grades[i] < 0 || grades[i] > 100) {
                return "failed";
            }

return "passed";
    }
}
