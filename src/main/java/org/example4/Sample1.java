package org.example4;

public class Sample1 {
    public static void main(String[] args) {
        // IF문 and(&&), or(||), not(!)
        int money = 2000;
        boolean hasCard = false;
        if (money >= 3000 || hasCard) {
            System.out.println("택시타고간다.");
        } else {
            System.out.println("걸어간다.");
        }
    }
}
