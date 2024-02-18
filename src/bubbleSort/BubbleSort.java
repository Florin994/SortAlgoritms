package bubbleSort;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }
        System.out.println("Before:");
        printArray(numbers);
        bubbleSort(numbers);
        System.out.println("\nAfter:");
        printArray(numbers);
    }

    private static void bubbleSort(int[] numbers) {
        boolean swapNumbers = true;
        while (swapNumbers) {
            swapNumbers = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swapNumbers = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }

    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
