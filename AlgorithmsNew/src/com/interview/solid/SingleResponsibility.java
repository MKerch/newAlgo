package com.interview.solid;

public class SingleResponsibility {

    public static void main(String[] args) {

        Bady bady = new Bady();
        bady.cook();
        bady.cleanFloor();
    }
}

//class Employee {
//    int getSalary() {
//        return 10;
//    }
//
//    void cook() {
//    }
//
//    void cleanFloor() {
//    }
//
//    void deliverFood() {
//    }
//}

class Employee {
    int getSalary() {
        return 10;
    }
}

class Cook extends Employee {
    void cook() {
    }
}

class Janitor extends Employee {
    void cleanFloor() {
    }
}

class Bady {
    Cook cook = new Cook();
    Janitor janitor = new Janitor();

    void cook() {
        cook.cook();
    }

    void cleanFloor() {
        janitor.cleanFloor();
    }

}
