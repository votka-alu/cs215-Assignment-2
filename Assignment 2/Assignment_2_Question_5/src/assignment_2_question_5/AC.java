package assignment_2_question_5;


public class AC extends Electronic{
    private double cost = 5.5;

    public AC(String name, double hours) {
        super(name, hours);
    }

    @Override
    public double expenditure() {
        return hours*cost;
    }
    
}
