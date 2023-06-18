package io.codelex.javaAdvancedTest.exercise3;

import java.util.StringJoiner;

public class Joiner<T> {
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(CharSequence delimiter, T... el) {
        StringJoiner joiner = new StringJoiner(delimiter);
        for (T element : el) {
            if (element instanceof Integer | element instanceof Long | element instanceof Short) {
                joiner.add(String.valueOf(element));
            } else {
                joiner.add((CharSequence) element);
            }
        }
        return joiner.toString();
    }
}
