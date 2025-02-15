package classes;

public class UpTriangleMatrix extends Matrix {
    public UpTriangleMatrix(int size) {
        super(size);
    }

    @Override
    public double getElement(int row, int col) {
        return super.getElement(row, col);
    }

    @Override
    public void setElement(int row, int col, double value) {
        if (col >= row) {
            super.setElement(row, col, value);
        }
        else
        {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public double getDeterminant() {
        return super.getDeterminant();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
