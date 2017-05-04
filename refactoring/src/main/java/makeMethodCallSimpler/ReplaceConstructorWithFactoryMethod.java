package makeMethodCallSimpler;

/**
 * Created by CuongBM on 5/4/2017.
 */
public class ReplaceConstructorWithFactoryMethod {
    static class Employee {
        private int type;

        public static final int ENGINEER = 0;
        public static final int SALESMAN = 1;
        public static final int MANAGER = 2;

        public Employee(int type) {
            this.type = type;
        }
    }
}
