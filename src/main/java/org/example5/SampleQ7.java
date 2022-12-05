package org.example5;

// 05 Q7

interface Mineral {
    int getMineral();
}

class Gold implements Mineral{
    public int getMineral() {
        return 100;
    }
}

class Silver implements Mineral{
    public int getMineral() {
        return 90;
    }
}

class Bronze implements Mineral{
    public int getMineral() {
        return 80;
    }
}

class MineralCalculator {
    int value = 0;

    void add(Mineral mineral) {
        this.value += mineral.getMineral();
    }

    public int getValue() {
        return this.value;
    }
}

public class SampleQ7 {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());  // 270 출력
    }
}