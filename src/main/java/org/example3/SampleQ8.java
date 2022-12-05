package org.example3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SampleQ8 {
    public static void main(String[] args) {
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        System.out.println(grade.get("B"));
        System.out.println(grade.remove("B"));
    }
}