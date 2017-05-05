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
        if (seniority < 1 || monthsDisable > 12 || isPartTime)
            return 0;

        return ComputeDisabilityAmount();
    }

    private double ComputeDisabilityAmount() {
        return 0;
    }
}
