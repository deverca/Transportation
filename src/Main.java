import Transportation.Bus;
import Transportation.Driving;
import Transportation.Plane;
import Transportation.Train;

public class Main {
    public static void main(String[] args) {
        Driving driving = new Driving();
        Plane plane = new Plane();
        Bus bus = new Bus();
        Train train = new Train();
        double budget = 500;
        System.out.println("With the budget of " + budget + ",you can choose this/these vehicles to get to Beijing from Wuhan");
        driving.checkIfBudgetFits(budget);
        plane.checkIfBudgetFits(budget);
        bus.checkIfBudgetFits(budget);
        train.checkIfBudgetFits(budget);

    }

}
