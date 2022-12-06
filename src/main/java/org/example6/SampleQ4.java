package org.example6;

import java.io.*;
import java.util.Scanner;

// 06 Q4
public class SampleQ4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.printf("파일에 입력내용 : ");
        String text = sc.nextLine();


        PrintWriter fw = new PrintWriter(new FileWriter("sample.txt", true));
        fw.println(text);
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line = br.readLine();
        System.out.println(line);
        br.close();
    }
}