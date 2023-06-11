package io.codelex.oop.summary.generics;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrinterTest {
    public void printer(Object object) {
        Printer printer = new Printer(object);
        printer.print();
    }

    @Test
    public void printBigDecimal(){
        BigDecimal thingToPrint = new BigDecimal(123);

        printer(thingToPrint);

        assertEquals(BigDecimal.valueOf(123), thingToPrint);
    }

    @Test
    public void printHashMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);

        printer(map.toString());

        assertEquals(1, map.get("key1"));
        assertEquals(2, map.get("key2"));
    }

    @Test
    public void printInteger() {
        int thingToPrint = 123;

        printer(thingToPrint);

        assertEquals(123, thingToPrint);
    }

    @Test
    public void printString() {
        String thingToPrint = "string";

        printer(thingToPrint);

        assertEquals("string", thingToPrint);
    }

    @Test
    public void printArrayValues() {
        boolean[] thingToPrint = new boolean[3];
        thingToPrint[0] = true;
        thingToPrint[1] = false;
        thingToPrint[2] = true;

        assertEquals("[true, false, true]", Arrays.toString(thingToPrint));
    }
}
