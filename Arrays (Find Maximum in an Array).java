public class ArrayMax {
    public static void main(String[] args) {
        int[] numbers = {10, 45, 32, 89, 21};
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum number: " + max);
    }
}
