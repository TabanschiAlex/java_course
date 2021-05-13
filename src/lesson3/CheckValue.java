package lesson3;

import java.util.Scanner;

public class CheckValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number > 0 && number < 10);
    }
}
