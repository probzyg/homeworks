package io.codelex.javaAdvancedTest.exercise3;

public class Joiner<T> {
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... el) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < el.length; i++) {
            result.append(el[i]);
            if (i < el.length -1) {
                result.append(separator);
            }
        }
        return result.toString();
    }
}
