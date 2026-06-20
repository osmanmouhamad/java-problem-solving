package Problemslvl2;

import java.util.Scanner;

public class ConvertStringCase {

    public static String readString(String s, Scanner scan) {
        String a;
        do {
            System.out.println(s);
            a = scan.nextLine();
        } while (a.trim().isEmpty());

        return a;
    }

    public static String lowerCaseLetter(String s) {
        String result = "";
        

        for (int i = 0; i < s.length(); i++) {

           
                result += Character.toLowerCase(s.charAt(i));
        }

        return result;
    }
    public static String upperCaseLetter(String s) {
        String result = "";
        

        for (int i = 0; i < s.length(); i++) {

           
                result += Character.toUpperCase(s.charAt(i));
         
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = readString(("Enter a String:"),scan); 
        System.out.println("After Upper letters:");
        System.out.println(upperCaseLetter(text));
        System.out.println("After lower letters:");
        System.out.println(lowerCaseLetter(text));
      
        scan.close();
    }
}