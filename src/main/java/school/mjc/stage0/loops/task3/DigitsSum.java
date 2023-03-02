package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        int sum = 0;
        String numString = Integer.toString(Math.abs(number));
        int length = numString.length();
        for (int i = 0; i < length; i++) {
            char digit = numString.charAt(i);
            sum += Character.getNumericValue(digit);
        }
        System.out.println(sum);
    }
}