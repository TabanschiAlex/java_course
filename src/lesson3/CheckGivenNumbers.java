package lesson3;

import java.util.Scanner;

public class CheckGivenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println(numbers[0] != numbers[1] && numbers[1] != numbers[2] && numbers[0] != numbers[2]);
    }
}
