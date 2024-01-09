package Count_Substring;

public class SubstringCount {

	public static void main(String[] args) {
		  String string = "the quick brown fox jumps over the lazy dog";
	        String substring = "the";
	        int count = countSubstringOccurrences(string, substring);
	        System.out.println("Number of occurrences of substring in the string: " + count);
	}

	public static int countSubstringOccurrences(String string, String substring) {
        if (string == null || string.isEmpty() || substring == null || substring.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        int index = 0;
        while ((index = string.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        
        return count;
    }

}
