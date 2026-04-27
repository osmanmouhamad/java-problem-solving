package Problemslvl1;

public class Problem16 {
public static void PrintLetter() {
	
	for (int i = 65  ;i<=90;i++) {
	for(int j =65;j<=90 ;j++) {
		for(int k = 65;k<=90;k++) {
			String word = "";
			word = word + (char)i;
			word = word + (char)j;
			word = word + (char)k;
			System.out.println(word);
		}
		System.out.println();
	}
	System.out.println();
		}
		
	}
public static void main(String[] args) {
		PrintLetter();
	}

}
