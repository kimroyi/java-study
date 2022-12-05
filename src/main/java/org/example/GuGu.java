package org.example;

public class GuGu {

    public void dan(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.println(n * i);
        }
    }

    public static void main(String[] args) {
        GuGu gugu = new GuGu();
        for (int i = 2; i < 10; i++) {   // i에 2~9 까지의 값이 반복하여 대입된다.
            gugu.dan(i);
        }
    }
}
