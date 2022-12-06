package org.example7;
// 07-03 정적(static) 변수와 메소드 싱글톤 패턴(singleton pattern) 예제

// 싱글톤은 단 하나의 객체만을 생성하게 강제하는 패턴이다.
// 즉 클래스를 통해 생성할 수 있는 객체는 Only One, 즉, 한 개만 되도록 만드는 것이 싱글톤!
class Singleton {
    private  static Singleton one;
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (one == null) {
            one = new Singleton(); // 같은 클래스 이므로 생성자 호출이 가능하다.
        }
        return one;
    }
}

public class Sample3 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2); // true 출력
    }
}
