package classes;

public class UpTriangleMatrix extends Matrix {

    public UpTriangleMatrix(int size) {
        super(size);
    }

    @Override
    public double getElem(int i, int j) {
        return super.getElem(i, j);
    }

    @Override
    public void setElem(int i, int j, double newElement) {
        if (j >= i) {
            super.setElem(i, j, newElement);
        } else {
            throw new IndexOutOfBoundsException("You are trying to set an element below the main diagonal");
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
