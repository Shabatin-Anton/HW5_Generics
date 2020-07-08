package main.java.com.homework5.search;

import java.util.Arrays;
import java.util.Comparator;

public class HighestAndLowest<T extends Comparable<T>> {

    private T[] array;

    public HighestAndLowest(T[] array) {
        this.array = array;
    }

    public T getMax() {
        T max = array[0];
        for (T t : array) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }

    public T getMin() {
        T min = array[0];
        for (T t : array) {
            if (t.compareTo(min) < 0) {
                min = t;
            }
        }
        return min;
    }
}
