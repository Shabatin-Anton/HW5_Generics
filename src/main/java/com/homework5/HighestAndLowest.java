package main.java.com.homework5;

import java.util.Arrays;
import java.util.Comparator;

public class HighestAndLowest<T extends Comparable<T>> {

    private T[] array;

    public HighestAndLowest(T[] array) {
        this.array = array;
    }

    public T getMax() {
        return Arrays.stream(array).max(Comparator.naturalOrder()).get();
    }

    public T getMin() {
        return Arrays.stream(array).min(Comparator.naturalOrder()).get();
    }
}
