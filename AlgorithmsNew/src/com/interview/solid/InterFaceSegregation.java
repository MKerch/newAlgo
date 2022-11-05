package com.interview.solid;

public class InterFaceSegregation {

    public static void main(String[] args) {
        Worker iWorker = new Waiter();
        iWorker.work();
    }

}

interface IWorker extends Worker, Eater {
}

interface Worker {
    void work();
}

interface Eater {
    void eat();
}


//we don't need to have extra methods. waiter not eat
class Waiter implements Worker {
    @Override
    public void work() {

    }

//    @Override
//    public void eat() {
//
//    }
}
