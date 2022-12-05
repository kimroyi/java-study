package org.example5;

import java.util.ArrayList;
import java.util.Arrays;

// 05 Q4
class Calculator4 {
    int value;

    Calculator4() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    int avg(int[] items) {
        int sum = 0;
        for(int item : items) {
            sum += item;
        }
        return sum / items.length;
    }

    int avg(ArrayList<Integer> items) {
        int sum = 0;
        for(int item : items) {
            sum += item;
        }
        return sum / items.size();
    }
}

public class SampleQ4 {
    public static void main(String[] args) {
        Calculator4 cal = new Calculator4();

        int[] data = {1, 3, 5, 7, 9};
        int result = cal.avg(data);
        System.out.println(result);  // 5 출력

        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int result2 = cal.avg(data2);
        System.out.println(result2);  // 5 출력

    }
}