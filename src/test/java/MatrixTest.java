import classes.Matrix;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MatrixTest {
    @Test
    void testGetDeterminant2x2() {
        double[] data = {
                1, 0,
                3, 2
        };

        Matrix matrix = new Matrix(data);
        assertEquals(2, matrix.getDeterminant(), 0.0001);
    }
    @Test
    void testSetElement() {
        Matrix matrix = new Matrix(3);
        matrix.setElement(2,1, 2);
        assertEquals(2, matrix.getElement(2,1));
    }
    @Test
    void testGetDeterminant4x4() {
        double[] data = {
                1, 0, 2, -1,
                3, 0, 0, 5,
                2, 1, 4, -3,
                1, 0, 5, 0
        };
        Matrix matrix = new Matrix(data);
        assertEquals(-30, matrix.getDeterminant(), 0.0001);
    }
    @Test
    void testGetDeterminant3x3() {
        double[] data = {
                1, 0, 2,
                -1, 3, 0,
                0, 5, 2
        };
        Matrix matrix = new Matrix(data);
        assertEquals(-4, matrix.getDeterminant(), 0.0001);
    }



}
