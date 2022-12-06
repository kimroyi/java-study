package org.example6;

import java.io.*;

// 06 Q3
public class SampleQ3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("sample.txt");
        fw.write("Write once, run anywhere");
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line = br.readLine();
        System.out.println(line);  // null 이 출력된다.
        br.close();
    }
}