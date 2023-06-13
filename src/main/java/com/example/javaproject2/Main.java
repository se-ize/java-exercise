package com.example.javaproject2;

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * 3.14;
    }

    public double calculatePerimeter() {
        return radius * 2 * 3.14;
    }
}

class Rectangle implements Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return (width + length) * 2;
    }

    @Override
    public double calculatePerimeter() {
        return width * length;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Circle's Area: " + circle.calculateArea());
        System.out.println("Circle's Perimeter: " + circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Rectangle's Area: " + rectangle.calculateArea());
        System.out.println("Rectangle's Perimeter: " + rectangle.calculatePerimeter());
    }
}