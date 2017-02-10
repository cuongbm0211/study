package comm.tdd.guava;

import com.google.common.base.CharMatcher;
import com.google.common.base.Predicate;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by cuong on 2/10/2017.
 */
public class CharMatcherTest {

    @Test
    public void trimString() {
        String result = CharMatcher.whitespace().trimFrom("    Hello ABC    1234   ");
        System.out.println(result);

        assertEquals("Hello ABC    1234", result);
    }

    @Test
    public void matchOfAll() {
        boolean result = CharMatcher.ascii().matchesAllOf("abc 111dd xx ");
        Assert.assertTrue(result);

        boolean result2 = CharMatcher.digit().matchesAllOf("123456");
        Assert.assertTrue(result2);

        boolean result3 = CharMatcher.digit().matchesAllOf("  123456  ");
        Assert.assertFalse(result3);

        boolean result4 = CharMatcher.digit().matchesAnyOf("adafasdf123456adfasfsa");
        Assert.assertTrue(result4);

        String result5 = CharMatcher.is('a').removeFrom("bazaar");
        assertEquals("bzr", result5);

        String result6 = CharMatcher.is('a').retainFrom("bazaar");
        assertEquals("aaa", result6);

        int result7 = CharMatcher.is('a').countIn("bazaar");
        assertEquals(result7, 3);

        String result8 = CharMatcher.is('a').replaceFrom("radar", "o");
        assertEquals("rodor", result8);


    }

    @Test
    public void removeSpecialCharacter() {
        String input = "H*el.lo,}12";
        String result = CharMatcher.javaLetterOrDigit().retainFrom(input);
        assertEquals("Hello12", result);
    }

    @Test
    public void removeNonAsciiFrom() {
        String input = "あhello₤";

        assertEquals("hello", CharMatcher.ascii().retainFrom(input));
        assertEquals("hello", CharMatcher.inRange('0', 'z').retainFrom(input));
    }

    @Test
    public void removeCharacterNotInCharset() {
        Charset charset = Charset.forName("cp437");
        CharsetEncoder charsetEncoder = charset.newEncoder();

        Predicate<Character> inRange = new Predicate<Character>() {
            @Override
            public boolean apply(Character character) {
                return charsetEncoder.canEncode(character);
            }
        };

        String result = CharMatcher.forPredicate(inRange).retainFrom("helloは");
        assertEquals("hello", result);

    }

    @Test
    public void validateString() {
        String input = "hello";

        assertTrue(CharMatcher.JAVA_LOWER_CASE.matchesAllOf(input));
        assertTrue(CharMatcher.is('e').matchesAnyOf(input));
    }

    @Test
    public void trimStringZZZ() {
        String input = "---hello,,,";

        assertEquals("hello,,,", CharMatcher.is('-').trimLeadingFrom(input));
        assertEquals("---hello", CharMatcher.is(',').trimTrailingFrom(input));
        assertEquals("hello", CharMatcher.anyOf("-,").trimFrom(input));
    }

    @Test
    public void collapseString() {
        String input = "       hel    lo      ";

        assertEquals("-hel-lo-", CharMatcher.is(' ').collapseFrom(input, '-'));
        assertEquals("hel-lo", CharMatcher.is(' ').trimAndCollapseFrom(input, '-'));

    }

    @Test
    public void replaceString() {
        String input = "apple-banana.";

        assertEquals("apple!banana!", CharMatcher.anyOf("-.").replaceFrom(input, '!'));
        assertEquals("apple and banana.", CharMatcher.is('-').replaceFrom(input, " and "));
    }
}
