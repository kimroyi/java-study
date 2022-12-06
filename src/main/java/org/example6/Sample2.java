package org.example6;

import java.io.*;
import java.util.Scanner;

// 06-02 파일 입출력
public class Sample2 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("c:/out.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.";
            pw.println(data);
        }
        pw.close();

        FileWriter fw2 = new FileWriter("c:/out.txt", true);  // 파일을 추가 모드로 연다.
        // PrintWriter를 사용할 경우에는 생성자의 파라미터로 파일명 대신 추가모드로 열린 FileWriter의 객체를 전달해야한다.
//        PrintWriter pw2 = new PrintWriter(new FileWriter("c:/out.txt", true));
        for(int i=11; i<21; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            fw2.write(data);
        }
        fw2.close();

        BufferedReader br = new BufferedReader(new FileReader("c:/out.txt"));
        while(true) {
            String line = br.readLine();
            if (line==null) break;  // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            System.out.println(line);
        }
        br.close();
    }
}