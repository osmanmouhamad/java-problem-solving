package Problemslvl2;

import java.util.Scanner;
public class InvertString {

    public static String readString(String s, Scanner scan) {
        String a;
        do {
            System.out.println(s);
            a = scan.nextLine();
        } while (a.trim().isEmpty());

        return a;
    }

    public static String InvertallLetters(String s) {
        String result = "";
        

        for (int i = 0; i < s.length(); i++) {

            if (Character.isLowerCase(s.charAt(i)) ) {
                result += Character.toUpperCase(s.charAt(i));
            } else {
                result += Character.toLowerCase(s.charAt(i));
            }

        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = readString(("Enter a String:"),scan);
        System.out.println("After Inverting all letters:");
        System.out.println(InvertallLetters(text));

        scan.close();
    }
}