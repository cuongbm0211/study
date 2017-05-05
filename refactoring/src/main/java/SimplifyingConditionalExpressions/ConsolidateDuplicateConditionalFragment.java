package SimplifyingConditionalExpressions;

/**
 * Created by CuongBM on 5/5/2017.
 */
public class ConsolidateDuplicateConditionalFragment {

    private boolean isSpecialDeal;
    private double total;
    private double price;

    public void calculateSomething() {
        if (isSpecialDeal)
            total = price * 0.95;
        else
            total = price * 0.98;
        
        send();
    }

    private void send() {
    }
}
