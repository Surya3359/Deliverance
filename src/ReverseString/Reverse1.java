package ReverseString;

public class Reverse1 {

	public static void main(String[] args) {

		
		String string = "a silver fox and a silver coin";
		String i=reverseString(string);
		System.out.println("Using loop and concat method: "+ i);
	

}

public static String reverseString(String string) {
    if (string == null) {
        return null;
    }
    String reversed = "";
    for (int i = string.length() - 1; i >= 0; i--) {
        reversed += string.charAt(i);
    }
    return reversed;
}
}