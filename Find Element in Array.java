public class FindElement {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 3, 1};
        int target = 8;
        boolean found = false;

        for (int num : array) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(target + " is found in the array.");
        } else {
            System.out.println(target + " is not found in the array.");
        }
    }
}
