package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sumInclusive = 0;
        int counter = 0;
        for (counter = firstBoarder; counter <= secondBoarder; counter++) {
            sumInclusive = sumInclusive + counter;
        }
        System.out.println(sumInclusive);
    }
}