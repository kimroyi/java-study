package org.example5;
// 05 Q3
class Calculator3 {
    int value;

    Calculator3() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

//    boolean isOdd(int val) {
//        if (val % 2 == 0) {
//            return false;
//        } else {
//            return true;
//        }
//    }

    // 문제풀이
    boolean isOdd(int val) {
        return val % 2 == 1;
    }
}

public class SampleQ3 {
    public static void main(String[] args) {
        Calculator3 cal = new Calculator3();
        System.out.println(cal.isOdd(10));  // 100 출력
    }
}