package task_my_dictionary;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyDictionary<String, String> pair1 = new MyDictionary<>("Перша пара(1)", "Перша пара(2)");
        MyDictionary<String, String> pair2 = new MyDictionary<>("Друга пара(1)", "Друга пара(2)");
        MyDictionary<String, String> pair3 = new MyDictionary<>("Третя пара(1)", "Третя пара(2)");

        System.out.println("Вивід першого елементу: " + pair1.getT1());
        System.out.println("Вивід другого елементу: " + pair1.getT2());

        ArrayList<MyDictionary<String, String>> arrayOfPairs = new ArrayList<>();

        arrayOfPairs.add(pair1);
        arrayOfPairs.add(pair2);
        arrayOfPairs.add(pair3);

        System.out.println("Кількість пар: " + arrayOfPairs.size());
        System.out.println("Повернення елементу за індексом: " + arrayOfPairs.get(1));
        System.out.println("Загальний вміст: " + arrayOfPairs);
    }
}
