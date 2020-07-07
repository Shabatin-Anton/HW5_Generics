package main.java.com.homework5;

public class Executer {

    MyList<Integer> integerMyList = new MyList<>();
    MyList<String> stringMyList = new MyList<>();
    MyList<Long> longMyList = new MyList<>();
    Integer[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    Double[] doubles = {1.32, -3.67, 64.1, 93.5};
    HighestAndLowest<Integer> numbers = new HighestAndLowest<>(num);
    HighestAndLowest<Double> doubles2 = new HighestAndLowest<>(doubles);

    public void start() {

        integerMyList.add(12);
        integerMyList.add(14);
        integerMyList.add(19);

        stringMyList.add("Name");
        stringMyList.add("Shop");
        stringMyList.add("Zeland");

        longMyList.add(124L);
        longMyList.add(23L);
        longMyList.add(45L);
    }

    public void printResults() {

        start();

        System.out.println("Max of integerMyList: " + integerMyList.giveMax());
        System.out.println("Mix of integerMyList: " + integerMyList.giveMin());

        System.out.println("Max word: " + stringMyList.giveMax());
        System.out.println("Min word: " + stringMyList.giveMin());

        System.out.println("Max of stringMyList: " + longMyList.giveMax());
        System.out.println("Min of stringMyList: " + longMyList.giveMin());

        System.out.println("Highest number: " + numbers.getMax());
        System.out.println("Lowest number: " + numbers.getMin());

        System.out.println("Highest double: " + doubles2.getMax());
        System.out.println("Lower double: " + doubles2.getMin());
    }
}
