package ac.za.cput.karl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
/**
 * Created by student on 2015/02/12.
 */
public class FloatAppTest {
    FloatApp obj = new FloatApp();
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals("Its not a float", 8.8f, obj.main(),2);


    }

    @After
    public void tearDown() throws Exception {


    }
}
