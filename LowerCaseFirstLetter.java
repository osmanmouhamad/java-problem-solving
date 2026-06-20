package Problemslvl2;

import java.util.Scanner;

public class LowerCaseFirstLetter {

    public static String readString(String s, Scanner scan) {
        String a;
        do {
            System.out.println(s);
            a = scan.nextLine();
        } while (a.trim().isEmpty());

        return a;
    }

    public static String lowerCaseFirstLetter(String s) {
        String result = "";
        boolean isFirstLetter = true;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ' && isFirstLetter) {
                result += Character.toLowerCase(s.charAt(i));
            } else {
                result += s.charAt(i);
            }

            isFirstLetter = (s.charAt(i) == ' ');
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = readString(("Enter a String:"),scan);
        System.out.println("After lower first letters:");
        System.out.println(lowerCaseFirstLetter(text));

        scan.close();
    }
}