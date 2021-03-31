package com.adp3.submissions;

import org.junit.*;

public class TestUser {

    User fury, tyson, gypsy;

    @Before
    public void setUp(){
        fury = new User();
        fury.setName("Tyson");
        fury.setSurname("Fury");
        fury.setStudentNumber(217301827);

        //equal to fury
        gypsy = new User();
        gypsy.setName("Tyson");
        gypsy.setSurname("Fury");
        gypsy.setStudentNumber(217301827);

        //Identical Objects
        tyson = fury;
    }

    @After
    public void tearDown(){

    }

    @Test
    public void testEquality(){
        System.out.println(fury.hashCode());
        System.out.println(tyson.hashCode());

        Assert.assertSame(tyson, fury);
    }       //end testEquality()


    @Test
    public void testIdentity(){
        System.out.println(fury.toString());
        System.out.println(gypsy.toString());

        Assert.assertTrue(gypsy == tyson);
    }       //end testIdentity()


    @Test(timeout = 3000)
    public void testTimeout(){

        while (true) {
            //do something endlessly
        }
    }       //end testTimeout()


    @Test
    public void testFailing(){
        Assert.fail();
    }

    @Ignore
    @Test
    public void testIgnore(){
        Assert.assertEquals(2, 1);
    }       //end testIgnore()


}       //end class
