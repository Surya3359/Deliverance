package SwapStrings;

public class SwapUsingConcatSubstring {

	public static void main(String[] args) {
		String s1="a silver fox";
		String s2="a silver coin";
		String swap=swapStrings(s1,s2);
		System.out.println(swap);
	}
	public static String swapStrings(String s1, String s2) {
	    System.out.println("Strings before swapping: " + s1 + " " + s2);
	    s1 = s1 + s2;
	    s2 = s1.substring(0, s1.length() - s2.length());
	    s1 = s1.substring(s2.length());
	    System.out.println("Strings after swapping: " + s1 + " " + s2);
		return null;
		}
}
