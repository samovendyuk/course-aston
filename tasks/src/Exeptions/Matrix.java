package Exeptions;

public class Matrix {
    private int size;

    public Matrix(int size) {
        this.size = size;
    }

    public void createMatrix () throws MyArrayDataException, MyArraySizeExeption {
        int min = 1;
        int max = 10;
        int count = 0;
        int rage = max - min + 1;
        int array [][] = new int[size][size];
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array.length - 1; j++) {
                array[i][j] = (int) (Math.random() * rage) + min;
                try {
                    if (size > 4 || size < 4) throw new MyArraySizeExeption(size);
                    count += Integer.parseInt(String.valueOf(array[i][j]));
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }



        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Summary items in array: " + count);
    }
}
