
package vu.myproject;

public class Rectangle extends Shape {
   // public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        if (width <= 0 || height <= 0) {
            throw new InvalidShapeException("Width and height must be positive.");
        }
        this.width = width;
        this.height = height;
    }

    @Override public double getArea() { return width * height; }
    @Override public double getPerimeter() { return 2 * (width + height); }

    @Override
    public void resize(double factor) {
        if (factor <= 0) throw new InvalidShapeException("Resize factor must be positive.");
        this.width *= factor;
        this.height *= factor;
    }

    @Override
    public String toString() {
        return String.format("Rectangle[%s, width=%.2f, height=%.2f]", super.toString(), width, height);
    }
}

    

