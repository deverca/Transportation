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
        System.out.println("From Wuhan to Beijing you can choose from 4 means of transportation, including driving a car, taking bus, train, or plane.\n " +
                "Driving costs 500 yuan, bus 300 yuan, train 400 yuan, and plane 1000 yuan.\n" +
                " With the budget of 500 yuan, which vehicles Xiaoming can choose to get there?\nAnswers:");
        driving.checkIfBudgetFits(budget);
        plane.checkIfBudgetFits(budget);
        bus.checkIfBudgetFits(budget);
        train.checkIfBudgetFits(budget);

    }

}
