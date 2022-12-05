package org.example3;

import java.util.ArrayList;
import java.util.Arrays;

public class SampleQ7 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        System.out.println(myList); // [Life, is, too, short] 출력
        String joinStr = String.join(" ", myList);
        System.out.println(joinStr);
//        System.out.println(joinStr.replaceAll(",", " "));
    }
}