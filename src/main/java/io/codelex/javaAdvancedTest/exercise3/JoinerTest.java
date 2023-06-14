package io.codelex.javaAdvancedTest.exercise3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class JoinerTest {
    @Test
    public void testIntegerJoiner() {
        Joiner<Integer> joiner = new Joiner<>("-");
        assertEquals("1-2-3-4", joiner.join(1, 2, 3, 4));
    }

    @Test
    public void testStringSlash() {
        Joiner<String> joiner = new Joiner<>("/");
        assertEquals("a/b/c", joiner.join("a", "b", "c"));
    }
}
