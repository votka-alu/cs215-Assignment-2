package assignment_2_question_6;

import java.util.Scanner;


public class Assignment_2_Question_6 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Width of the Rectangle:");
        double width = s.nextDouble();
        
        System.out.println("Enter Width of the Rectangle:");
        double height = s.nextDouble();
        
        try{
            GeometricObject r1 = new Rectangle(width,height);
           
            
            System.out.println("Area of rectangle1: " + r1.getArea());
            System.out.println("Perimeter of rectangle1: " + r1.getPerimeter());
            System.out.println("toString"+r1.toString());
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
