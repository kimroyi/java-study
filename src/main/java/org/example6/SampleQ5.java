package org.example6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// 06 Q5
public class SampleQ5 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("sample.txt");
        fw.write("Life is too short \r\nyou need python");
        fw.close();

        // sample.text 파일을 읽어서 변수에 저장한다.
        ArrayList<String> data = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        while(true) {
            String line = br.readLine();
            if (line==null) break;
            data.add(line);
        }
        br.close();

        // 줄 단위로 읽으면 줄바꿈 문자가 없어지므로 줄바꿈 문자를 포함한다.
        String text = String.join("\n", data);

        // python 이라는 단어를 java로 변경한다.
        text = text.replaceAll("python", "java");

        // 변경된 내용을 다시 파일에 적는다.
        FileWriter f = new FileWriter("sample.txt");
        f.write(text);
        f.close();
    }
}