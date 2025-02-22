import Comparators.MatrixComparator;
import classes.Matrix;
import classes.MatrixService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixComparatorTest {
    Matrix m1 = new Matrix(new double[]{1, 0, 3, 2});  // det = 2
    Matrix m2 = new Matrix(new double[]{5, 6, 7, 8});  // det = -2
    Matrix m3 = new Matrix(new double[]{9, 1, 2, 3});  // det = 25


    Matrix[] matrices = {m3, m2, m1};
    @Test
    public void testMatrixComparator1() {
        m1.calculateDeterminant();
        m2.calculateDeterminant();
        m3.calculateDeterminant();
        Assertions.assertEquals(25, matrices[0].getDeterminant());
        Assertions.assertEquals(-2, matrices[1].getDeterminant(), 0.001);
        Assertions.assertEquals(2, matrices[2].getDeterminant());
    }

    @Test
    public void testMatrixComparator2() {
        m1.calculateDeterminant();
        m2.calculateDeterminant();
        m3.calculateDeterminant();
        MatrixService.arrangeMatrices(matrices);
        Assertions.assertEquals(-2, matrices[0].getDeterminant(), 0.001);
        Assertions.assertEquals(2, matrices[1].getDeterminant());
        Assertions.assertEquals(25, matrices[2].getDeterminant());
    }
}
