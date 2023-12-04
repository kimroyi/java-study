package org.httptest;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class ApacheCloseableHttpClient {

    public static void requestHttpTest() throws Exception {

        try {
            // HTTP Client 생성
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();

            // HTTP GET 요청을 생성
            HttpGet httpGet = new HttpGet("https://jsonplaceholder.typicode.com/todos/1");
            HttpGet httpGet2 = new HttpGet("https://www.example.com");

            // HTTP 요청에 대한 헤더 설정
            httpGet.setHeader("Accept", "application/json");

            // GET 요청
            CloseableHttpResponse response = httpClient.execute(httpGet);
            CloseableHttpResponse response2 = httpClient.execute(httpGet);
            // 📌아래 주석을 풀고 실행 시 무한 로딩
            // CloseableHttpResponse response3 = httpClient.execute(httpGet);
            CloseableHttpResponse response4 = httpClient.execute(httpGet2);

            // 요청에 대한 결과 상태 코드 (정상: 200)
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode == HttpStatus.SC_OK) {
                String result = EntityUtils.toString(response.getEntity());
                System.out.println(result);
            }

            httpClient.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) throws Exception {
        ApacheCloseableHttpClient.requestHttpTest();
    }
}
