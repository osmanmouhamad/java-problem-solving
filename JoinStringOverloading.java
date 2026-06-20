package Problemslvl2;

import java.util.ArrayList;

public class JoinStringOverloading {

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
    public static String joinString(String[] arr, String delim) {

        String result = "";

        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + delim;
        }

        if (arr.length == 0) {
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

        String[] arr = {
                "Mohammed",
                "Faid",
                "Ali",
                "Maher"
        };

        System.out.println("ArrayList after join:");
        System.out.println(joinString(words, " "));

        System.out.println("\nArray after join:");
        System.out.println(joinString(arr, " "));
    }
}