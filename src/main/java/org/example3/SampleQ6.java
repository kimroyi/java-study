package org.example3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SampleQ6 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        System.out.println(myList); // [1, 3, 5, 4, 2] 출력
        myList.sort(Comparator.naturalOrder());
        System.out.println("결과는 ? " + myList);
    }
}