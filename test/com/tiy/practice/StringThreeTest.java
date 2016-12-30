package com.tiy.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by crci1 on 12/28/2016.
 */
public class StringThreeTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void testStringSplit(){
        StringThree three = new StringThree();
        String finishString = three.makeChanges("Make money", "ney");
        assertEquals("Make mo", finishString);
    }

    @Test
    public void tesLargerStringSplit(){
        StringThree three = new StringThree();
        String finishString = three.makeChanges("Welcome to Lawrenceville", "e");
        assertEquals("Wlcom to Lawrncvill", finishString);
    }

    @Test
    public void testTheSameLetter(){
        StringThree three = new StringThree();
        String finishString = three.makeChanges("xxx", "xx");
        assertEquals("x", finishString);


    }

    @Test
    public void testCapLetters(){
        StringThree three = new StringThree();
        String finishString = three.makeChanges("this is christmas", "IS");
        assertEquals("th chrtmas", finishString);


    }

    @Test
    public void testOtherCapLetters(){
        StringThree three = new StringThree();
        String finishString = three.makeChanges("This is a FISH", "IS");
        assertEquals("Th a FH", finishString);


    }


    @Test
    public void testCamelCaseletter(){
        StringThree three = new StringThree();
        String finishString = three.makeChanges("Hi HoHo", "Ho");
        assertEquals("Hi ", finishString);

    }



}