package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;
        for (int counter = 0; counter < lastFibonacci; counter++) {
            System.out.println(firstTerm);
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
