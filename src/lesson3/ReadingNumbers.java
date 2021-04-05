package lesson3;

import java.util.Scanner;

public class ReadingNumbers {
    public static void main(String[] args) {
        String[] arrayNumbers = readNumbers();
        printNumbers(arrayNumbers);
    }

    public static String[] readNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers separated by a space: ");
        String numbers = scanner.nextLine();

        return numbers.split(" ");
    }

    public static void printNumbers(String[] arrayNumbers) {
        for (String number : arrayNumbers) {
            System.out.println(number);
        }
    }
}
