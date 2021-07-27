package Transportation;

public class Driving implements Transportation{


    @Override
    public void checkIfBudgetFits(double budget) {
        if(budget>= 500){
            System.out.println("Driving");
        }
    }
}
