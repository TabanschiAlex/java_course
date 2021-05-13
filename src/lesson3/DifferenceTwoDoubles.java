package lesson3;

import java.util.Scanner;

public class DifferenceTwoDoubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        System.out.println(secondNumber - firstNumber);
    }
}
