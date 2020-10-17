package classes_objects;

public class mathLibrary {

    public int addNum (int num1, int num2) {
        return num1 + num2;
    }

    public int subNum (int num1, int num2) {
        return num1 - num2;
    }

    public int multipleNum (int num1, int num2) {
        return num1 * num2;
    }

    public double divideNum (int num1, int num2) {
        double result = 0.00;
        if (num2 != 0) {
            result = (num1 * 1.0) / num2;
        }return result;
    }

}
