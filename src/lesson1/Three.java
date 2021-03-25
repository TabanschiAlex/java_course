package lesson1;

public class Three {
    public static void main(String[] args) {
        int number = 0;
        printNumber(number);
    }

    public static int printNumber(int number) {
        if (number > 5) return 0;

        System.out.println("Number: " + number);
        return printNumber(++number);
    }
}
