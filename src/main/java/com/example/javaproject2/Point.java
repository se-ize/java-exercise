package com.example.javaproject2;

public class Point {
    public int x;
    public int y;

    boolean isSameXy() {
        return x == y;
    }

    public double getDistance(Point p, Point q) {
        double distance = Math.sqrt(Math.pow((q.x - p.x), 2)+ Math.pow((q.y - p.y), 2));
        return distance;
    }

    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.x);
    }
}
