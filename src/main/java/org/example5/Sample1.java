package org.example5;
// 05-03 메소드
public class Sample1 {

    int a; // 객체변수 a
    void varTest() {
        this.a++;
    }

    public static void main(String[] args) {
        Sample1 sample = new Sample1();
        sample.a = 1;
        sample.varTest();
        System.out.println(sample.a);
    }

}
