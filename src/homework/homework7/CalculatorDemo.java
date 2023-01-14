package homework.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        double c = myCalculator.plus(10, 4.5);
        System.out.println("plus: " + c);
        double m = myCalculator.minus(10, 2.7);
        System.out.println("minus: " + m);
        double k = myCalculator.multiply(25, 37.7);
        System.out.println("multiply: " + k);
        double d = myCalculator.divide(7, 0);
        System.out.println(d);
    }


}

