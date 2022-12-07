package org.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz4 {

    static int fib(int n) {
        if (n == 0) { // n이 0일 때는 0을 반환
            return 0;
        } else if (n == 1) { // n이 1일 때는 1을 반환
            return 1;
        } else { // n이 2 이상일 때는 그 이전의 두 값을 더하여 반환
            return fib(n-2) + fib(n-1);
        }

    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 n을 입력하시오 : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(fib(i));
        }
    }
}
