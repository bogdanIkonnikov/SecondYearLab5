import classes.DiagMatrix;
import classes.UpTriangleMatrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UpTriangleMatrixTest {
    @Test
    public void testSetElements() {
        UpTriangleMatrix upTriangleMatrix = new UpTriangleMatrix(3);
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> upTriangleMatrix.setElement(2,1,5));
        upTriangleMatrix.setElement(2,2,2);
        upTriangleMatrix.setElement(0,1,5);
        upTriangleMatrix.getElement(0,1);
    }
}
