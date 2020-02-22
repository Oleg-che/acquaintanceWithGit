package com.cherednik;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Text {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Text.txt");
        Scanner scanner = new Scanner(file);
        int words = 0;
        int lines = 0;
        int characters = 0;

        while (scanner.hasNextLine()) {
            lines++;
            String[] array = scanner.nextLine().split(" ");
            words = words + array.length;
            for (int i = 0; i < file.length() ; i++) {
                characters++;
            }
        }

        System.out.println("Number of words: " + words);
        System.out.println("Number of lines: " + lines);
        System.out.println("Number of characters: " + characters);

    }
}
