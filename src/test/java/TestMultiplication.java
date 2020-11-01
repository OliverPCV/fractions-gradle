import org.junit.Assert;
import org.junit.Test;


public class TestMultiplication {

    @Test
    public void testPlus() {
        var fraction = TestUtils.createFraction(3, 14);
        var result = fraction.times(new NotImplementedFraction(8, 15));

        Assert.assertEquals((Integer) 4, result.getNumerator());
        Assert.assertEquals((Integer) 35, result.getDenominator());
    }

}
