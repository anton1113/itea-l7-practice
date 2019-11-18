package com.itea.basic.java.l7;

public class Point {

    private static int field = 10;

    public double x;
    public double y;

    public Point() {
        System.out.println("Creating a point...");
    }

    public Point(double x) {
        System.out.println("Creating a point...");
        this.x = x;
    }

    public Point(double x, double y, String s) {
        System.out.println("Creating a point...");
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double pointsDistance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}
