package io.codelex.oop.summary.generics;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinerTest {

    @Test
    public void IntegerAndBigDecimal() {
        Integer first = 42;
        BigDecimal second = new BigDecimal("3.14");

        String expected = "First item: 42; Second item: 3.14";
        String result = Combiner.combineTwoItems(first, second);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void StringAndDoubleShouldReturnString() {
        String first = "first";
        Double second = 3.0;

        String expected = "First item: first; Second item: 3.0";
        String result = Combiner.combineTwoItems(first, second);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void CharacterAndLong() {
        Character first = 'a';
        Long second = 100000L;

        String expected = "First item: a; Second item: 100000";
        String result = Combiner.combineTwoItems(first, second);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void StringListAndIntegerArray() {
        List<String> first = new ArrayList<>();
        first.add("first");
        first.add("first2");
        int[] second = new int[2];
        second[0] = 1;
        second[1] = 5;

        String expected = "First item: [first, first2]; Second item: [1, 5]";
        String result = Combiner.combineTwoItems(first, Arrays.toString(second));

        Assertions.assertEquals(expected, result);
    }
}
