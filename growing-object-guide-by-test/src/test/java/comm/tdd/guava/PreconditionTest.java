package comm.tdd.guava;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkElementIndex;

/**
 * Created by cuong on 11/8/2016.
 */
public class PreconditionTest {

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_when_argument_null() {
        String argument1 = null;

        checkArgument(argument1 != null, "Argument1 must not null");
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_when_list_empty() {
        List<String> list = new ArrayList<>();

        checkArgument(!list.isEmpty(), "List must not empty");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void check_element_index_pure_java() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        int index = -1;
        if (list.size() < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (index < 0 || index >= list.size()) throw new IndexOutOfBoundsException();

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void check_element_use_precondition() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        int index = -1;
        checkElementIndex(index, list.size(), "abc message");
    }
}
