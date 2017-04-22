package makeMethodCallSimpler;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by CuongBM on 4/22/2017.
 */
public class ParameterizeMethodTest {
    ParameterizeMethod parameterizeMethod = new ParameterizeMethod();

    private static final  double DELTA = 1e-15;

    @Test
    public void testFivePercentRaise() throws Exception {
        parameterizeMethod.fivePercentRaise();
        double expectSalary = 100 * 1.05;
        assertEquals(expectSalary, parameterizeMethod.getSalary(), DELTA);
    }

    @Test
    public void testTenPercentRaise() throws Exception {
        parameterizeMethod.tenPercentRaise();
        double expectSalary = 100 * 1.1;
        assertEquals(expectSalary, parameterizeMethod.getSalary(), DELTA);
    }

}