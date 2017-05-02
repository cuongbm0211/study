package makeMethodCallSimpler;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by CuongBM on 5/2/2017.
 */
public class ReplaceParameterWithMethodTest {
    private static final double DELTA = 1e-15;

    @Test
    public void testGetPrice_DiscountLevel_is1() throws Exception {
        // given
        ReplaceParameterWithMethod replaceParameterWithMethod = new ReplaceParameterWithMethod();

        // when
        replaceParameterWithMethod.setQuantity(100);
        replaceParameterWithMethod.setItemPrice(50.5D);

        // then
        assertEquals(252.5, replaceParameterWithMethod.getPrice(), DELTA);
    }

    @Test
    public void testGetPrice_DiscountLevel_is2() throws Exception {
        // given
        ReplaceParameterWithMethod replaceParameterWithMethod = new ReplaceParameterWithMethod();

        // when
        replaceParameterWithMethod.setQuantity(200);
        replaceParameterWithMethod.setItemPrice(50.5D);

        // then
        assertEquals(1010.0, replaceParameterWithMethod.getPrice(), DELTA);
    }

}