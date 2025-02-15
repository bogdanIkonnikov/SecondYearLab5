package classes;

import interfaces.IMatrix;

import java.util.Arrays;
import java.util.Objects;

public class Matrix implements IMatrix {
    private final int size;
    double[] matrix;

    public Matrix(int size) {
        this.size = size;
        matrix = new double[size * size];
    }

    public Matrix(double[] matrix) {
        this.matrix = matrix;
        size = (int) Math.round(Math.sqrt(matrix.length));
    }

    @Override
    public double getElement(int row, int col) {
        return matrix[row * size + col];
    }

    @Override
    public void setElement(int row, int col, double value) {
        matrix[row * size + col] = value;
    }

    private void swap(int row1, int row2) {
        double buffer;
        for (int col = 0; col < size; col++) {
            buffer = matrix[row1 * size + col];
            matrix[row1 * size + col] = matrix[row2 * size + col];
            matrix[row2 * size + col] = buffer;
        }
    }

    @Override
    public double getDeterminant() {
        double fixed, determinant = 1;
        for (int i = 0; i < size-1; i++) { //номер зануляемого столбца
            for (int row = 1; row < size; row++) { //строка к которой прибавляем
                i = row - 1;
                if (matrix[i * size + i] == 0) {
                    int j = i;
                    while (matrix[j * size + i] == 0) {
                        j++;
                        if (matrix[j * size + i] != 0) {
                            swap(i, j);
                            break;
                        }
                    }
                }
                for (int row1 = row; row1 < size; row1++) {
                    fixed = matrix[row1 * size + i] / matrix[i * size + i]; //множитель для элементов строки с элементом
                    for (int col = i; col < size; col++) { //элемент строки к которому прибавляем
                        matrix[row1 * size + col] -= matrix[(row-1) * size + col] * fixed; //вычитаем из каждого
                    }
                }
            }
        }
        for (int i = 0; i < size; i++) {
            determinant *= matrix[i * size + i];
        }
        return determinant;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix1 = (Matrix) o;
        return size == matrix1.size && Objects.deepEquals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, Arrays.hashCode(matrix));
    }
}
