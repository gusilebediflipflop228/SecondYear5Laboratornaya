package classes;

import Comparator.MatrixDeterminantComparator;
import java.util.Arrays;

public class MatrixService {
    public static void arrangeMatrices(Matrix[] matrices) {
        Arrays.sort(matrices, new MatrixDeterminantComparator());
    }
}
