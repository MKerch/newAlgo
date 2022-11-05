package com.test;

import com.interview.unittests.Circle;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    private List<String> list;

    @Before
    public void init() {
        System.out.println("startup");
        list = new ArrayList<>(Arrays.asList("test1", "test2"));
    }

    @After
    public void teardown() {
        System.out.println("teardown");
        list.clear();
    }

    @Test
    public void whenCheckingListSize_thenSizeEqualsToInit() {
        System.out.println("executing test");
        assertEquals(2, list.size());

        list.add("another test");
    }

    @Test
    public void whenCheckingListSizeAgain_thenSizeEqualsToInit() {
        System.out.println("executing another test");
        assertEquals(2, list.size());

        list.add("yet another test");
    }

    @Test
    public void givenRadius_whenCalculateArea_thenReturnArea() {
        double actualArea = Circle.calculateArea(1d);
        double expectedArea = 3.141592653589793;
        assertEquals(expectedArea, actualArea);
    }

}
