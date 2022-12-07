package org.quiz;

import java.util.Arrays;

class Calculator {
    private int[] data;
    Calculator(int[] data) {
        this.data = data;
    }

    public int sum() {
        // 방법 1
//        int result = 0;
//        for (int val : data) {
//            result += val;
//        }
//        return result;
        // 스트림 활용 방법 2
        return Arrays.stream(data).sum();
    }

    public float avg() {
        // 방법 1
//        return (float) sum() / data.length;
        // 스트림 활용 방법 2
        return (float) Arrays.stream(data).average().getAsDouble();
    }
}

public class Quiz9 {
    public static void main(String[] args) {
        int[] data1 = {1,2,3,4,5};
        Calculator cal1 = new Calculator(data1);
        System.out.println(cal1.sum()); // 15 출력
        System.out.println(cal1.avg()); // 3.0 출력

        int[] data2 = {6,7,8,9,10};
        Calculator cal2 = new Calculator(data2);
        System.out.println(cal2.sum()); // 40 출력
        System.out.println(cal2.avg()); // 8.0 출력
    }
}
