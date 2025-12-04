class Calculator {

    //write functions for addition, subtraction, multiplication, diviision, etc
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
    return a - b;
    }

    int multiply(int a, int b) {
    return a * b;
    }

   int divide(int a , int b) {
    return a / b;
    }

    int modulo(int a, int b) {
        return a % b;
    }


}


public class Math1 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.add(6, 7));
        System.out.println(calc.subtract(13, 7));
        System.out.println(calc.subtract(13, 6));
        System.out.println(calc.multiply(6, 7));
        System.out.println(calc.divide(42, 7));
        System.out.println(calc.divide(42, 6));
        System.out.println(calc.modulo(10, 4));
    }
}
