package PalindromeCheck;

import java.util.Scanner;

public class Type3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the palindrome word:");
		String a = scan.next();
		
		if(a.isEmpty()) {
			System.out.println("No Word entered");
		}else {
			palindormechecker(a);
		}
	}
	
	public static boolean palindormechecker(String a) {
		String x=a;
		StringBuilder str= new StringBuilder(x);
		
		System.out.println("String = "+ str.toString());
		StringBuilder revstr= str.reverse();
		revstr.toString();
		if(revstr==str){
			System.out.println("given String: "+a+" is a palindrome");
		}else if(revstr!=str) {
			System.out.println("given String: "+a+" is not a palindrome");
		}
		return true;
	}
	
}
