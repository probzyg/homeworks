package io.codelex.oop.summary.lazybox;

import java.util.function.Supplier;

public class LazyBox<T> {
    private Supplier<T> value;
    private T contents;

    public LazyBox(Supplier<T> initializer) {
        this.value = initializer;
    }

    public T get() {
        if (contents == null) {
            contents = value.get();
            value = null;
        }
        return contents;
    }
}
