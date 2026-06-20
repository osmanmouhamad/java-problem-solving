package Problemslvl2;

public class TrimString {
public static String trimRight(String s ) {
	for (int i = s.length()-1 ; i>=0;i--) {
		if(s.charAt(i)!=' ') {
			return s.substring(0, i+1);
		}
	}
	return "";
}
public static String trimLeft(String s ) {
	for (int i = 0 ; i<s.length();i++) {
		if(s.charAt(i)!=' ') {
			return s.substring(i);
		}
	}
	return "";
}
public static String trim(String s ) {
	return (trimLeft(trimRight(s)));
}
public static void main(String[] args) {
    String s = "      I LOVE JAVA       ";
    System.out.println(trimLeft(s));
    System.out.println(trimRight(s));
    System.out.println(trim(s));
}
}
