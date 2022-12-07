package org.quiz;

import java.util.ArrayList;

public class Quiz15 {
    static String caesar(String word, int n) {
        String A = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<String> result = new ArrayList<>();
        String[] str = word.split("");
        for (String s : str) {

            int pos = A.indexOf(s);
            int newPos = pos + n;
            newPos = newPos % A.length();  // 26 자리가 넘어갈 경우에는 회전할 수 있도록 26으로 나눈 나머지 값을 사용한다.
            result.add(A.substring(newPos, newPos + 1));

            // 방법 1
//            int index = A.indexOf(s) + n;
//            if (index >= A.length()) {
//                index = index - A.length();
//            }
//            result.add(String.valueOf(A.charAt(index)));
        }
        return String.join("", result);
    }

    public static void main(String[] args) {
        System.out.println(caesar("CAT", 5));  // HFY
        System.out.println(caesar("XYZ", 3));  // ABC
    }
}
