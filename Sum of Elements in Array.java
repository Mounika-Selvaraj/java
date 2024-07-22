public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 3, 1};
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }
}
