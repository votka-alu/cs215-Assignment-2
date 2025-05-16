package assignment_2_question_2;

import java.util.Scanner;


public class Assignment_2_Question_2 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle1 :");
        double length1 = s.nextDouble();

        System.out.println("Enter the width of the rectangle1 :");
        double width1 = s.nextDouble();
        
        Rectangle r1 = new Rectangle(length1,width1);
        
        System.out.println("");

        System.out.println("Enter the length of the rectangle2 :");
        double length2 = s.nextDouble();

        System.out.println("Enter the width of the rectangle2 :");
        double width2 = s.nextDouble();
        Rectangle r2 = new Rectangle(length2,width2);
        
        
        System.out.println("Area of rectangel1 :"+r1.area());
        System.out.println("Perimeter of rectangel1 :"+r1.perimeter());
        if (r1.SquareCheck()) {
            System.out.println("The rectangle is a square");
        } else {
            System.out.println("The rectangle is not a square");
        }
        
        System.out.println("");
        
        System.out.println("Area of rectangel2 :"+r2.area());
        System.out.println("Perimeter of rectangel2 :"+r2.perimeter());
        if (r2.SquareCheck()) {
            System.out.println("The rectangle is a square");
        } else {
            System.out.println("The rectangle is not a square");
        }
    }
    
}
