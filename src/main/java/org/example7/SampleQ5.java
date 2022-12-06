package org.example7;
// 07 Q5


import java.util.Arrays;

public class SampleQ5 {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, -5, 8, -3};

        int[] result = Arrays.stream(numbers)
                .filter((a) -> a >= 0)
                .toArray()  // int[] 배열로 반환한다.
                ;
    }
}