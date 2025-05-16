package assignment_2_question_5;


public class Light extends Electronic{
    private double cost = 1.0;

    public Light(String name, double hours) {
        super(name, hours);
    }

    @Override
    public double expenditure() {
        return hours*cost;
    }
    
}
