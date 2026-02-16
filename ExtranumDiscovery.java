package JAVA_TEST_3;


public class ExtranumDiscovery {

    public static void findMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Error: Invalid Array");
            return;
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            } else if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Min: " + min + ", Max: " + max);
    }

     static void main(String[] args) {
        findMinMax(new int[]{7, 2, 9, 1, 5});
        findMinMax(new int[]{-10, 0, 50, -2});
        findMinMax(new int[]{5, 5, 5, 5});
        findMinMax(null);
        findMinMax(new int[]{});
    }
}