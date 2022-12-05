package org.example4;

import java.util.ArrayList;

public class Sample3 {
    // IF문 else if
    public static void main(String[] args) {
        boolean hasCard = true;
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("papre");
        pocket.add("handphone");
        pocket.add("money");

        if (pocket.contains("money")) {
            System.out.println("돈 있다 택시탄다.");
        } else if (hasCard) {
            System.out.println("카드가 있으니까 택시탄다.");
        } else {
            System.out.println("돈도 없고 카드도 없네.. 걸어간다.");
        }
    }
}
