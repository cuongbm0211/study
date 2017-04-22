package makeMethodCallSimpler;

import makeMethodCallSimpler.ReplaceParameterWithExplicitMethods.Employee;
import makeMethodCallSimpler.ReplaceParameterWithExplicitMethods.Employee.Engineer;
import makeMethodCallSimpler.ReplaceParameterWithExplicitMethods.Employee.Manager;
import makeMethodCallSimpler.ReplaceParameterWithExplicitMethods.Employee.Salesman;
import org.junit.Test;

import static makeMethodCallSimpler.ReplaceParameterWithExplicitMethods.Employee.ENGINEER;
import static makeMethodCallSimpler.ReplaceParameterWithExplicitMethods.Employee.MANAGER;
import static makeMethodCallSimpler.ReplaceParameterWithExplicitMethods.Employee.SALESMAN;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

/**
 * Created by CuongBM on 4/22/2017.
 */
public class ReplaceParameterWithExplicitMethodsTest {

    private static final int NOT_EXIST_TYPE = 99999999;

    @Test
    public void testCreateEngineer() throws Exception {
        Employee engineer = Employee.create(ENGINEER);
        assertThat(engineer, instanceOf(Engineer.class));
    }

    @Test
    public void testCreateSalesman() {
        Employee salesman = Employee.create(SALESMAN);
        assertThat(salesman, instanceOf(Salesman.class));
    }

    @Test
    public void testCreateManager() {
        Employee manager = Employee.create(MANAGER);
        assertThat(manager, instanceOf(Manager.class));
    }

    @Test(expected = RuntimeException.class)
    public void testCreateUnknownTypeEmployee() {
        Employee unknown = Employee.create(NOT_EXIST_TYPE);
    }

}