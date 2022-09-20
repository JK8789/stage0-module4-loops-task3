package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public static void printGCD(int first, int second) {
        int gcd = 0;
        int highestNumber = first;
        if (first < second) {
            highestNumber = second;
        }
        for (int i = 1; i <= highestNumber; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    public static void main(String[] args) {
        printGCD(12, 8);
        printGCD(0, 30);
    }
}
