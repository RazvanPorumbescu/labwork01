package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = getNumbers();

        ArrayList<Integer> evenNumbers = getEvenNumbers(numbers);

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

    static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) % 2 == 0) {

                evenNumbers.add(numbers.get(i));
            }
        }

        return evenNumbers;
    }

    static ArrayList<Integer> filterOddNumbers(ArrayList<Integer> numbers) {

        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) % 2 != 0) {

                oddNumbers.add(numbers.get(i));
            }
        }

        return oddNumbers;
    }
}