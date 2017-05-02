package makeMethodCallSimpler;

/**
 * Created by CuongBM on 5/2/2017.
 */
public class ReplaceParameterWithMethod {
    private int quantity;
    private double itemPrice;

    public double getPrice() {
        double basePrice = getBasePrice();
        double discountLevel = getDiscountPrice();
        double finalPrice = getDiscountPrice(basePrice, discountLevel);
        return finalPrice;
    }

    private double getDiscountPrice(double basePrice, double discountLevel) {
        if (discountLevel == 2) {
            return basePrice * 0.1;
        }
        return basePrice * 0.05;
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
