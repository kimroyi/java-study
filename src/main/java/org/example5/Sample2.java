package org.example5;
// 05-05 상속
class Animal1 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal1 {
    void sleep() {
        System.out.println(this.name + "zzz");
    }
}

public class Sample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }
}


