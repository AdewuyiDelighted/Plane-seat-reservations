package plane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static plane.PlaneSeatReservationFunction.*;

public class PlaneSeatReservationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] planeSeats = new boolean[10];

        ArrayList<Integer> firstClassSeat = randomNumForFirstClassSeats();
        ArrayList<Integer> economyClassSeat = randomNumForEconomyClassSeats();

        String reservationSeat = "YES";

        int firstClassCount = 0;
        int economyClassCount = 0;
        int classAnswer;


        while (reservationSeat.equals("YES")) {

            print("Please type 1 for first class and please type 2 for economy");
            classAnswer = scanner.nextInt();

            if (classAnswer == 1) {

                if (firstClassCount <= 4) {
                    int seatNumbers = firstClassSeat.get(firstClassCount);
                    planeSeats[seatNumbers] = true;
                    System.out.printf("%s%d%s%n", "Your seat number is ", seatNumbers + 1, " in First Class");
                    firstClassCount++;

                } else {
                    System.out.println("We are sorry all the seat in first class are already filled up,Enter YES' to move to economy class or enter NO to exit");
                    String firstClassAnswers = scanner.next().toUpperCase();

                    if (firstClassAnswers.equals("YES")) {
                        System.out.println("Enter 2 to book a economy class");
                        classAnswer = scanner.nextInt();
                    } else if (firstClassAnswers.equals("NO")) {
                        System.out.println("The next flight is taking off the next three hours");
                    }
                }
            }


            if (classAnswer == 2) {

                if (economyClassCount <= 4) {

                    int seatNumber = economyClassSeat.get(economyClassCount);
                    planeSeats[seatNumber] = true;
                    System.out.printf("%s%d%s%n", "Your seat number is ", seatNumber + 1, " in Economy Class");
                    economyClassCount++;

                } else {
                    print("We are sorry all the seat in first class are already filled up,Enter YES' to move to economy class or enter NO to exit");
                    String economyClassAnswer = scanner.next().toUpperCase();

                    if (economyClassAnswer.equals("YES")) {
                        print("Enter 1 to move to first class");
                        classAnswer = scanner.nextInt();
                    }

                    if (classAnswer == 1) {

                        if (firstClassCount <= 4) {
                            int seatNumbers = firstClassSeat.get(firstClassCount);
                            planeSeats[seatNumbers] = true;
                            System.out.printf("%s%d%s%n", "Your seat number is ", seatNumbers + 1, " in First Class");
                            firstClassCount++;
                        }
                    } else {
                        print("The next flight is the next three hours");
                    }
                }
            }


            if (firstClassCount > 4 && economyClassCount > 4) {
                print("We are sorry all have been assigned,The next flight is in next hours");
                print("Enter NO to stop application");

            } else {
                print("Enter YES to book more seat or NO to stop");
            }
            reservationSeat = scanner.next().toUpperCase();
        }
        print(Arrays.toString(planeSeats));
    }
}



