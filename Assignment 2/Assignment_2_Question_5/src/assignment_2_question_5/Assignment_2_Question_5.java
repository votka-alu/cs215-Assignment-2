package assignment_2_question_5;

import java.util.Scanner;


public class Assignment_2_Question_5 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter hour for Light:");
        int Lhr = s.nextInt();
        
        System.out.println("Enter hour for Ac:");
        int Ahr = s.nextInt();
        
        Light l = new Light("Light", Lhr);
        AC a = new AC("AC", Ahr);
        
        double TotalCost = l.expenditure()+a.expenditure();
                        
        System.out.println("The total cost will be TK "+TotalCost);
    }
    
}
