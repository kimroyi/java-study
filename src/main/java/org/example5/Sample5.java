package org.example5;
// 05-07 인터페이스

interface Predator {
    String getFood();

    default void printFood() {
        System.out.println("my food is %s\n" + getFood());
    }

    int LEG_COUNT = 4; // 인터페이스 상수

    static int speed() {
        return LEG_COUNT * 30;
    }
}

class Animal5 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal5 implements Predator {
    public String getFood() {
        return "apple";
    }
}

class Lion extends Animal5 implements Predator {
    public String getFood() {
        return "banana";
    }
}

class ZooKeeper {
    void feed(Predator predator) {
        System.out.println("feed "+predator.getFood());
    }
}

public class Sample5 {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger); // feed apple 출력
        zooKeeper.feed(lion); // feed banana 출력
        System.out.println(Predator.speed());
    }
}
