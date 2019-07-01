package com.stackroute.junitdemo3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student student;
    @Before
    public void setup()
    {
        student=new Student();
    }
    @Test
    public void testmarks1()
    {
        String res=student.marks(new int[]{7,40,100},3);
        assertEquals("passed",res);
    }
    @Test
    public void testmarks2()
    {
        String res=student.marks(new int[]{7,40,101},3);
        assertEquals("failed",res);
    }
    @Test
    public void testmarks3()
    {
        String res=student.marks(new int[]{50,50,50},3);
        assertEquals("passed",res);
    }
    @Test
    public void testmarks4()
    {
        String res=student.marks(new int[]{100,100,100},3);
        assertEquals("passed",res);
    }

}