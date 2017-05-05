package SimplifyingConditionalExpressions;

import java.time.LocalDate;

/**
 * Created by CuongBM on 5/5/2017.
 */
public class DecomposeConditional {
    private LocalDate currentDate;
    private double charge;

    private static final LocalDate SUMMER_START = LocalDate.of(2017, 6, 1);
    private static final LocalDate SUMMER_END = LocalDate.of(2017, 9, 1);

    private int quantity;
    private double winterRate;
    private double winterServiceCharge;
    private double summerRate;

    public void calculateCharge() {
        if (currentDate.isBefore(SUMMER_START) || currentDate.isAfter(SUMMER_END)) {
            charge = quantity * winterRate + winterServiceCharge;
        } else {
            charge = quantity * summerRate;
        }
    }
}
