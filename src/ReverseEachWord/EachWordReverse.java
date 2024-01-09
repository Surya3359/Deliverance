package ReverseEachWord;

public class EachWordReverse {
	public static void main(String[] args) {
        String string = "winter is coming";
        String reversed = reverseWords(string);
        System.out.println("String after reversing each word: " + reversed);
    }
    
    public static String reverseWords(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        
        String[] words = string.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder wordBuilder = new StringBuilder(word);
            reversed.append(wordBuilder.reverse()).append(" ");
        }
        return reversed.toString().trim();
    }
}
