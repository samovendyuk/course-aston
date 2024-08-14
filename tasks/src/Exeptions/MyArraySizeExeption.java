package Exeptions;

public class MyArraySizeExeption extends Exception {
    private  int size;

    public MyArraySizeExeption(int size) {
        this.size = this.size;
    }

    public String checkMatrix(int size) {
        if (size > 4 || size < 4) {
            System.out.println(getMessage());
        }
        return null;
    }

    public String getMessage () {
        return "Matrix can't be more then 4 or less then 4";
    }
}
