package classes;

import Comparators.MatrixComparator;

import java.util.Arrays;

public class MatrixService {
    public static void arrangeMatrices(Matrix[] matrices) {
        Arrays.sort(matrices, new MatrixComparator());
    }
}
