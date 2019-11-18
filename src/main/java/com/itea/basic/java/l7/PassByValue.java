package com.itea.basic.java.l7;

public class PassByValue {

    public static void main(String[] args) {
        Point p = new Point(1, 1);
        m(p);
        System.out.println(p);
    }

    public static void m(int i) {
        i = 500;
    }

    public static void m(Point p) {
        p = new Point(5, 5);
    }
}
