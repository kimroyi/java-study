package org.quiz;

import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단을 출력할 숫자를 입력하세요(2~9) :");
        int num = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d ",  num * i);
        }
    }
}
