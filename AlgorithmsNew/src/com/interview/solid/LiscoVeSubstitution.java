package com.interview.solid;

public class LiscoVeSubstitution {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHight(10);
        rectangle.setWith(5);
        System.out.println(rectangle.getSquare());

        Square square = new Square();
        square.setWith(5);
        System.out.println(square.getSquare());


    }

}

interface Shape {
    int getSquare();
}

class Rectangle implements Shape {
    int with;
    int hight;

    @Override
    public int getSquare() {
        return with * hight;
    }

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }
}

class Square implements Shape {

    int with;

    @Override
    public int getSquare() {
        return with * with;
    }

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }
}
