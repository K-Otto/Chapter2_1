package ac.za.cput.karl;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class BoolAppTest {
    BoolApp ba = new BoolApp();
    FalseApp fa = new FalseApp();

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void boolTrueTest() throws Exception {
        Assert.assertTrue("Bool is not true", ba.main());

    }
    @Test
    public void boolFalseTest() throws Exception {
        Assert.assertFalse("Bool is not false", fa.main());

    }

    @After
    public void tearDown() throws Exception {


    }
}
