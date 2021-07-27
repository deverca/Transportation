package Transportation;

public class Bus implements Transportation{
    @Override
    public void checkIfBudgetFits(double budget) {
        if(budget>=300){
            System.out.println("Bus");
        }
    }
}
