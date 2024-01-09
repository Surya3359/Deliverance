package WordCounting;

public class CountWords {
	 public static void main(String[] args) {
	        String quotes = "when you have eliminated the impossible whatever remains however improbable must be the truth";
	        int count = cntwrd(quotes);
	        System.out.println("Total Number of words in this sentence: " + count);
	    }
	    
	    public static int cntwrd(String quotes) {
	        if (quotes == null || quotes.isEmpty()) {
	            return 0;
	        }
	        else {
	        String[] cut = quotes.split(" ");
	        return cut.length;}
	    }
}
