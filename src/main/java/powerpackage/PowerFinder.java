package powerpackage;

public class PowerFinder {
    public static int calculatePower(int number, int exponent) {
        int power = 1;
        for (int i = 0; i<exponent; i++) {
            power *= number;
        }
        return power;
    }
}
