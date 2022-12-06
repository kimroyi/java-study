package org.example7;
// 07 Q4

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SampleQ4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        ArrayList<Integer> temp = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 1) {  // 홀수이면
                temp.add(num * 2);  // 2를 곱하여 temp에 담는다.
            }
        }

        // 정수 리스트를 정수배열로 변환한다.
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }

        // 답 ::
        int[] result1 = Arrays.stream(numbers)
                .filter((a) -> a % 2 == 1)
                .map((a) -> a * 2)
                .toArray()  // int[] 배열로 반환한다.
                ;
    }
}