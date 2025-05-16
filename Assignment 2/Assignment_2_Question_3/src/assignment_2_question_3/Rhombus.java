package assignment_2_question_3;


public class Rhombus implements Quadrilateral{
    private double diagonal1;
    private double diagonal2;
    private double side;

    public Rhombus(double diagonal1, double diagonal2, double side) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.side = side;
    }
    
    @Override
    public double area() {
        return (this.diagonal1*this.diagonal2/2);
    }

    @Override
    public double perimeter() {
        return 4*this.side;
    }    
}
