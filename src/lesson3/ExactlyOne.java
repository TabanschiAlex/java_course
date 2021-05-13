package lesson3;

import java.util.Scanner;

public class ExactlyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println(oneIsPositive(numbers));
    }

    private static boolean oneIsPositive(int[] numbers) {
        int pos = 0;

        for (int number: numbers) {
            if (number < 0) continue;
            pos++;
        }

        return pos == 1;
    }
}
