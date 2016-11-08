package comm.tdd.guava;

import com.google.common.base.Optional;
import com.tdd.guava.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cuong on 11/7/2016.
 */
public class OptionalTest {

    @Test
    public void should_absent_when_have_null_value() {
        Employee employee = null; // Get employee from db

        Optional<Employee> employeeOptional;
        if (employee == null) {
            employeeOptional = Optional.absent();
        } else {
            employeeOptional = Optional.of(employee);
        }

        assertFalse(employeeOptional.isPresent());
    }

    @Test
    public void get_first_not_null_object() {
        Optional<String> firtObject = Optional.absent();
        Optional<String> secondObject = Optional.of("Object have value!");

        assertEquals(secondObject.get(), firtObject.or(secondObject).get());
    }

    @Test
    public void from_null_able_should_return_absent_when_null_return_reference_when_not_null() {
        Optional<Employee> employeeFromNull = Optional.fromNullable(null);
        assertFalse(employeeFromNull.isPresent());

        Optional<String> employeeFromNotNull = Optional.fromNullable("Hello");
        assertTrue(employeeFromNotNull.isPresent());
        assertEquals(employeeFromNotNull.get(), "Hello");
    }
}
