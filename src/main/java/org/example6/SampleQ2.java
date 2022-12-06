package org.example6;

import java.util.Scanner;

// 06 Q2
public class SampleQ2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        while (true) {
//            System.out.println(a.toUpperCase());
//            if (a.equals("END")) {
//                System.out.println("끝!");
//                break;
//            } else {
//                a = sc.nextLine();
//            }
//        }

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("영어 문장을 입력하세요");
            String line = sc.nextLine();
            if ("END".equals(line)) { // 입력문장이 "END" 이면 종료
                break;
            }
            System.out.println(line.toUpperCase()); // 대문자로 변경하여 출력
        }
    }
}