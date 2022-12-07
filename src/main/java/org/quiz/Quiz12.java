package org.quiz;

import java.lang.reflect.Array;

public class Quiz12 {
    public static void main(String[] args) {
        String data = "aaabbcccccca";
        String[] str = data.split("");
        String temp = "";
        int count = 1;
        String result = "";

        for (String s : str) {
            if (temp.equals(s)) {
                count++;
            } else if (!temp.equals(s)) {
                if (!"".equals(temp)) {
                    result += temp + count;
                }
                temp = s;
                count = 1;
            }
        }
        if (count > 0) {
            result += temp + count;
        }
        System.out.println(result);
    }
}
