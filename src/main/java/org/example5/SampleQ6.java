package org.example5;

import java.util.ArrayList;
import java.util.Arrays;

// 05 Q6
class Calculator6 {
    Integer value;

    public Calculator6() {
        this.value = 0;
    }

    void add(Integer val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }
}

public class SampleQ6 {
    public static void main(String[] args) {
        Calculator6 cal = new Calculator6();
        cal.add(3);  // 여기서 NullPointerException 이 발생한다.
        System.out.println(cal.getValue());
    }
}