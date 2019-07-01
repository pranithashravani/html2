package com.stackroute.junitdemo3;

public class Exception2 {
    public static void main(String args[]) {
        int result = 0;
        int arraySize = 3;
        int badSize = -1;
        String s= null;
        int[] array=null;
        int a[]=new int[5];

        for(int choice = 0; choice<3 ; ++choice)
            try {
                switch(choice) {
                    case 0:
                        System.out.println(s.length());
                        break;
                    case 1:
                        array = new int[badSize];
                        break;
                    case 2:
                       a[10]=50;

                        break;
                }
            } catch(NullPointerException e) {
                System.out.println("\nNullPointerException Exception caught. " +
                        "Message in NullPointerException is:\n" +
                        "\n" + e + "\n");

                e.printStackTrace();
            } catch(NegativeArraySizeException e) {
                System.out.println("\nNegativeArraySizeException Exception caught. " +
                        "Message in NegativeArraySizeException is:\n" +
                        "\n" + e + "\n");

                e.printStackTrace();
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("\nArrayIndexOutOfBoundsException Exception caught. " +
                        "Message in ArrayIndexOutOfBoundsException is:\n" +
                        "\n" + e + "\n");

                e.printStackTrace();
            }
    }
}

