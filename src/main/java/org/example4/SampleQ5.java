package org.example4;

public class SampleQ5 {
    public static void main(String[] args) {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int total = 0;
        int markLength = marks.length;
        for(int mark : marks) {
            total += mark;
        }
        System.out.println((float) total/markLength);
    }
}
