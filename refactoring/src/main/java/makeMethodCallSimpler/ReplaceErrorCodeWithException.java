package makeMethodCallSimpler;

/**
 * Created by CuongBM on 5/4/2017.
 */
public class ReplaceErrorCodeWithException {

    static class Account {
        private double balance;

        public int withdraw(double amount) {
            if (amount < balance) {
                return -1;
            }

            balance -= amount;
            return 0;
        }
    }

}
