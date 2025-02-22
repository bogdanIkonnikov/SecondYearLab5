package classes;

public class DiagMatrix extends Matrix {
    public DiagMatrix(int size) {
        super(size);
    }

    public DiagMatrix(double[] elements) {
        super(elements.length);
        for (int i = 0; i < elements.length; i++) {
            super.setElement(i, i, elements[i]);
        }
    }

    @Override
    public double getElement(int row, int col) {
        return super.getElement(row, col);
    }

    @Override
    public void setElement(int row, int col, double value) {
        if (row != col) {
            throw new IllegalArgumentException("row does not match column");
        }
        super.setElement(row, col, value);
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
