package CharRepetition;

import java.util.HashMap;
import java.util.Map;

public class CharRepeat {
	  public static void main(String[] args) {
		  String string = "the quick brown fox jumps over the lazy dog";
	      Map<Character, Integer> charCount = countCharacters(string);
	      System.out.println("Occurrences of each character in the string:");
	      for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
	          System.out.println(entry.getKey() + ": " + entry.getValue());
      }
  }
  
  public static Map<Character, Integer> countCharacters(String string) {
      if (string == null || string.isEmpty()) {
          return new HashMap<>();
      }
      
      Map<Character, Integer> charCount = new HashMap<>();
      for (char c : string.toCharArray()) {
          if (charCount.containsKey(c)) {
              charCount.put(c, charCount.get(c) + 1);
          } else {
              charCount.put(c, 1);
          }
      }
      
      return charCount;
  }

}
