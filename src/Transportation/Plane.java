package Transportation;

public class Plane implements Transportation{

    @Override
    public void checkIfBudgetFits(double budget) {
        if(budget>=1000){
            System.out.println("Plane");
        }
    }
}
