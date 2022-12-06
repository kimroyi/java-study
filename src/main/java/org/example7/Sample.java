package org.example7;
// 07-03 정적(static) 변수와 메소드

class HouseLee {
    // HouseLee클래스의 lastname은 어떤 객체이던지 동일한 값을 유지할 경우
    // static을 사용하여 메모리의 이점을 얻자!
    static String lastname = "이";
}

public class Sample {
    public static void main(String[] args) {
        HouseLee lee1 = new HouseLee();
        HouseLee lee2 = new HouseLee();
    }
}
