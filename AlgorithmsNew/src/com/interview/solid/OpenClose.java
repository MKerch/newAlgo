package com.interview.solid;

public class OpenClose {

    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        Celica celica = new Celica();
        workInTaxy(celica);
    }

    static void workInTaxy(Car car) {
        car.workInTaxy();
    }

}

interface Car {
    void workInTaxy();
}

class Toyota implements Car {

    @Override
    public void workInTaxy() {
        this.getPassagers();
    }

    void getPassagers() {
        System.out.println("get passagers");
    }
}

class Celica implements Car {

    @Override
    public void workInTaxy() {
        this.getPassager();
    }

    void getPassager() {
        System.out.println("get passager");
    }

}
