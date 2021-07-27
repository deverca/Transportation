package Transportation;

public class Train implements Transportation{
    @Override
    public void checkIfBudgetFits(double budget) {
        if(budget>=400){
            System.out.println("Train");
        }
    }
}
