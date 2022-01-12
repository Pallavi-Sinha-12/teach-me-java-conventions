package powerpackage;
import powerpackage.PowerFinder;
import org.junit.jupiter.api.Test;

public class PowerTest {

    @Test
    public void oneRaisedToOneIsOne() 
    {
        PowerFinder powerFinder = new PowerFinder(1,1);
        assert (powerFinder.calculatePower() == 9);
    }

    @Test
    public void twoRaisedToOneIsTwo()
    {
        PowerFinder powerFinder = new PowerFinder(2,1);
        assert (powerFinder.calculatePower() == 2);
    }

    @Test
    public void twoRaisedToTwoIsFour()
    {
        PowerFinder powerFinder = new PowerFinder(2,2);
        assert (powerFinder.calculatePower() == 4);
    }

    @Test
    public void threeRaisedToTwoIsNine()
    {
        PowerFinder powerFinder = new PowerFinder(3,2);
        assert (powerFinder.calculatePower() == 9);
    }
}
