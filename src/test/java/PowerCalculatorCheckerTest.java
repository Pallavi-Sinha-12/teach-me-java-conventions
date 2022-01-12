import org.junit.jupiter.api.Test;
import powerpackage.PowerFinder;

public class PowerCalculatorCheckerTest {
    @Test
    void OneRaisedToOneIsOne() {
        PowerFinder powerFinder = new PowerFinder(1, 1);
        int actualPower = powerFinder.calculatePower();
        int expectedPower = 1;
        assert (actualPower == expectedPower);

    }

    @Test
    void TwoRaisedToOneIsOne() {
        PowerFinder powerFinder = new PowerFinder(2, 1);
        int actualPower = powerFinder.calculatePower();
        int expectedPower = 2;
        assert (actualPower == expectedPower);
    }

    @Test
    void ThreeRaisedToTwoIsNine() {
        PowerFinder powerFinder = new PowerFinder(3, 2);
        int actualPower = powerFinder.calculatePower();
        int expectedPower = 9;
        assert (actualPower == expectedPower);
    }

    @Test
    void TwoRaisedToTwoIsFour() {
        PowerFinder powerFinder = new PowerFinder(2, 2);
        int actualPower = powerFinder.calculatePower();
        int expectedPower = 4;
        assert (actualPower == expectedPower);
    }
}
