package ac.za.cput.karl;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



/**
 * Created by student on 2015/02/12.
 */
public class ObjectIdentityTest
{
    Object_IdentityApp oi = new Object_IdentityApp();


    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void objectIdentityTest() throws Exception {
        Assert.assertSame("Object equality test failed", oi.obj1, oi.obj1);


    }

    @After
    public void tearDown() throws Exception {


    }
}
