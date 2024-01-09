package ReverseString;

public class Reverse4 {

	public static void main(String[] args) {
		String string = "a silver fox and a silver coin";
		String i= reverseString(string);
		System.out.println("Using substring method of recursion: "+ i);
	}
	public static String reverseString(String string) {
	    if (string == null || string.length() <= 1) {
	        return string;
	    }
	    return reverseString(string.substring(1)) + string.charAt(0);
	}
}
