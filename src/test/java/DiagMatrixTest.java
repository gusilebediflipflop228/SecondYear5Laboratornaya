import classes.DiagMatrix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiagMatrixTest {
    DiagMatrix dMtr1 = new DiagMatrix(3);
    DiagMatrix dMtr2 = new DiagMatrix(3);


    @Before
    public void setUp() throws Exception
    {
        dMtr1.setArray(new double []{
                1,0,0,
                0,2,0,
                0,0,3
        });

        dMtr2.setArray(new double []{
                1,0,0,
                0,2,0,
                0,0,3
        });

    }

    @Test
    public void getElem()
    {
        Assert.assertEquals(1, dMtr1.getElem(0,0),0.001);
    }

    @Test
    public void setElem()
    {
        dMtr1.setElem(0,0,2);
        Assert.assertEquals(2, dMtr1.getElem(0,0),0.001);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBound()
    {
        dMtr1.setElem(0,1,1);
    }

    @Test
    public void getDeterminant()
    {
        Assert.assertEquals(6, dMtr2.getDeterminant(),0.001);
    }

}
