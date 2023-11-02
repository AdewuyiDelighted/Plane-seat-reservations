package plane;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlaneSeatReservationFunctionTest {
    @Test
    public void testThatFunctionCanGenerateNumberBetween0And4() {
        int actualNumb = 0;
        ArrayList<Integer> index = PlaneSeatReservationFunction.randomNumForFirstClassSeats();
        for (Integer integer : index) {
            actualNumb = integer;

            boolean isNumberIsBtw0To4 = actualNumb >= 0 && actualNumb <= 4;
            assertTrue(isNumberIsBtw0To4);
        }
    }
    @Test
    public void testThatFunctionCanGenerateNumberBetween5And9(){
        int actualNumb = 0;
        ArrayList<Integer> index = PlaneSeatReservationFunction.randomNumForEconomyClassSeats();
        for (Integer integer : index) {
            actualNumb = integer;

            boolean isNumberBtw5To9 = actualNumb >= 5 && actualNumb <= 9;
            assertTrue(isNumberBtw5To9);
        }
    }

}