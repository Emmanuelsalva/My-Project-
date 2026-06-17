
package vu.myproject;

public class Circle extends Shape {
    //public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        if (radius <= 0) {
            throw new InvalidShapeException("Radius must be positive.");
        }
        this.radius = radius;
    }

    @Override public double getArea() { return Math.PI * radius * radius; }
    @Override public double getPerimeter() { return 2 * Math.PI * radius; }

    @Override
    public void resize(double factor) {
        if (factor <= 0) throw new InvalidShapeException("Resize factor must be positive.");
        this.radius *= factor;
    }

    @Override
    public String toString() {
        return String.format("Circle[%s, radius=%.2f]", super.toString(), radius);
    }
}

    

