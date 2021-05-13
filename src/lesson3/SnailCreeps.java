package lesson3;

public class SnailCreeps {
    SnailCreeps(int h, int a, int b) {
        if (h > b && a > b) {
            System.out.println("To reach the goal need " + resolve(h, a, b) + " days");
        } else {
            System.out.println("Invalid values");
        }
    }

    private int resolve(int h, int a, int b) {
        int target = 0;
        int days = 0;

        do {
            target = (days % 2 == 0) ? target + a : target - b;
            days++;
        } while (target < h);

        return days;
    }
}

class SnailCreepsRun {
    public static void main(String[] args) {
        new SnailCreeps(55, 10, 7);
    }
}
