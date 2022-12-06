package org.example7;
// 07-06 함수형 프로그래밍 스트림(Stream)

import java.util.Arrays;
import java.util.Comparator;

public class Sample7 {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result = Arrays.stream(data)  // IntStream을 생성한다.
                .boxed()  // IntStream을 Stream<Integer>로 변경한다.
                .filter((a) -> a % 2 == 0)  //  짝수만 걸러낸다.
                .distinct()  // 중복을 제거한다.
                .sorted(Comparator.reverseOrder())  // 역순으로 정렬한다.
                .mapToInt(Integer::intValue)  // Stream<Integer>를 IntStream으로 변경한다.
                .toArray()  // int[] 배열로 반환한다.
                ;
        // 위 코드는 다음과 같은 순서로 동작
        // 1. Arrays.stream(data) 으로 정수 배열을 IntStream으로 생성한다.
        // 2. .boxed() 로 IntStream을 Integer의 Stream으로 변경한다.
        //  이렇게 하는 이유는 뒤에서 사용할 Comparator.reverseOrder 와 같은 메서드는 원시타입인 int 대신 Integer를 사용해야 하기 때문이다.
        // 3. .filter((a) -> a % 2 == 0)로 짝수만 필터링한다. 이 때 사용한 (a) -> a % 2 == 0 구문은 위에서 공부한 람다 함수이다.
        //  입력 a가 짝수인지를 조사하는 람다함수로 짝수에 해당되는 데이터만 필터링한다.
        // 4. .distinct()로 스트림에서 중복을 제거한다.
        // 5. .sorted(Comparator.reverseOrder())로 역순 정렬한다.
        // 6. .mapToInt(Integer::intValue)로 Integer의 Stream을 IntStream으로 변경한다.
        //  왜냐하면 최종적으로 int[] 타입의 배열을 리턴해야 하기 때문이다.
        // 7. .toArray()를 호출하여 IntStream의 배열인 int[] 배열을 리턴한다.
    }
}
