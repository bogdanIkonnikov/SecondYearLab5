package interfaces;

public interface IMatrix {
    double getElement(int row, int col);
    void setElement(int row, int col, double value);
    double getDeterminant();
}
