package org.example3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SampleQ9 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력

        HashSet<Integer> setNumbers = new HashSet<>();
//        for (int i = 0; i < numbers.size(); i++) {
//            setNumbers.add(numbers.get(i));
//        }
        for (int number : numbers){
            setNumbers.add(number);
        }

        System.out.println(setNumbers);

        HashSet<Integer> hashSet = new HashSet<>(numbers);
        System.out.println(hashSet);
    }
}