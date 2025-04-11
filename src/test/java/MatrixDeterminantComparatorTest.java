import classes.Matrix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatrixDeterminantComparatorTest {

    Matrix matrix1 = new Matrix(2);
    Matrix matrix2 = new Matrix(3);
    Matrix matrix3 = new Matrix(3);

    @Before
    public void setUp() {
        matrix1.setArray(new double []{7,6,7,6}); // det = 0
        matrix2.setArray(new double []{1,2,-1,0,3,4,-2,5,6}); // det = -24
        matrix3.setArray(new double []{2, 0, 0, 0, 5, 0, 0, 0, 1}); // det = 10
    }

    @Test
    public void testMatrixComparator1() {
        matrix1.getDeterminant();
        matrix2.getDeterminant();
        matrix3.getDeterminant();
        Assert.assertEquals(0, matrix1.getDeterminant());
        Assert.assertEquals(-24, matrix2.getDeterminant(), 0.001);
        Assert.assertEquals(10, matrix3.getDeterminant());
    }


}
