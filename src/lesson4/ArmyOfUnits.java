package lesson4;

public class ArmyOfUnits {
    public static void main(String[] args) {
        int number = (int) ((Math.random() * ((5000) + 1)) + 0);
        System.out.println(number + " = " + defineArmy(number));
    }

    private static String defineArmy(int number) {
        if (number < 1) {
            return "no army";
        } else if (number < 20) {
            return "pack";
        } else if (number < 250) {
            return "throng";
        } else if (number < 1000) {
            return "zounds";
        }

        return "legion";
    }
}
