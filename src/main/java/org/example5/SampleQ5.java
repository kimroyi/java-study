package org.example5;

import java.util.ArrayList;
import java.util.Arrays;

// 05 Q5
public class SampleQ5 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size());

        System.out.println(a==b);  // true 출력
    }
}