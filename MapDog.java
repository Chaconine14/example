package org.example;

import java.util.HashMap;

public class MapDog {
    public static void main(String[] args) {
        HashMap<String, String> dog = new HashMap<>();
        dog.put("クッキー", "15歳・♀");
        dog.put("ハナちゃん", "5歳・♀");
        dog.put("タロー", "6歳・♂");

        System.out.println(dog.get("クッキー"));
        System.out.println(dog.get("ハナちゃん"));
        System.out.println(dog.get("タロー"));
    }
}
