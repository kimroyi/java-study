package org.example5;
// 05-08 다형성

interface Predator6 {
    String getFood();

    default void printFood() {
        System.out.println("my food is %s\n" + getFood());
    }

    int LEG_COUNT = 4; // 인터페이스 상수

    static int speed() {
        return LEG_COUNT * 30;
    }
}

interface Barkable {
    void bark();
}

interface BarkablePredator extends Predator6, Barkable {

}

class Animal6 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger6 extends Animal6 implements Predator6, Barkable {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Lion6 extends Animal6 implements BarkablePredator {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}

class ZooKeeper6 {
    void feed(Predator6 predator) {
        System.out.println("feed "+predator.getFood());
    }
}

class Bouncer {
    void barkAnimal(Barkable animal) { // Animal 대신 Barkable을 사용
        animal.bark();
    }
}

public class Sample6 {
    public static void main(String[] args) {
//        ZooKeeper6 zooKeeper = new ZooKeeper6();
        Tiger6 tiger = new Tiger6();
        Lion6 lion = new Lion6();
//        zooKeeper.feed(tiger); // feed apple 출력
//        zooKeeper.feed(lion); // feed banana 출력

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}
