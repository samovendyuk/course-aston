package Exeptions;

import java.util.Random;

public class Main {
    public static void main(String[] args)  {
        Matrix matrix = new Matrix(3);
        try {

            matrix.createMatrix();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
