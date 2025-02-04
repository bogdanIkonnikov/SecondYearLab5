package classes;

import interfaces.IMatrix;

public class MatrixDefault implements IMatrix {
    int size;
    int[] matrix;
    public MatrixDefault(int size) {
        this.size = size;
        matrix = new int[size*size];
    }

    @Override
    public int getElement(int row, int col) {
        return matrix[(row-1)*size+col];
    }

    @Override
    public void setElement(int row, int col, int value) {
        matrix[(row-1)*size+col] = value;
    }

    @Override
    public double getDeterminant() {
        return 0;
    }
}
