package main.java.com.homework5;

import java.util.concurrent.Executor;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> integerMyList = new MyList<>();
        integerMyList.add(12);
        integerMyList.add(14);
        integerMyList.add(19);

        System.out.println("Max of integerMyList: " + integerMyList.giveMax());
        System.out.println("Mix of integerMyList: " + integerMyList.giveMin());

        MyList<String> stringMyList = new MyList<>();
        stringMyList.add("Name");
        stringMyList.add("Shop");
        stringMyList.add("Zeland");

        System.out.println("Max word: " + stringMyList.giveMax());
        System.out.println("Min word: " + stringMyList.giveMin());

        MyList<Long> longMyList = new MyList<>();
        longMyList.add(124L);
        longMyList.add(23L);
        longMyList.add(45L);

        System.out.println("Max of stringMyList: " + longMyList.giveMax());
        System.out.println("Min of stringMyList: " + longMyList.giveMin());

        Integer[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        HighestAndLowest<Integer> numbers = new HighestAndLowest<>(num);
        System.out.println("Highest number: " + numbers.getMax());
        System.out.println("Lowest number: " + numbers.getMin());

        Double[] doubles = {1.32, -3.67, 64.1, 93.5};

        HighestAndLowest<Double> doubles2 = new HighestAndLowest<>(doubles);
        System.out.println("Highest double: " + doubles2.getMax());
        System.out.println("Lower double: " + doubles2.getMin());
    }
}
