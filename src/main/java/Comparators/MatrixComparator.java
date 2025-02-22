package Comparators;
import classes.Matrix;

import java.util.Comparator;

public class MatrixComparator implements Comparator<Matrix> {
    @Override
    public int compare(Matrix o1, Matrix o2) {
        double det1 = o1.getDeterminant();
        double det2 = o2.getDeterminant();

        return Double.compare(det1, det2);
    }
}
