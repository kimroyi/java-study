package org.example5;
// 05-06 생성자
class Animal4 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog4 extends Animal4 {
    void sleep() {
        System.out.println(this.name + "zzz");
    }
}

class HouseDog4 extends Dog4 {
    HouseDog4(String name) {
        this.setName(name);
    }

    HouseDog4(int type){
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    }
}

public class Sample4 {
    public static void main(String[] args) {
        HouseDog4 happy = new HouseDog4("happy"); // 생성자 호출 시 문자열을 전달해야 한다.
        HouseDog4 yorkshire = new HouseDog4(1);
        System.out.println(happy.name); // happy 출력
        System.out.println(yorkshire.name); // yorkshire 출력
    }
}


