package ArrayCopy;

public class Array1to2 {

	public static void main(String[] args) {
		 int[] s = {1, 2, 3, 4, 5};
	        int[] destination = new int[s.length];
	        
	        // Using a for loop to copy elements
	        for (int i = 0; i < s.length; i++) {
	            destination[i] = s[i];
	        }
	        
	        // Printing the elements of the destination array
	        for (int i = 0; i < destination.length; i++) {
	            System.out.print(destination[i] + " ");
	        }

	}

}
