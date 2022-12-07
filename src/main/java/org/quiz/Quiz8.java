package org.quiz;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Quiz8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c:/abc.txt"));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            list.add(line);
        }
        br.close();

        PrintWriter pw = new PrintWriter(new FileWriter("c:/result.txt"));
        int total = 0;
        for (String result : list) {
            total += Integer.parseInt(result);
        }
        pw.println("전체 합계는 : " + total + "/ 전체 평균은 : " + (float)total/ list.size());
        pw.close();
    }
}
