public class LargestElement {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 3, 1};
        int largest = array[0];
        for (int num : array) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest element: " + largest);
    }
}
