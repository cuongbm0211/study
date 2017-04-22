package makeMethodCallSimpler;

/**
 * Created by CuongBM on 4/22/2017.
 */
public class ParameterizeMethod {
    double salary = 100;

    public void fivePercentRaise() {
        raise(0.05);
    }

    public void tenPercentRaise() {
        raise(0.1);
    }

    public void raise(double percentage) {
        salary *= (1 + percentage);
    }

    public double getSalary() {
        return salary;
    }
}
