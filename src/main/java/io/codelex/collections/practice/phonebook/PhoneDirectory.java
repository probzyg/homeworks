package io.codelex.collections.practice.phonebook;

import java.util.Arrays;
import java.util.TreeMap;

public class PhoneDirectory {
    private TreeMap<String, String> data;

    public PhoneDirectory() {
        data = new TreeMap<>();
    }

    public String getNumber(String key) {
        return data.get(key);
    }

    public void putNumber(String key, String value) {
        data.put(key, value);
    }

}
