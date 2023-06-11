package io.codelex.oop.summary.lazybox;

public class MainProgram {
    public static void main(String[] args) {

        LazyBox<Integer> box = new LazyBox<>(MainProgram::calculate);

        Integer contents = box.get();
        System.out.println(contents);

        Integer contents2 = box.get();
        System.out.println(contents2);
    }

    public static Integer calculate() {
        return 200;
    }
}
