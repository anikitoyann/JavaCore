package homeworks.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println("plus: "+ myCalculator.plus(10, 4.5));
        System.out.println("minus: "+myCalculator.minus(10, 2.7));
        System.out.println("multiply: "+myCalculator.multiply(25, 37.7));
        System.out.println("divide: "+myCalculator.divide(7, 0));
    }


}

