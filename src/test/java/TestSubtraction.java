import org.junit.Assert;
import org.junit.Test;


public class TestSubtraction {

    @Test
    public void testPlus() {
        var fraction = TestUtils.createFraction(14, 3);
        var result = fraction.minus(new NotImplementedFraction(9, 6));

        Assert.assertEquals((Integer) 19, result.getNumerator());
        Assert.assertEquals((Integer) 6, result.getDenominator());
    }

}
