package Comparator;
import classes.Matrix;

import java.util.Comparator;

public class MatrixDeterminantComparator implements Comparator<Matrix> {

    @Override
    public int compare(Matrix matrix1, Matrix matrix2) {
        double det1 = matrix1.getDeterminant();
        double det2 = matrix2.getDeterminant();

        return Double.compare(det1, det2);
    }

}
