package assignment_2_question_6;

import java.util.Date;


public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject() {
        this.color = "red";
        this.filled = false;
        this.dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new java.util.Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" + "color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + '}';
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
}
