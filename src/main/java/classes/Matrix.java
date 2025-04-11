package classes;

import interfaces.IMatrix;

import java.util.Arrays;
import java.util.Objects;

public class Matrix implements IMatrix {
    private final int size;
    private double[] simplearr;

    private boolean actualDeterminant = false;
    private double Determinant = 0;

    public Matrix(int size) {// конструктор при условии, что положительной размерность массива
        this.size = size;
        if (size > 0) {
            this.simplearr = new double[size * size];
        } else throw new IllegalArgumentException();
    }

    public void setArray(double[] array) {
        simplearr = array;
    }

    @Override
    public double getElem(int i, int j) {
        if (i >= 0 && i < size && j >= 0 && j < size) {
            return simplearr[i * size + j];
        } else throw new IllegalArgumentException();

    }

    @Override
    public void setElem(int i, int j, double newElement) {
        if (i >= 0 && i < size && j >= 0 && j < size) {
            simplearr[i * size + j] = newElement;
            actualDeterminant = false;
        }
    }


    static void swap(double arr[], int size, int i1, int i2, int j1, int j2) {
        double bufer = arr[i1 * size + j1];
        arr[i1 * size + j1] = arr[i2 * size + j2];
        arr[i2 * size + j2] = bufer;
    }

    public int getSize() {
        return size;
    }

    @Override
    public double getDeterminant() {
        if (!actualDeterminant) {
            actualDeterminant = true;
            Determinant = 1;
            int index;
            double[] copy = Arrays.copyOf(simplearr, size * size);
            double coef = 0;
            for (int i = 0; i < size - 1; i++) {
                index = i;
                while (index < size && copy[index * size + i] == 0) {
                    index++;
                }
                if (index == size) {
                    actualDeterminant = false;
                    Determinant = 0;
                    return Determinant;
                }
                if (index != i) {
                    for (int a = 0; a < size; a++) {
                        swap(copy, size, index, a, i, a);
                    }
                    Determinant *= Math.pow(-1, index - 1);
                }
                for (int j =i + 1; j < size; j++) {
                    coef = copy[j * size + i] / copy[i * size + i];
                    for (int b = 0; b < size; b++) {
                        copy[j * size + b] -= copy[i * size + b] * coef;
                    }
                }
            }
            for (int i = 0; i < size; i++) {
                Determinant *= copy[i * size + i];
            }
            return Determinant;
        }
        return Determinant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return size == matrix.size && actualDeterminant == matrix.actualDeterminant && Double.compare(Determinant, matrix.Determinant) == 0 && Objects.deepEquals(simplearr, matrix.simplearr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, Arrays.hashCode(simplearr), actualDeterminant, Determinant);
    }
}
