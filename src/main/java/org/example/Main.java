package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = getNumbers();
        numbers.stream().forEach(System.out::println);


        System.out.println("Numere pare:");
        System.out.println(evenNumbers);
    }

    static ArrayList<Integer> getNumbers() {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        return numbers;
    }
}