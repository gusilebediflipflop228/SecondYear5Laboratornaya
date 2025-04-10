import classes.UpTriangleMatrix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UpTriangleMatrixTest {
    UpTriangleMatrix utm1 = new UpTriangleMatrix(3);
    UpTriangleMatrix utm2 = new UpTriangleMatrix(3);

    @Before
    public void setUp() throws Exception{
        utm1.setArray( new double[]{
                1,2,3,
                0,4,5,
                0,0,6
        });
        utm2.setArray(new double []{
                1,2,3,
                0,4,5,
                0,0,6
        });

    }

    @Test
    public void getElem()
    {
        Assert.assertEquals(0,utm1.getElem(1,0),0.001);
    }

    @Test
    public void setElem()
    {
        utm1.setElem(0,0,0);
        Assert.assertEquals(0,utm1.getElem(0,0),0.001);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIdexOutOfBounds()
    {
        utm1.setElem(3,1,1);
    }

    @Test
    public void getDeterminant()
    {
        Assert.assertEquals(24,utm2.getDeterminant(),0.001);
    }

    @Test
    public void getSize()
    {
        Assert.assertEquals(3,utm1.getSize(),0.001);
    }
}
