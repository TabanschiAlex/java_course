package lesson3;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        final int number = inputNumber();

        System.out.println("Digits sum is " + calculateDigitSum(number));
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");

        return scanner.nextInt();
    }

    public static int calculateDigitSum(int number) {
        if (number == 0) return 0;
        return number % 10 + calculateDigitSum(number / 10);
    }
}
