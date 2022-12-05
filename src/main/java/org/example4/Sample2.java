package org.example4;

import java.util.ArrayList;

public class Sample2 {
    public static void main(String[] args) {
        // IF문 contains
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("papre");
        pocket.add("handphone");
        pocket.add("money");
        
        if (pocket.contains("money")) {
            System.out.println("돈있다!");
        } else {
            System.out.println("돈없다ㅠ");
        }
    }
}
