package makeMethodCallSimpler;

/**
 * Created by CuongBM on 5/4/2017.
 */
public class ReplaceErrorCodeWithException {

    static class Account {
        private double balance;

        public void withdraw(double amount) {
            if (amount < balance) {
                throw new IllegalArgumentException("Amount exceeds balance");
            }

            balance -= amount;
        }
    }

}
