package org.quiz;

import java.util.Random;

class OddException extends Exception {
}

public class Quiz10 {
    static void execute(int n) throws OddException {
        System.out.printf("입력 숫자: %d\n", n);
        if (n % 2 == 1) {  // 홀수이면 OddException이 발생한다.
            throw new OddException();
        }
        System.out.println("짝수입니다.");
    }

    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            try {
                execute(r.nextInt(10));
            } catch (OddException e) {
                e.printStackTrace();
            }
        }
    }
}
