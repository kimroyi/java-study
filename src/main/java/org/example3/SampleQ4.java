package org.example3;

public class SampleQ4 {
    public static void main(String[] args) {
        String jumin = "881120-1068234";
        System.out.println("성별 구분 숫자 값은 ? " + jumin.charAt(7));
        if (jumin.charAt(7) == '1') {
            System.out.println("남자입니다.");
        } else {
            System.out.println("여자입니다.");
        }
    }
}