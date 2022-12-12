package org.smallproject;

import java.util.Arrays;

public class Item {
    private String name;
    private int length;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String raw() {
        StringBuffer padded = new StringBuffer(this.value);
        while (padded.toString().getBytes().length < this.length) {
            padded.append(' ');
        }
        return padded.toString();
    }

    // create 메소드는 name, length, value를 입력으로 받아서 Item 객체를 생성하여 리턴하는 static 메소드이다.
    // 이렇게 객체를 생성하는 static 메소드를 팩토리 메소드라고도 한다.
    public static Item create(String name, int length, String value) {
        Item item = new Item();
        item.setName(name);
        item.setLength(length);
        item.setValue(value);
        return item;
    }

    public static void main(String[] args) {
        Packet packet = new Packet();

        Item item1 = Item.create("이름", 20, "홍길동");
        Item item2 = Item.create("전화번호", 11, "01099998888");

        packet.addItem(item1);
        packet.addItem(item2);

        System.out.println("[" + packet.raw() + "]");
    }
}
