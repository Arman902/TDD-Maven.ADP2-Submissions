package com.adp2.submissions;

import org.junit.*;

public class TestUser {

    User Rwasa, Fanny, Andrea;

    @Before
    public void setUp(){
        fury = new User();
        fury.setName("Rwasa");
        fury.setSurname("Fanny");
        fury.setStudentNumber(217035019);

        //equal to fury
        gypsy = new User();
        gypsy.setName("Rwasa");
        gypsy.setSurname("Fanny");
        gypsy.setStudentNumber(217035019);

        //Identical Objects
        tyson = fury;
    }

    @After
    public void tearDown(){

    }

    @Test
    public void testEquality(){
        System.out.println(fanny.hashCode());
        System.out.println(rwasa.hashCode());

        Assert.assertSame(rwasa, fanny);
    }       //end testEquality()


    @Test
    public void testIdentity(){
        System.out.println(fanny.toString());
        System.out.println(rwasa.toString());

        Assert.assertTrue(andrea == rwasa);
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
