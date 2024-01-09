package Permutations;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindPermutations {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 	System.out.println("Enter the String here:");
		 	String s=scan.next();
	        Set<String> permutations = getPermutations(s);
	        System.out.println("All permutations of the string:");
	        for (String permutation : permutations) {
	            System.out.println(permutation);
	}
}	        
	        public static Set<String> getPermutations(String s) {
	            Set<String> permutations = new HashSet<>();
	            if (s == null || s.isEmpty()) {
	                permutations.add("");
	                return permutations;
	            }
	            
	            else { char first = s.charAt(0);
	            String remaining = s.substring(1);
	            Set<String> words = getPermutations(remaining);
	            for (String word : words) {
	                for (int i = 0; i <= word.length(); i++) {
	                    String permutation = insertCharAt(word, first, i);
	                    permutations.add(permutation);
	                }
	            }
	           }
	            return permutations;
	        }
	        
	        public static String insertCharAt(String s, char c, int index) {
	            String start = s.substring(0, index);
	            String end = s.substring(index);
	            return start + c + end;
	        }
}
