package Problemslvl2;

import java.util.Scanner;

public class CountWordInString {

    public static String readString(String message, Scanner scan) {
        String text;

        do {
            System.out.print(message);
            text = scan.nextLine();
        } while (text.trim().isEmpty());

        return text;
    }

    public static int countWordsInString(String text) {

        String delimiter = " ";
        int position;
        String word;
        int counter = 0;

        while ((position = text.indexOf(delimiter)) != -1) {

            word = text.substring(0, position);

            if (!word.isEmpty()) {
                counter++;
            }

            text = text.substring(position + delimiter.length());
        }

        if (!text.isEmpty()) {
            counter++;
        }

        return counter;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text = readString("Please enter your text: ", scan);

        int number = countWordsInString(text);

        System.out.println(" The number of words in this text is: " + number);

        scan.close();
    }
}