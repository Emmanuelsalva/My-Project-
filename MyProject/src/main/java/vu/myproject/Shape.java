
package vu.myproject;


// Fix: Put the abstract keyword back here
public abstract class Shape {
    protected String color = "white";
    protected boolean filled;
 
    public Shape() { }
    
    public Shape(String color, boolean filled) { 
        this.color = color;
        this.filled = filled;
    }
 
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void resize(double factor); 
 
    @Override 
    public String toString() { 
        return String.format("Color: %s, Filled: %b", color, filled); 
    }
}




    

