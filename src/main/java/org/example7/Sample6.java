package org.example7;
// 07-06 함수형 프로그래밍 람다(Lambda)

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Sample6 {
    public static void main(String[] args) {
        BinaryOperator<Integer> mc = (a, b) -> a + b;
        int result = mc.apply(3, 4);  // sum이 아닌 apply 메서드를 사용해야 한다.
        System.out.println(result);  // 7 출력
    }
}
