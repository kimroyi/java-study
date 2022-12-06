package org.example7;
// 07 Q3

import java.util.ArrayList;

class HeavyWork implements Runnable{
    String name;

    HeavyWork(String name) {
        this.name = name;
    }

    public void work() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);  // 0.1 초 대기한다.
            } catch (Exception e) {
            }
        }
        System.out.printf("%s done.\n", this.name);
    }

    @Override
    public void run() {
        work();
    }
}

public class SampleQ3 {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>(); // 스레드를 저장할 리스트를 생성한다.
        for (int i = 1; i < 5; i++) {
            Thread w = new Thread(new HeavyWork("w" + i));
            threads.add(w); // 스레드를 저장한다.
            w.start();
        }
        for (Thread w : threads) {
            w.join(); // 저장한 스레드가 종료될 때 까지 대기한다.
        }
        long end = System.currentTimeMillis();
        System.out.printf("elapsed time:%s ms\n", end - start);
    }
}
