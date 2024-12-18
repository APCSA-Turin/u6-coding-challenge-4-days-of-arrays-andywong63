package com.example.project;

import java.util.Random;

public class Day1 {
    private static String[] elf_names = { "Glitter", "Chocolate", "Tiny", "Snowflake", "Frosty" };

    public static String generateElfName(String name) {
        if (name.equals("")) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        int index = (int) (Math.random() * elf_names.length);
        return elf_names[index] + " " + name;
    }
}