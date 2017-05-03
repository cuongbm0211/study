package makeMethodCallSimpler;

import makeMethodCallSimpler.IntroduceParameterObject.Account;
import makeMethodCallSimpler.IntroduceParameterObject.DateRange;
import makeMethodCallSimpler.IntroduceParameterObject.Entry;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.*;
import static org.junit.Assert.*;

/**
 * Created by CuongBM on 5/3/2017.
 */
public class IntroduceParameterObjectTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testLocalDate() {
        LocalDate today = LocalDate.now();

        assertTrue(today.isEqual(today));

        assertFalse(today.isBefore(today));
        assertFalse(today.isAfter(today));

        LocalDate yesterday = LocalDate.now().minus(1, DAYS);
        System.out.println(yesterday);
    }

    @Test
    public void testGetFlowBetWeen() {
        // Given
        Account account = new Account();

        List<Entry> entries = new ArrayList<>();
        Entry entry1 = new Entry();
        entry1.setChargeDate(LocalDate.now());
        entry1.setValue(100);

        Entry entry2 = new Entry();
        entry2.setChargeDate(LocalDate.now().minus(1, DAYS));
        entry2.setValue(200);

        Entry entry3 = new Entry();
        entry3.setChargeDate(LocalDate.now().minus(1, YEARS));
        entry3.setValue(300);

        entries.add(entry1);
        entries.add(entry2);
        entries.add(entry3);

        account.setEntries(entries);

        // When

        // Then
        LocalDate beforeOneWeek = LocalDate.now().minus(1, WEEKS);
        LocalDate afterOneWeek = LocalDate.now().plus(1, WEEKS);
        DateRange givenDate = new DateRange(beforeOneWeek, afterOneWeek);
        double flowBetween = account.getFlowBetween(givenDate);
        assertEquals(300, flowBetween, DELTA);

    }

}