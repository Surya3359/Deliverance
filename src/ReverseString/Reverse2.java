package ReverseString;

public class Reverse2 {

	public static void main(String[] args) {

		String string = "a silver fox and a silver coin";
		String i= reverseString(string);
		System.out.println("Using String Builder: "+ i);
	
		
	}

	public static String reverseString(String string) {
	    if (string == null) {
	        return null;
	    }
	    StringBuilder reversed = new StringBuilder(string);
	    return reversed.reverse().toString();
	}

}
