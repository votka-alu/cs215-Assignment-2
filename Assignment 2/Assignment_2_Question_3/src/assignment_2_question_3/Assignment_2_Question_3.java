package assignment_2_question_3;

import java.util.Scanner;


public class Assignment_2_Question_3 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter length of Rectangle:");
        double length1 = s.nextDouble();
        
        System.out.println("Enter width of Rectangle:");
        double width1 = s.nextDouble();
        
        Rectangle rec = new Rectangle(length1,width1);
        
        System.out.println("");
        
        System.out.println("Enter diagonal1 of rhombus:");
        double diagonal1 = s.nextDouble();
        
        System.out.println("Enter diagonal2 of rhombus:");
        double diagonal2 = s.nextDouble();
        
        System.out.println("Enter side of rhombus:");
        double side = s.nextDouble();
        
        Rhombus rhombus = new Rhombus(diagonal1,diagonal2,side);
        
        System.out.println("Area of Rectangle: " + rec.area());
        System.out.println("Perimeter of Rectangle: " + rec.perimeter());
        
        System.out.println("");

        System.out.println("Area of Rhombus: " + rhombus.area());
        System.out.println("Perimeter of Rhombus: " + rhombus.perimeter());
        
        System.out.println("");
        
        if (rec.area() == rhombus.area()) {
            System.out.println("The areas of Rectangle and Rhombus are equal.");
        } else {
            System.out.println("The areas of Rectangle and Rhombus are not equal.");
        }
    }
    
}
