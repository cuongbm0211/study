package makeMethodCallSimpler;

/**
 * Created by CuongBM on 5/2/2017.
 */
public class ReplaceParameterWithMethod {
    private int quantity;
    private double itemPrice;

    public double getPrice() {
        double finalPrice = getDiscountLevel();
        return finalPrice;
    }

    private double getDiscountLevel() {
        if (getDiscountPrice() == 2) {
            return getBasePrice() * 0.1;
        }
        return getBasePrice() * 0.05;
    }

    private double getBasePrice() {
        return quantity * itemPrice;
    }

    private double getDiscountPrice() {
        if (quantity > 100) return  2;
        return 1;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
