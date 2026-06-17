
package vu.myproject;


public class Main {
    //public class Main {
    public static void main(String[] args) {
        // Requirement (c): Catching exception with try-catch
        try {
            System.out.println("Attempting to create an invalid triangle...");
            Shape badTriangle = new Triangle("Red", true, 1, 2, 10);
        } catch (InvalidShapeException e) {
            System.out.println("Caught Expected Error: " + e.getMessage());
        }

        System.out.println();

        // Populate mixed polymorphic collection
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Blue", true, 5);          // Area ~78.54
        shapes[1] = new Rectangle("Green", false, 4, 6);   // Area = 24.00
        shapes[2] = new Triangle("Yellow", true, 3, 4, 5); // Area = 6.00

        System.out.println("--- Executing printAreas ---");
        printAreas(shapes);

        System.out.println("\n--- Executing largest ---");
        Shape biggest = largest(shapes);
        System.out.println("Largest Shape details: " + biggest);
    }

    // Requirement (d)
    public static void printAreas(Shape[] shapes) {
        for (Shape s : shapes) {
            System.out.println("Shape Area: " + s.getArea());
        }
    }

    // Requirement (d)
    public static Shape largest(Shape[] shapes) {
        if (shapes == null || shapes.length == 0) return null;
        Shape largest = shapes[0];
        for (Shape s : shapes) {
            if (s.getArea() > largest.getArea()) {
                largest = s;
            }
        }
        return largest;
    }
}

    

