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

        public static Employee create(int type) {
            switch (type) {
                case ENGINEER:
                    return new Engineer();
                case SALESMAN:
                    return new Salesman();
                case MANAGER:
                    return new Manager();
            }
            throw new RuntimeException("Can't exist type: " + type);
        }
    }

    static class Engineer extends Employee {}

    static class Salesman extends Employee {}

    static class Manager extends Employee {}
}
