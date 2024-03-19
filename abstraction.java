
abstract class Shapes {
    abstract double area();
}

class Circle extends Shapes {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI * r * r;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Shapes circle = new Circle(5.0);
        System.out.println("Area of circle: " + circle.area());
    }
}

Using Interface:

interface Shapes {
    double area();
}

class Circle implements Shapes {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}

public class AbstractionInterfaceExample {
    public static void main(String[] args) {
        Shapes circle = new Circle(5.0);
        System.out.println("Area of circle is: " + circle.area());
    }
}
