package com.stackroute.junitdemo3;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VowelsTest {
    Vowels obj;
    @Before
    public void setUp(){
        obj=new Vowels();
    }
    @After
    public void tearDown(){
        obj=null;
    }

    @Test
    public void removeVowels() {
        String[] result=obj.removeVowels(new String[]{"India","United States","Germany","Egypt","czechoslovakia"});
        assertArrayEquals(new String[]{"Ind","Untd Stts","Grmny","Egypt","czchslvk"},result);
    }
    @Test
    public void removeVowels1() {
        String[] result=obj.removeVowels(new String[]{"ai","eo","iu","oo","uu"});
        assertArrayEquals(new String[] {"a","e","i","o","u"},result);
    }
    @Test
    public void removeVowels2() {
        String[] result=obj.removeVowels(new String[]{"aeiou"});
        assertArrayEquals(new String[] {"a"},result);
    }
    @Test
    public void removeVowels3() {
        String[] result=obj.removeVowels(new String[]{"A"});
        assertArrayEquals(new String[] {"A"},result);
    }
}

