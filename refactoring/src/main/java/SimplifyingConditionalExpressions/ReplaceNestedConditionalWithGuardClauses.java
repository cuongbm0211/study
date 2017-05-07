package SimplifyingConditionalExpressions;

/**
 * Created by CuongBM on 5/7/2017.
 */
public class ReplaceNestedConditionalWithGuardClauses {

    private static final double ADJUSTMENT_FACTOR = 1;
    private boolean isDead;
    private boolean isSeparate;
    private boolean isRetired;
    private double capital;
    private double interestRate;
    private double duration;
    private double income;

    // Example 1
    public double getPayAmount() {
        if (isDead) return calculateDeadAmount();
        if (isSeparate) return calculateSeparateAmount();
        if (isRetired) return calculateRetiredAmount();
        return calculateNormalAmount();
    }

    private double calculateNormalAmount() {
        return 0;
    }

    private double calculateRetiredAmount() {
        return 0;
    }

    private double calculateSeparateAmount() {
        return 0;
    }

    private double calculateDeadAmount() {
        return 0;
    }


    // Example 2
    public double getAdjustedCapital() {
        if (capital <= 0) {
            return 0;
        }
        if (interestRate <= 0.0 || duration <= 0.0) {
            return 0;
        }
        return (income / duration) * ADJUSTMENT_FACTOR;
    }
}
