package StringIsLetters;

public class CharIsLetter {

	public static void main(String[] args) {
		String s1="silverfox";
		boolean letter=containsOnlyLetters(s1);
		System.out.println("In Letter formate--->"+letter);
		
		
	}
	public static boolean containsOnlyLetters(String string) {
	    if (string == null || string.isEmpty()) {
	        return false;
	    }
	    for (int i = 0; i < string.length(); i++) {
	        if (!Character.isLetter(string.charAt(i))) {
	            return false;
	        }
	    }
	    return true;
	}

}
