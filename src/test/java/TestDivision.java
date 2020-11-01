import org.junit.Assert;
import org.junit.Test;


public class TestDivision {

    @Test
    public void testDivision() {
        var fraction = TestUtils.createFraction(5, 14);
        var result = fraction.dividedBy(new NotImplementedFraction(25, 7));

        Assert.assertEquals((Integer) 1, result.getNumerator());
        Assert.assertEquals((Integer) 10, result.getDenominator());
    }

}
