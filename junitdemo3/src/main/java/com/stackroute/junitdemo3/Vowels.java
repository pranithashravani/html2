package com.stackroute.junitdemo3;

public class Vowels {

        public String[] removeVowels(String[] places) {
            String[] arr = new String[places.length];
            for (int i = 0; i < places.length; i++) {
                char ch;
                ch = places[i].charAt(0);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                        arr[i] = places[i].charAt(0) + places[i].replaceAll("[AEIOUaeiou]", "");
                    }
                else {
                    arr[i] = places[i].replaceAll("[AEIOUaeiou]", "");

                }
            }

            return arr;
        }
    }

