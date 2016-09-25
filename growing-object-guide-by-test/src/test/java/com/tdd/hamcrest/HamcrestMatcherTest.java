package com.tdd.hamcrest;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * Created by cuong.bui.manh on 9/25/2016.
 */
public class HamcrestMatcherTest {

    @Test
    public void test() {
        List<Integer> scores = Arrays.asList(1, 2, 3, 6, 7);

        assertThat(scores, hasSize(5));
        assertThat(scores, hasItem(3));
        assertThat(scores, hasItems(3, 6, 7));
        assertThat(scores, everyItem(greaterThan(0)));
        assertThat(scores, everyItem(lessThan(10)));

        // String
        assertThat("", isEmptyString());
        assertThat(null, isEmptyOrNullString());

        // Array
        Integer[] marks = {1, 3, 4};

        assertThat(marks, arrayWithSize(3));
        assertThat(marks, arrayContaining(1, 3, 4));
        assertThat(marks, arrayContainingInAnyOrder(3, 1, 4));
    }
}
