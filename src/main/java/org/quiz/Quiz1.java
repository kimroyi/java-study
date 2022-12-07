package org.quiz;

public class Quiz1 {
    public static void main(String[] args) {
        String str = "a:b:c:d";
        String[] strSlice = str.split(":");
        String result = String.join("#", strSlice);
        System.out.println(result);
    }
}
