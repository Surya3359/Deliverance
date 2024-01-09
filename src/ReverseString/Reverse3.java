package ReverseString;

public class Reverse3 {

	public static void main(String[] args) {
			
		String string = "a silver fox and a silver coin";
		String i= reverseString(string);
		System.out.println("Using String buffer: "+ i);
	}

	public static String reverseString(String string) {
	    if (string == null) {
	        return null;
	    }
	    StringBuffer reversed = new StringBuffer(string);
	    return reversed.reverse().toString();
	}

}
