package org.example6;

import java.util.Scanner;

// 06 Q1
public class SampleQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하시오 : ");
        int a = sc.nextInt();

        System.out.print("두번째 숫자를 입력하시오 : ");
        int b = sc.nextInt();

        System.out.print("두 수의 합은 ? ");
        System.out.println(a+b);
    }
}