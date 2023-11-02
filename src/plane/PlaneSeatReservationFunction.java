package plane;

import java.util.ArrayList;
import java.util.Collections;

public class PlaneSeatReservationFunction {

    public static ArrayList<Integer> randomNumForFirstClassSeats() {
        ArrayList<Integer> firstClassSeats = new ArrayList<>();
        for (int index = 0; index < 5; index++) {
            firstClassSeats.add(index);
        }
        Collections.shuffle(firstClassSeats);
        return firstClassSeats;
    }

    public static ArrayList<Integer> randomNumForEconomyClassSeats() {
        ArrayList<Integer> economyClassSeats = new ArrayList<>();
        for (int index = 5; index < 10; index++) {
            economyClassSeats.add(index);
        }
        Collections.shuffle(economyClassSeats);
        return economyClassSeats;
    }

    public static void print(String input) {
        System.out.println(input);
    }

}
