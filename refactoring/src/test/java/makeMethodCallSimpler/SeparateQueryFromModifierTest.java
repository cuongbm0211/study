package makeMethodCallSimpler;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by CuongBM on 4/20/2017.
 */
public class SeparateQueryFromModifierTest {
    private SeparateQueryFromModifier separateQueryFromModifier = new SeparateQueryFromModifier();
    private List<String> miscreantsDon = Arrays.asList("Don", "John");
    private List<String> miscreantsJohn = Arrays.asList("Cuong", "John");
    private List<String> notMiscreants = Arrays.asList("Cuong", "Trang");

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }


    @Test
    public void testCheckSecurity_Person_Is_Miscreant_Don() throws Exception {
        separateQueryFromModifier.checkSecurity(miscreantsDon);

        String expect = "Has miscreant person on system !!!" + System.getProperty("line.separator") +
                "Add miscreant [Don] to DB for trace later" + System.getProperty("line.separator");
        assertEquals(expect, outContent.toString());
    }

    @Test
    public void testCheckSecurity_Person_Is_Miscreant_John() throws Exception {
        separateQueryFromModifier.checkSecurity(miscreantsJohn);

        String expect = "Has miscreant person on system !!!" + System.getProperty("line.separator") +
                "Add miscreant [John] to DB for trace later" + System.getProperty("line.separator");
        assertEquals(expect, outContent.toString());
    }

    @Test
    public void testCheckSecurity_Person_Not_Miscreant() throws Exception {
        separateQueryFromModifier.checkSecurity(notMiscreants);

        String expect = "Add miscreant [null] to DB for trace later" + System.getProperty("line.separator");
        assertEquals(expect, outContent.toString());
    }

}