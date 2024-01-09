package MergeStringArrays;
import java.util.Arrays;

public class StringArrayMerge {
	public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "cherry"};
        String[] array2 = {"date", "elderberry", "fig"};
        String[] mergedArray = mergeStringArrays(array1, array2);
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
    
    public static String[] mergeStringArrays(String[] array1, String[] array2) {
        int length = array1.length + array2.length;
        String[] mergedArray = new String[length];
        int index = 0;
        for (String element : array1) {
            mergedArray[index] = element;
            index++;
        }
        for (String element : array2) {
            mergedArray[index] = element;
            index++;
        }
        return mergedArray;
    }
}
