package ReverseString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse5 {

	public static void main(String[] args) {
		String string = "a silver fox and a silver coin";
		String i= reverseString(string);
		System.out.println("Using substring method: "+ i);
	}
	public static String reverseString(String string) {
	    if (string == null) {
	        return null;
	    }
	    List<Character> chars = new ArrayList<>();
	    for (char c : string.toCharArray()) {
	        chars.add(c);
	    }
	    Collections.reverse(chars);
	    StringBuilder reversed = new StringBuilder(chars.size());
	    for (char c : chars) {
	        reversed.append(c);
	    }
	    return reversed.toString();
	}
}
