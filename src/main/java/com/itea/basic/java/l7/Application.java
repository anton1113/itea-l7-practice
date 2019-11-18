package com.itea.basic.java.l7;

public class Application {

    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);

        double dist = Point.pointsDistance(p1, p2);
        System.out.println(dist);

        System.out.println(p1);
        System.out.println(p2);
    }
}
