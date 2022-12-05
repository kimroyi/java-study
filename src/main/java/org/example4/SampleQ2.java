package org.example4;

public class SampleQ2 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while (num <= 1000) {
            if (num % 3 == 0) {
                sum += num;
            }
            num++;
        }
        System.out.println(sum);
    }
}
