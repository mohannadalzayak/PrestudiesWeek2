package oop;

public class Calculator {

    private int result;
    public Calculator() {
        result = 0;
    }
    public int  getResult(){
        return result;
    }

    void plus(int a) {
        result = a + result;
    }
    void minus(int a) {
        result = a - result;
    }
    void multiply(int a) {
        result = a * result;
    }
    void divide(int a) {
        result = result / a;
    }

}
