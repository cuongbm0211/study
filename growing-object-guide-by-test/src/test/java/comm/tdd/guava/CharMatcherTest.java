package comm.tdd.guava;

import com.google.common.base.CaseFormat;
import com.google.common.base.CharMatcher;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by CuongBM on 2/9/2017.
 */

public class CharMatcherTest {

    @Test
    public void testDigit() {
        String number = CharMatcher.DIGIT.retainFrom("abc12ddd3efg789");
        System.out.println(number);
        Assert.assertEquals(number, "123");
    }

    @Test
    public void test_case_format() {
        String result = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "hello_zzz");
        System.out.println(result);

    }
}
