package org.quiz;

import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("콤마로 구분하여 숫자 입력 :");
        String str = sc.nextLine();
        String[] number = str.split(",");
        int total = 0;
        for (String num : number) {
            total += Integer.parseInt(num.trim());
        }
        System.out.println(total);
    }
}
