import classes.DiagMatrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class DiagMatrixTest {
    @Test
    void testSetElement() {
        double[] data = {
                1, 0,
                3, 2
        };
        DiagMatrix diagMatrix = new DiagMatrix(data);
        Assertions.assertThrows(IllegalArgumentException.class, () -> diagMatrix.setElement(1,3,5));
        diagMatrix.setElement(1,3,0);
        diagMatrix.setElement(2,2,2);
    }
}
