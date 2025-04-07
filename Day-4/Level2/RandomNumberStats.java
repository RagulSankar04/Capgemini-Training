import java.util.Random;

public class RandomNumberStats {

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000);
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);

        System.out.print("Generated Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        double[] results = findAverageMinMax(numbers);

        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }
}
