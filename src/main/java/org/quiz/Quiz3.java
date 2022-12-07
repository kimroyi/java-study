package org.quiz;

import java.util.Arrays;
import java.util.HashMap;

public class Quiz3 {
    public static void main(String[] args)  {
        int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
        int sum = 0;
        for (int score : A) {
            if (score >= 50) {
                sum += score;
            }
        }
        System.out.println(sum);

        // 함수형 방식
        int result = Arrays.stream(A)
                .filter(value -> value >=50 ).sum()
                ;
        System.out.println(result);
    }
}
