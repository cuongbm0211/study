package SimplifyingConditionalExpressions;

/**
 * Created by CuongBM on 5/7/2017.
 */
public class ReplaceNestedConditionalWithGuardClauses {

    private boolean isDead;
    private boolean isSeparate;
    private boolean isRetired;

    // Example 1
    public double getPayAmount() {
        double result;
        if (isDead) {
            return calculateDeadAmount();
        }

        if (isSeparate) {
            return calculateSeparateAmount();
        }

        if (isRetired) {
            result = calculateRetiredAmount();
        } else {
            result = calculateNormalAmount();
        }

        return result;
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
}
