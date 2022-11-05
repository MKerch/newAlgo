package com.interview.hackerrank.java;

import java.lang.reflect.Method;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;

public class JavaReflectionAttributes {

    public static void main(String[] args) {
        Class cl = StudentA.class;
        Method[] declaredMethods = cl.getDeclaredMethods();
        ArrayList<String> methodList = new ArrayList<>();
        for(Method s: declaredMethods){
            methodList.add(s.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }

    }


}

class StudentA{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
