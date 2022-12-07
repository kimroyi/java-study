package org.quiz;

import java.util.HashMap;

public class Quiz2 {
    public static void main(String[] args)  {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("A", 90);
        a.put("B", 80);
        System.out.println(a.getOrDefault("C", 70));  // 70 출력
    }
}
