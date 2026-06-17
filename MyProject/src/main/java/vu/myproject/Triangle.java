
package vu.myproject;


public class Triangle extends Shape {
    //public class Triangle extends Shape {
    private double s1, s2, s3;

    public Triangle(String color, boolean filled, double s1, double s2, double s3) {
        super(color, filled);
        if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
            throw new InvalidShapeException("Sides must be positive.");
        }
        // Triangle Inequality Theorem Validation
        if ((s1 + s2 <= s3) || (s1 + s3 <= s2) || (s2 + s3 <= s1)) {
            throw new InvalidShapeException("Violates triangle inequality theorem.");
        }
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }

    @Override public double getPerimeter() { return s1 + s2 + s3; }

    @Override
    public void resize(double factor) {
        if (factor <= 0) throw new InvalidShapeException("Resize factor must be positive.");
        this.s1 *= factor;
        this.s2 *= factor;
        this.s3 *= factor;
    }

    @Override
    public String toString() {
        return String.format("Triangle[%s, sides=%.2f, %.2f, %.2f]", super.toString(), s1, s2, s3);
    }
}

    

