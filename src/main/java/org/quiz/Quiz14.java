package org.quiz;

import java.util.ArrayList;
import java.util.HashMap;

public class Quiz14 {

    static String mosCodeDecode(String data) {
        HashMap<String, String> hash = new HashMap<>();
        hash.put(".-", "A");
        hash.put("-...", "B");
        hash.put("-.-.", "C");
        hash.put("-..", "D");
        hash.put(".", "E");
        hash.put("..-.", "F");
        hash.put("--.", "G");
        hash.put("....", "H");
        hash.put("..", "I");
        hash.put(".---", "J");
        hash.put("-.-", "K");
        hash.put(".-..", "L");
        hash.put("--", "M");
        hash.put("-.", "N");
        hash.put("---", "O");
        hash.put(".--.", "P");
        hash.put("--.-", "Q");
        hash.put(".-.", "R");
        hash.put("...", "S");
        hash.put("-", "T");
        hash.put("..-", "U");
        hash.put("...-", "V");
        hash.put(".--", "W");
        hash.put("-..-", "X");
        hash.put("-.--", "Y");
        hash.put("--..", "Z");

        // 방법 1
//        String[] str = data.split(" ");
//        String result = "";
//        for (String s : str) {
//            if ("".equals(s)) {
//                result += " ";
//            } else {
//                result += hash.get(s);
//            }
//        }
//        return result;

        ArrayList<String> result = new ArrayList<>();
        for (String word : data.split("  ")) {  // 스페이스 2개로 구분
            for (String c : word.split(" ")) {  // 스페이스 1개로 구분
                result.add(hash.get(c));
            }
            result.add(" ");
        }
        return String.join("", result);
    }

    public static void main(String[] args) {
        System.out.println(mosCodeDecode(".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--"));
    }
}
