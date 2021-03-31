package com.adp2.submissions;

import org.junit.*;

public class TestUser {

    User fanny, rwasa, andrea;

    @Before
    public void setUp(){
        fanny = new User();
        fanny.setName("Rwasa");
        fanny.setSurname("Fanny");
        fanny.setStudentNumber(217035019);

        //equal to fury
        andrea = new User();
        andrea.setName("Rwasa");
        andrea.setSurname("Fanny");
        andrea.setStudentNumber(217035019);

        //Identical Objects
        rwasa = fanny;
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
        System.out.println(fury.toString());
        System.out.println(gypsy.toString());

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
