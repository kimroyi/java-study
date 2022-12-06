package org.example7;
// 07-05 쓰레드(Thread)

import java.util.ArrayList;

public class Sample5 implements Runnable {
    int seq; 
    
    public Sample5(int seq) {
        this.seq = seq;
    }
    
    public void run() { // Thread를 상속하면 run 메서드를 구현해야 한다.
        System.out.println(this.seq + " thread start."); // 쓰레드 시작
        try {
            Thread.sleep(1000); // 1초 대기한다.
        } catch (Exception e) {
        }
        System.out.println(this.seq + "thread end."); // 쓰레드 종료
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new Sample5(i));
            t.start();
            threads.add(t);
        }

        for (int i = 0; i < threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join(); // t 쓰레드가 종료될 때까지 기다린다.
            } catch (Exception e) {
            }
        }
        System.out.println("main end."); // main 메소드 종료
    }
}