package org.example5;
// 05 Q1
class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}

class UpgradeCalculator extends Calculator {
    void minus(int val) {
        this.value -= val;
    }
}

public class SampleQ1 {
    public static void main(String[] args) {
//        Calculator cal = new Calculator();
//        cal.add(10);
//        System.out.println(cal.getValue());  // 10 출력

        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue());
    }
}