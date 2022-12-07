package org.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Quiz13 {

    static boolean CheckDuplicate(String data) {
        ArrayList<String> list = new ArrayList<>();
        String[] str = data.split("");

        for (String s : str) {
            if(list.contains(s)) {
                return false;
            } else {
                list.add(s);
            }
        }

        return list.size() == 10;
    }

    public static void main(String[] args) {
        System.out.println(CheckDuplicate("0123456789"));      // true
        System.out.println(CheckDuplicate("01234"));           // false
        System.out.println(CheckDuplicate("01234567890"));     // false
        System.out.println(CheckDuplicate("6789012345"));      // true
        System.out.println(CheckDuplicate("012322456789"));    // false
    }
}
