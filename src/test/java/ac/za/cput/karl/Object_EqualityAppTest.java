package ac.za.cput.karl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


/**
 * Created by student on 2015/02/12.
 */
public class Object_EqualityAppTest {


    Object_EqualityApp oe = new Object_EqualityApp();

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void objectEqualityTest() throws Exception {
        Assert.assertEquals("Object equality test failed", oe.string1, oe.string2 );

    }

    @After
    public void tearDown() throws Exception {


    }
}
