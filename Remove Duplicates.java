import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] array = {5, 2, 8, 3, 1, 2, 5};
        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(array));
        Integer[] resultArray = set.toArray(new Integer[0]);
        System.out.println("Array after removing duplicates: " + Arrays.toString(resultArray));
    }
}
