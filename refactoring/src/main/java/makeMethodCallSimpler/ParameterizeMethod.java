package makeMethodCallSimpler;

/**
 * Created by CuongBM on 4/22/2017.
 */
public class ParameterizeMethod {
    double salary = 100;

    public void fivePercentRaise() {
        salary *= 1.05;
    }

    public void tenPercentRaise() {
        salary *= 1.1;
    }

    public void raise(double percentage) {
        salary *= (1 + percentage);
    }

    public double getSalary() {
        return salary;
    }
}
