
package com.example.project;

public class Day2 {
    public static String[][] nameSort(String[] names) { // your will be tested on this method
        String[][] list = new String[2][names.length];
        int niceIndex = -1;
        int naughtyIndex = -1;
        for (int i = 0; i < names.length; i++) {
            if (Math.random() < 0.5) {
                niceIndex++;
                list[0][niceIndex] = names[i];
            } else {
                naughtyIndex++;
                list[1][naughtyIndex] = names[i];
            }
        }
        return list;
    }

    public static void main(String[] args) {
    }
}