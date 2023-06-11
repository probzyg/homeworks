package io.codelex.oop.summary.generics;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StorageHouseTeat {

    @Test
    public void StringArrayListPrintItems() {
        StorageHouse<String> storageHouse = new StorageHouse<>("String");
        storageHouse.addMoreItems("123");

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        System.setOut(printStream);

        storageHouse.printItems();

        assertEquals("String\r\n123\r\n", outputStream.toString());

    }

    @Test
    public void StringArrayListgetMaybeFirst() {
        StorageHouse<String> storageHouse = new StorageHouse<>("String");
        storageHouse.addMoreItems("123");

        assertEquals("String", storageHouse.getMaybeFirstItem().orElse(null));

    }

    @Test
    public void IntegerArrayListPrintItems() {
        StorageHouse<Integer> storageHouse = new StorageHouse<>(123);
        storageHouse.addMoreItems(456);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        System.setOut(printStream);

        storageHouse.printItems();

        assertEquals("123\r\n456\r\n", outputStream.toString());
    }

    @Test
    public void IntegerArrayListGetMaybeFirst() {
        StorageHouse<Integer> storageHouse = new StorageHouse<>(123);
        storageHouse.addMoreItems(456);

        assertEquals(123, storageHouse.getMaybeFirstItem().orElse(0));
    }
}
