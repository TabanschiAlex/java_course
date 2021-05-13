package lesson4;

public class HealthySleep {
    HealthySleep(int a, int b, int h) {
        System.out.println(forecastSleep(a, b, h));
    }

    private String forecastSleep(int a, int b, int h) {
        return (h >= a && h <= b) ? "Normal" : (h < a) ? "Deficiency" : "Excess";
    }
}

class HealthySleepRun {
    public static void main(String[] args) {
        new HealthySleep(6, 10, 5);
    }
}
