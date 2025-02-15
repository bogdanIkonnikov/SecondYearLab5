package classes;

public class DiagMatrix extends Matrix {
    public DiagMatrix(int size) {
        super(size);
    }

    public DiagMatrix(double[] elements) {
        super(elements.length);
        for (int i = 0; i < elements.length; i++) {
            matrix[i*elements.length + i] = elements[i];
        }
    }

    @Override
    public double getElement(int row, int col) {
        return super.getElement(row, col);
    }

    @Override
    public void setElement(int row, int col, double value) {
        if (row == col) {
            super.setElement(row, col, value);
        }
        else {
            if (value == 0) {
                super.setElement(row, col, 0);
            }
            else {
                throw new IllegalArgumentException();
            }
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
