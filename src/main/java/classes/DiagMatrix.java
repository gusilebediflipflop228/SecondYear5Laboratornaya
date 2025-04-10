package classes;

public class DiagMatrix extends Matrix {

    public DiagMatrix(int size) {
        super(size);
    }

    @Override
    public double getElem(int i, int j) {
        return super.getElem(i, j);
    }

    @Override
    public void setElem(int i, int j, double newElement) {
        if (i == j)
        {
            super.setElem(i, j, newElement);
        }
        else {
            throw new IndexOutOfBoundsException("You are trying to set an element up or down the main diagonal");
        }
    }

    @Override
    public void setArray(double[] array) {
        super.setArray(array);
    }

    @Override
    public double getDeterminant() {
        return super.getDeterminant();
    }

    @Override
    public int getSize() {
        return super.getSize();
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
