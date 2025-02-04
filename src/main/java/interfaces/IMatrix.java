package interfaces;

public interface IMatrix {
    public int getElement(int row, int col);
    public void setElement(int row, int col, int value);
    public double getDeterminant();
}
