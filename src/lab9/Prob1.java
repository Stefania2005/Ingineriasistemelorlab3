package lab9;

import java.util.*;
import java.util.stream.*;
import java.util.List;

public class Prob1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = Arrays.asList(5, 6, 7, 8, 9, 10, 11, 12, 15, 25);
        System.out.println("Lista generata este: " + numbers);

        //a)
        int sum=numbers.stream().reduce(0, Integer::sum);
        System.out.println("Suma este: " + sum);

        //b)
        int max=numbers.stream().max(Integer::compare).get();
        System.out.println("Maximul este: " + max);
        int min=numbers.stream().min(Integer::compare).get();
        System.out.println("Minimul este: " + min);

        //c)
        List<Integer> filteredNumbers = numbers.stream()
                .filter(num -> num >= 10 && num <= 20)
                .toList();
        System.out.println("Lista generata este: " + filteredNumbers);

        //d)
        List<Double> asDoubles = numbers.stream()
                .map(Integer::doubleValue) // sau .map(Integer::doubleValue)
                .toList();
        System.out.println("Lista transformată în Double: " + asDoubles);

        //e)

    }
}
