package LetterOrDigits;

public class method2 {

	public static void main(String[] args) {

	}
	public static boolean containsOnlyLettersOrDigits(String string) {
	    if (string == null || string.isEmpty()) {
	        return false;
	    }
	    for (int i = 0; i < string.length(); i++) {
	        if (!Character.isLetterOrDigit(string.charAt(i))) {
	            return false;
	           }
	    }
	    return true;
	}
}
