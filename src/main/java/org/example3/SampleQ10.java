package org.example3;

import java.util.HashMap;

public class SampleQ10 {

    enum CoffeType{
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    }
    static void printCoffeePrice(CoffeType type) {
        HashMap<CoffeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeType.AMERICANO, 3000);  // 1: 아메리카노
        priceMap.put(CoffeType.ICE_AMERICANO, 4000);  // 2: 아이스 아메리카노
        priceMap.put(CoffeType.CAFE_LATTE, 5000);  // 3: 카페라떼
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

    public static void main(String[] args) {
//        printCoffeePrice(1);  // "가격은 3000원 입니다." 출력
//        printCoffeePrice(99);  // NullPointerException 발생
        printCoffeePrice(CoffeType.ICE_AMERICANO);
    }
}