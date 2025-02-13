package interfaces;

public interface IMatrix {
    public double getElement(int row, int col);
    public void setElement(int row, int col, double value);
    public double getDeterminant();
}
