import classes.MatrixDefault;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MatrixDefaultTest {
    @Test
    void testGetDeterminant2x2() {
        double[][] data = {
                {1, 0},
                {3, 2}
        };
        MatrixDefault matrix = new MatrixDefault(data);
        assertEquals(2, matrix.getDeterminant(), 0.0001);
    }
    @Test
    void testGetDeterminant4x4() {
        double[][] data = {
                {1, 0, 2, -1},
                {3, 0, 0, 5},
                {2, 1, 4, -3},
                {1, 0, 5, 0}
        };
        MatrixDefault matrix = new MatrixDefault(data);
        assertEquals(-30, matrix.getDeterminant(), 0.0001);
    }


}
