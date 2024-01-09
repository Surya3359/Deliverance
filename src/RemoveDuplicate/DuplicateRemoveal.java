package RemoveDuplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateRemoveal {
	  public static void main(String[] args) {
	        String string = "the quick brown fox jumps over the lazy dog the quick brown fox";
	        String[] words = string.split(" ");
	        String[] uniqueWords = removeDuplicateWords(words);
	        System.out.println("String after removing duplicate words: " + String.join(" ", uniqueWords));
	    }
	    
	    public static String[] removeDuplicateWords(String[] words) {
	        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
	        return uniqueWords.toArray(new String[0]);
	    }
}
