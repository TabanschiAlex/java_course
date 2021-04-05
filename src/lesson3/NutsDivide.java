package lesson3;

import java.util.Scanner;

public class NutsDivide {
    public static void main(String[] args) {
        int[] data = initialise();

        System.out.println("For each squirrel " + divideNuts(data) + " nuts");
    }

    public static int[] initialise() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of squirrels = ");
        final int squirrels = scanner.nextInt();
        System.out.print("Number of nuts = ");
        final int nuts = scanner.nextInt();

        return new int[]{squirrels, nuts};
    }

    public static int divideNuts(int[] data) {
        return data[1] / data[0];
    }
}
