package ac.za.cput.karl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
/**
 * Created by student on 2015/02/12.
 */
public class IntegerAppTest {
    IntegerApp ia =new IntegerApp();
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testName() throws Exception {

        Assert.assertEquals(ia.main(),2);


    }

    @After
    public void tearDown() throws Exception {


    }
}
