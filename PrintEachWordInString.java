package Problemslvl2;

import java.util.Scanner;

public class PrintEachWordInString {

    public static String readString(String message, Scanner scan) {
        String text;
        do {
            System.out.println(message);
            text = scan.nextLine();
        } while (text.trim().isEmpty());

        return text;
    }

    public static void printEachWordInString(String a) {

        String delimiter = " ";
        int p;
        String w;

        System.out.println("Your string words are: ");

        while ((p = a.indexOf(delimiter)) != -1) {

            w = a.substring(0, p);

            if (!w.isEmpty()) {
                System.out.println(w);
            }

            a = a.substring(p + delimiter.length());
        }

        if (!a.isEmpty()) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = readString("Please enter your text:", scan);
        printEachWordInString(text);
             

        scan.close();
    }
}