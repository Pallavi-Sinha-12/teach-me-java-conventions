package powerpackage;

public class PowerFinder {

    private int base;
    private int exponent;
    
    public PowerFinder(int base, int exponent)
    {
        this.base = base;
        this.exponent = exponent;
    }
    
    public int calculatePower() {
        int requiredPower = 1;
        while(exponent!=0) {
            requiredPower *= base;
            exponent--;
        }
        return requiredPower;
    }
}
