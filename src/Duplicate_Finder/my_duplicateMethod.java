package Duplicate_Finder;

import java.util.Scanner;

public class my_duplicateMethod {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Sentence:");
			String s= scan.next();
			findDupes(s);
	}
	public static void findDupes(String s) {
		String x=s.trim().toLowerCase();
		char arr[]=x.toCharArray();
		int ln=x.length();
		for(int i=0;i<ln;i++) {
			char at=x.charAt(i);
		}
	}

}
