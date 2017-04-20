package comm.tdd.guava;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by cuong on 2/10/2017.
 */
public class StringsTest {

    @Test
    public void convertListToString() {
        List<String> intput = Lists.newArrayList("Diep", "Cuong", "Quyen", "The");
        String result = Joiner.on("#")
                .skipNulls()
                .join(intput);
        assertEquals("Diep#Cuong#Quyen#The", result);
    }

    @Test
    public void userForNull() {
        List<String> intput = Lists.newArrayList("Diep", "Cuong", "Quyen", "The", null, null);
        String result = Joiner.on("#")
                .useForNull("NULL")
                .join(intput);
        assertEquals("Diep#Cuong#Quyen#The#NULL#NULL", result);
    }

    @Test
    public void convertMapToString() {
        HashMap<String, Integer> salary = Maps.newHashMap();
        salary.put("John", 1000);
        salary.put("Jane", 1500);

        String result = Joiner.on("#")
                .withKeyValueSeparator(" = ")
                .join(salary);

        assertEquals("John = 1000#Jane = 1500", result);
    }

    @Test
    public void createListFromString() {
        String input = "Diep#Cuong#Quyen#The";
        List<String> result = Splitter.on("#")
                .trimResults()
                .splitToList(input);

        assertThat(result, contains("Diep", "Cuong", "Quyen", "The"));
    }

    @Test
    public void createMapFromString() {
        String input = "John=first,Adam=second";
        Map<String, String> result = Splitter.on(",")
                .withKeyValueSeparator("=")
                .split(input);

        assertEquals("first", result.get("John"));
        assertEquals("second", result.get("Adam"));
    }

    @Test
    public void splitStringOnSpecificLength() {
        String input = "Hello World";
        List<String> result = Splitter.fixedLength(3)
                .splitToList(input);
        assertThat(result, contains("Hel", "lo ", "Wor", "ld"));
    }

    @Test
    public void limitSplit() {
        String input = "Hello World";
        List<String> result = Splitter.fixedLength(3)
                .limit(2)
                .splitToList(input);

        System.out.println(result);
        assertThat(result, contains("Hel", "lo World"));
    }
}
