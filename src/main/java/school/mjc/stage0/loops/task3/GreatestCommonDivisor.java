package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = 0;
        int smaller = Math.min(first, second);
        int larger = Math.max(first, second);
        if (smaller == 0) {
            gcd = Math.abs(larger);
        } else {
            for (int i = smaller; i > 0; i--) {
                if (smaller % i == 0 && larger % i == 0) {
                    gcd = i;
                    break;
                }
            }
        }
        System.out.println(gcd);
    }
}