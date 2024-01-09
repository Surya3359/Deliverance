package SwapStrings;

public class swapType2 {

	public static void main(String[] args) {
		String s1="a silver fox";
		String s2="a silver coin";
		String swap=swapStrings(s1,s2);
		System.out.println(swap);
	}
	public static String swapStrings(String s1, String s2) {
    System.out.println("Strings before swapping: " + s1 + " ---> " + s2);
	    String temp = s1;
	    s1 = s2;
	    s2 = temp;
	    System.out.println("Strings after swapping: " + s1 + " ---> " + s2);
		return null;
	}

}
