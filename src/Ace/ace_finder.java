package Ace;

import java.io.SequenceInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ace_finder {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word in String 1:");
		String a=scan.next();
		
		Scanner dune=new Scanner(System.in);
		System.out.println("Enter the word in String 2:");
		String b=dune.next();	
		
		char[]a1=a.toCharArray();
		char[]b1=b.toCharArray();
		
		boolean subseq = subSequence(a, b);
		if(subseq) {
			System.out.println("yes "+b+" is subsequence of "+a);
		}else {
			System.out.println("No "+b+" is not a subsequence of "+a);
		}
		
	}
	public static boolean subSequence(String a, String b) {
		
		int i=0;
		int j=0;
		
		while(i<a.length() && j<b.length()) {
			if(a.charAt(i)==b.charAt(j)) {
				i++;
				j++;
			}else {
				i++;
			}
		}return j==b.length();
	}
	}
