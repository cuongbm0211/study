package makeMethodCallSimpler;

/**
 * Created by CuongBM on 4/22/2017.
 */
public class ReplaceParameterWithExplicitMethods {
    public static class Employee {
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
            throw new RuntimeException("Unknown type: " + type);
        }

        public static Employee createEngineer() {
            return new Engineer();
        }

        public static Employee createSalesman() {
            return new Salesman();
        }

        public static Employee createManager() {
            return new Manager();
        }


        public static class Engineer extends Employee {}

        public static class Salesman extends Employee {}

        public static class Manager extends Employee {}
    }
}
