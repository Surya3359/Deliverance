package Count_Duplicate_words;

import java.util.HashMap;
import java.util.Map;


public class countDuplicate {
	  public static void main(String[] args) {
	        String string = "The apartment was on the top floor which has a small living-room a small dining-room a small bedroom and a bath";
	        String[] words = string.toLowerCase().split(" ");
	        
	        Map<String, Integer> wordCount = new HashMap<>();
	        for (String word : words) {
	            if (wordCount.containsKey(word)) {
	                wordCount.put(word, wordCount.get(word) + 1);
	            } else {
	                wordCount.put(word, 1);
	            }
	        }
	        
	        System.out.println("Duplicate words are:");
	        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey());
	            }
	        }
	    }
}
