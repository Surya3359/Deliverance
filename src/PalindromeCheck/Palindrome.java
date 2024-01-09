package PalindromeCheck;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the palindrome text:");
		 String s = scan.next();
	        boolean isPalindrome = isPalindrome(s);
	        if (isPalindrome) {
	            System.out.println(s + " is a palindrome");
	        } else {
	            System.out.println(s + " is not a palindrome");
	        }
	}
	 public static boolean isPalindrome(String string) {
	        if (string == null || string.isEmpty()) {
	            return false;
	        }
	        
	        string = string.toLowerCase();
	        int left = 0;
	        int right = string.length() - 1;
	        while (left < right) {
	            if (string.charAt(left) != string.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        
	        return true;
	    }
}
