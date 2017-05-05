package SimplifyingConditionalExpressions;

/**
 * Created by CuongBM on 5/5/2017.
 */
// Consolidate: hợp nhất, gộp lại làm 1
public class ConsolidateConditionalExpression {
    private int seniority;
    private int monthsDisable;
    private boolean isPartTime;
    private boolean isOnVacation;
    private int lengthOfService;

    // Example 1
    public double getDisabilityAmount() {
        if (isNotEligibleForDisability())
            return 0;

        return ComputeDisabilityAmount();
    }

    private boolean isNotEligibleForDisability() {
        return seniority < 1 || monthsDisable > 12 || isPartTime;
    }

    private double ComputeDisabilityAmount() {
        return 0;
    }

    // Example 2
    public double getSomeOtherAmount() {
        if (isOnVacation && (lengthOfService > 10))
            return 1;
        return 0.5;
    }
}
