package Problemslvl2;

import java.util.ArrayList;
import java.util.Scanner;

public class SplitString {

    public static String readString(String message, Scanner scan) {
        String text;

        do {
            System.out.println(message);
            text = scan.nextLine();
        } while (text.trim().isEmpty());

        return text;
    }

    public static ArrayList<String> splitString(String text, String delimiter) {

        ArrayList<String> words = new ArrayList<>();

        int position;
        String word;

        while ((position = text.indexOf(delimiter)) != -1) {

            word = text.substring(0, position);

            if (!word.isEmpty()) {
                words.add(word);
            }

            text = text.substring(position + delimiter.length());
        }

        if (!text.isEmpty()) {
            words.add(text);
        }

        return words;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<String> words = splitString(
                readString("Please enter your string:", scan), " "
        );

        System.out.println("\nTokens = " + words.size());

        for (String word : words) {
            System.out.println(word);
        }

        scan.close();
    }
}