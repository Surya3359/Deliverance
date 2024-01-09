package StringIsDigit;

public class FindStringIsDigit {

	public static void main(String[] args) {
			String T="123456798";
			boolean Digit=containsOnlyDigits(T);
			System.out.println("In Digits formate--->"+Digit);
	}
	public static boolean containsOnlyDigits(String string) {
	    if (string == null || string.isEmpty()) {
	        return false;
	    }else {
	    
	    	for (int i = 0; i < string.length(); i++) {
	        if (!Character.isDigit(string.charAt(i))) {
	            return false;
	        }
	    }
	    return true;}
	}
}
