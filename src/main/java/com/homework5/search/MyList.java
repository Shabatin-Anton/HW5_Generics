package main.java.com.homework5.search;

import java.util.ArrayList;
import java.util.Collections;

public class MyList<T extends Comparable<T>> {

    private final ArrayList<T> list = new ArrayList<>();

    public void add(T t) {
        list.add(t);
    }

    public T giveMax() {
        return Collections.max(list);
    }

    public T giveMin() {
        return Collections.min(list);
    }
}
