package org.example;

public class Main {
    public static void main(String[] args) {


        try {
            String names = null;
            System.out.println(names.length());

        } catch (Exception e) {
            System.out.println("エラーが発生しました");
            e.printStackTrace();
        }
    }
}