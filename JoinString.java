package Problemslvl2;

import java.util.ArrayList;

public class JoinString {

    public static String joinString(ArrayList<String> words, String delim) {

        String result = "";

        for (String word : words) {
            result += word + delim;
        }

        if (words.isEmpty()) {
            return "";
        }

        return result.substring(0, result.length() - delim.length());
    }

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Mohammed");
        words.add("Faid");
        words.add("Ali");
        words.add("Maher");

        System.out.println("Vector after join:\n");
        System.out.println(joinString(words, " "));
    }
}