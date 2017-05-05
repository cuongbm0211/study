package SimplifyingConditionalExpressions;

/**
 * Created by CuongBM on 5/5/2017.
 */
// Consolidate: hợp nhất, gộp lại làm 1
public class ConsolidateConditionalExpression {
    private int seniority;
    private int monthsDisable;
    private boolean isPartTime;

    public double getDisabilityAmount() {
        if (seniority < 1)
            return 0;
        if (monthsDisable > 12)
            return 0;
        if (isPartTime)
            return 0;

        return ComputeDisabilityAmount();
    }

    private double ComputeDisabilityAmount() {
        return 0;
    }
}
