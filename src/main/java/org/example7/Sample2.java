package org.example7;
// 07-03 정적(static) 변수와 메소드 Util 예제

import java.text.SimpleDateFormat;
import java.util.Date;

// 보통 스태틱 메소드는 유틸리티성 메소드를 작성할 때 많이 사용된다.
// 예를 들어 "오늘의 날짜 구하기", "숫자에 콤마 추가하기", 등의 메소드를 작성할 때 사용하는 것이 유리하다.
// 다음은 "날짜"를 구하는 Util 클래스의 예이다.
class Util {
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
}

public class Sample2 {
    public static void main(String[] args) {
        System.out.println(Util.getCurrentDate("yyyyMMdd")); // 오늘 날짜 출력
    }
}
