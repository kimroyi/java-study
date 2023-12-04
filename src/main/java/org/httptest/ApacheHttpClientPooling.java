package org.httptest;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;

public class ApacheHttpClientPooling {
    public static void main(String[] args) throws Exception {
        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();
        connectionManager.setMaxTotal(100); // 최대 연결 수 설정
        connectionManager.setDefaultMaxPerRoute(10); // 최대 라우트당 연결 수 설정

        HttpClient httpClient = HttpClientBuilder.create()
                .setConnectionManager(connectionManager)
                .build();

        // HttpGet request = new HttpGet("https://www.example.com");
        HttpGet request = new HttpGet("https://jsonplaceholder.typicode.com/todos/1");
        HttpResponse response = httpClient.execute(request);
        HttpResponse response2 = httpClient.execute(request);
        HttpResponse response3 = httpClient.execute(request);
        HttpResponse response4 = httpClient.execute(request);
        HttpResponse response5 = httpClient.execute(request);
        HttpResponse response6 = httpClient.execute(request);

        // 응답 처리 로직...
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(result);
    }
}
