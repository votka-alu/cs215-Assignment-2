package assignment_2_question_6;


public class Rectangle extends GeometricObject implements ExceptionInterface{
    private double width;
    private double height;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(double width, double height)throws Exception{
        
        if (width < 0 || height < 0) {
            throw new Exception("Height / Width can not be negative.");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    
    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.height+this.width);
    }
    
    
}
