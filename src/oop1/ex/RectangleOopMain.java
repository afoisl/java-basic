package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.width = 5;
        rectangle.height = 8;

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부 : " + square    );
    }
}
