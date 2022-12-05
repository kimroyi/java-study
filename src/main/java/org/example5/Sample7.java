package org.example5;
// 05-09 추상클래스

abstract class Predator7 extends Animal7{
    abstract String getFood();

    void printFood() {
        System.out.println("my food is %s\n" + getFood());
    }

    static int LEG_COUNT = 4; // 인터페이스 상수

    static int speed() {
        return LEG_COUNT * 30;
    }
}

interface Barkable7 {
    void bark();
}

class Animal7 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger7 extends Predator7 implements Barkable7 {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Lion7 extends Predator7 implements Barkable7 {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}

class ZooKeeper7 {
    void feed(Predator7 predator) {
        System.out.println("feed "+predator.getFood());
    }
}

class Bouncer7 {
    void barkAnimal(Barkable7 animal) { // Animal 대신 Barkable을 사용
        animal.bark();
    }
}

public class Sample7 {
    public static void main(String[] args) {
//        ZooKeeper6 zooKeeper = new ZooKeeper6();
        Tiger7 tiger = new Tiger7();
        Lion7 lion = new Lion7();
//        zooKeeper.feed(tiger); // feed apple 출력
//        zooKeeper.feed(lion); // feed banana 출력

        Bouncer7 bouncer = new Bouncer7();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}
