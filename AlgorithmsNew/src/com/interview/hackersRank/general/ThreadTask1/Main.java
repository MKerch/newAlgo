package com.interview.hackersRank.general.ThreadTask1;

public class Main {


    public static void main(String[] args) {
        Foo foo = new Foo();
        Foo2 foo2 = new Foo2();
        Foo3 foo3 = new Foo3();

        Thread t = new Thread(foo);
        Thread t2 = new Thread(foo2);
        Thread t3 = new Thread(foo3);
        t.run();
        t2.run();
        t3.run();

    }
}
