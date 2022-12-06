package org.example7;
// 07-03 정적(static) 변수와 메소드 Counter 예제

// 💥 Before
//class Counter {
//    int count = 0;
//    Counter() {
//        this.count++;
//        System.out.println(this.count);
//    }
//}

// 💎 After
class Counter {
    // static키워드를 붙였더니 count값이 공유된다.
    // 보통 변수의 static 키워드는 프로그래밍시 메모리의 효율보다는 공유의 목적으로 훨씬 더 많이 사용한다.
    static int count = 0;
    Counter() {
        count++; // count는 더이상 객체변수가 아니므로 this를 제거하는 것이 좋다.
        System.out.println(count); // this 제거
    }

    // static이라는 키워드가 메소드 앞에 붙으면 이 메소드는 스태틱 메소드(static method)가 된다.
    // 메소드 앞에 static 키워드를 붙이면 Counter.getCount() 와 같이 객체 생성없이 클래스를 통해 메서드를 직접 호출이 가능하다.
    // 단! 스태틱 메소드 안에서는 객체변수 접근이 불가능 하다. count변수가 static변수이기 때문에 해당 메서드에서 접근이 가능하다.
    public static int getCount() {
        return count;
    }
}

public class Sample1 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println(Counter.getCount()); // 스태틱 메서드는 클래스를 이용하여 호출
    }
}
