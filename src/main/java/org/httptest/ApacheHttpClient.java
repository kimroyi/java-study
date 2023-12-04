package org.httptest;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class ApacheHttpClient {

    public static void requestHttpTest() throws Exception {

        try {
            // HTTP Client 생성
            HttpClient httpClient = new DefaultHttpClient();

            // HTTP GET 요청을 생성
            HttpGet httpGet = new HttpGet("https://jsonplaceholder.typicode.com/todos/1");

            // HTTP 요청에 대한 헤더 설정
            httpGet.setHeader("Accept", "application/json");

            // GET 요청
            HttpResponse response = httpClient.execute(httpGet);
            // 📌아래 주석을 풀고 실행 시 에러 발생
            // HttpResponse response2 = httpClient.execute(httpGet);

            // 요청에 대한 결과 상태 코드 (정상: 200)
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode == HttpStatus.SC_OK) {
                String result = EntityUtils.toString(response.getEntity());
                System.out.println(result);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) throws Exception {
        ApacheHttpClient.requestHttpTest();
    }
}
