package SimplifyingConditionalExpressions;

import java.time.LocalDate;

/**
 * Created by CuongBM on 5/5/2017.
 */
public class DecomposeConditional {
    private static final LocalDate SUMMER_START = LocalDate.of(2017, 6, 1);
    private static final LocalDate SUMMER_END = LocalDate.of(2017, 9, 1);

    private double charge;
    private LocalDate currentDate;
    private int quantity;
    private double winterRate;
    private double winterServiceCharge;
    private double summerRate;

    public void calculateCharge() {
        if (isNotSummer()) {
            charge = calculateWinterCharge();
        } else {
            charge = calculateSummerCharge();
        }
    }

    private boolean isNotSummer() {
        return currentDate.isBefore(SUMMER_START) || currentDate.isAfter(SUMMER_END);
    }

    private double calculateWinterCharge() {
        return quantity * winterRate + winterServiceCharge;
    }

    private double calculateSummerCharge() {
        return quantity * summerRate;
    }
}
