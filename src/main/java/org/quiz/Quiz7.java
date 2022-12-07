package org.quiz;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Quiz7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c:/abc.txt"));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            list.add(line);
        }
        br.close();
        list.sort(Comparator.reverseOrder());

        PrintWriter pw = new PrintWriter(new FileWriter("c:/result.txt"));
        for (String result : list) {
            pw.println(result);
        }
        pw.close();
    }
}
