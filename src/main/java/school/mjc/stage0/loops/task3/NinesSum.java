package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int nextNumber = 9;
        for (int counter = 0; counter < lengthOfLastNumber; counter++) {
            sum = sum + nextNumber;
            nextNumber = nextNumber * 10 + 9;
        }
        System.out.println(sum);
    }
}
