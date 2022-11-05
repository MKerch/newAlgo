package com.interview.solid;

public class DependancyInvertion {

    public static void main(String[] args) {

    }

}

interface DAO {
    void execute();
}

class DataClass implements DAO {
    @Override
    public void execute() {
        System.out.println("execute");
    }
}

class Client {
    DAO dao = new DataClass();

    void doJob() {
        dao.execute();
    }
}
