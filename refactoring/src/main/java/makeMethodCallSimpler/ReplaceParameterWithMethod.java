package makeMethodCallSimpler;

/**
 * Created by CuongBM on 5/2/2017.
 */
public class ReplaceParameterWithMethod {
    private int quantity;
    private double itemPrice;

    public double getPrice() {
        double basePrice = quantity * itemPrice;
        double discountLevel = 1;
        if (quantity > 100) discountLevel = 2;
        double finalPrice = getDiscountPrice(basePrice, discountLevel);
        return finalPrice;
    }

    private double getDiscountPrice(double basePrice, double discountLevel) {
        if (discountLevel == 2) {
            return basePrice * 0.1;
        }
        return basePrice * 0.05;
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
