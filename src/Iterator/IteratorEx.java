package Iterator;
import java.util.ArrayList;
import java.util.Iterator;


public class IteratorEx {
	
	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Batman");
	        list.add("Spiderman");
	        list.add("Superman");
	        list.add("Wonderwoman");
	        
	        Iterator<String> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            String element = iterator.next();
	            System.out.println(element);
	        }
	    }
}


for (int i = 0; i < string.length(); i++) {
    if (!Character.isLetterOrDigit(string.charAt(i))) {
        return false;
    }
