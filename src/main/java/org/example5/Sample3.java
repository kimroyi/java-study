package org.example5;
// 05-05 상속
class Animal3 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog3 extends Animal3 {
    void sleep() {
        System.out.println(this.name + "zzz");
    }
}

class HouseDog extends Dog3 {
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    }
}

public class Sample3 {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();
        houseDog.sleep(3);  // happy zzz in house for 3 hours 출력
    }
}


