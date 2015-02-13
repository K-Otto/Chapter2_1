package ac.za.cput.karl;

import org.junit.*;

import java.util.ArrayList;

/**
 * Created by student on 2015/02/13.
 */
public class AppTest {

    FloatApp fo = new FloatApp();
    IntegerApp ia =new IntegerApp();
    Object_IdentityApp oi = new Object_IdentityApp();
    Object_EqualityApp oe = new Object_EqualityApp();
    BoolApp ba = new BoolApp();
    FalseApp fa = new FalseApp();
    NullnessApp na = new NullnessApp();
    NotNullApp nna = new NotNullApp();
    TimeApp ta = new TimeApp();
    ArrayApp aa = new ArrayApp();


    @Before
    public void setUp() throws Exception {


    }
    @Test
    public void floatTest() throws Exception {
        Assert.assertEquals("Its not a float", 8.8f, FloatApp.main(),2);


    }
    @Test
    public void intTest() throws Exception {

        Assert.assertEquals(IntegerApp.main(), 2);

    }

        @Test
    public void objectIdentityTest() throws Exception {
        Assert.assertSame("Object equality test failed", oi.obj1, oi.obj1);


    }


    @Test
    public void objectEqualityTest() throws Exception {
        Assert.assertEquals("Object equality test failed", oe.string1, oe.string2 );

    }

    @Test
    public void boolTrueTest() throws Exception {
        Assert.assertTrue("Bool is not true", BoolApp.main());

    }
    @Test
    public void boolFalseTest() throws Exception {
        Assert.assertFalse("Bool is not false", FalseApp.main());

    }

    @Test
    public void nullnessAppTest() throws Exception {
        Assert.assertNull("Object is not null", NullnessApp.main());
    }

    @Test
    public void notNullAppTest() throws Exception {
        Assert.assertNotNull("Object is null", NotNullApp.main());
    }


    @Ignore
    @Test
    public void failTest() throws Exception {
        Assert.fail("Failed");
    }
    @Test(expected=IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException() {
        ArrayList emptyList = new ArrayList();
        Object o = emptyList.get(0);
    }
    @Test(timeout=100)
    public void testTimeOut()throws Exception {
        ta.tme();

    }

    @Ignore
    public void ignoreTest() throws Exception {
        System.out.println("I am ignored");
    }
    @Test
    public void arrayContentTest() throws Exception {
        Assert.assertArrayEquals(aa.Array1, aa.Array2);

    }




    @After
    public void tearDown() throws Exception {


    }
}
