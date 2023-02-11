package chapter8;

class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("B области четырехугольника.");
        return dim1 * dim2;
    }
}

class Triangle extends Rectangle {

    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("B области треугольника.");
        return dim1 * dim2 / 2;
    }
}

