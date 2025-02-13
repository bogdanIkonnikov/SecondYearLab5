package classes;

import interfaces.IMatrix;

public class MatrixDefault implements IMatrix {
    int size;
    private double[][] matrix;
    public MatrixDefault(int size) {
        this.size = size;
        matrix = new double[size][size];
    }

    public MatrixDefault(double[][] matrix) {
        this.matrix = matrix;
        size = matrix.length;
    }

    @Override
    public double getElement(int row, int col) {
        return matrix[row][col];
    }

    @Override
    public void setElement(int row, int col, double value) {
        matrix[row][col] = value;
    }

    private void swap(int row1, int row2) {
        double buffer;
        for (int col = 0; col < size; col++) {
            buffer = matrix[row1][col];
            matrix[row1][col] = matrix[row2][col];
            matrix[row2][col] = buffer;
        }
    }

    @Override
    public double getDeterminant() {
        double fixed, determinant = 1;
        for (int i = 0; i < size-1; i++) { //номер зануляемого столбца
            for (int row = 1; row < size; row++) { //строка к которой прибавляем
                i = row - 1;
                if (matrix[i][i] == 0) {
                    int j = i;
                    while (matrix[j][i] == 0) {
                        j++;
                        if (matrix[j][i] != 0) {
                            swap(i, j);
                            break;
                        }
                    }
                }
                for (int row1 = row; row1 < size; row1++) {
                    fixed = matrix[row1][i] / matrix[i][i]; //множитель для элементов строки с элементом
                    for (int col = i; col < size; col++) { //элемент строки к которому прибавляем
                        matrix[row1][col] -= matrix[row-1][col] * fixed; //вычитаем из каждого
                    }
                }
            }
        }
        for (int i = 0; i < size; i++) {
            determinant *= matrix[i][i];
        }
        return determinant;
    }
}
