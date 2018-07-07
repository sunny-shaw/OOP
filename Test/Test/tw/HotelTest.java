package Test.tw;
import tw.*;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by arshisa on 7/6/18.
 */
public class HotelTest {

    @Test
    public void cheapestHotelTestWithNoTieInTotalAmount(){
        ArrayList<DaysOfWeek> daysOfWeeks = new ArrayList<>();
        daysOfWeeks.add(DaysOfWeek.WEDNESDAY);
        daysOfWeeks.add(DaysOfWeek.THURSDAY);
        daysOfWeeks.add(DaysOfWeek.SATURDAY);

        Input input = new Input("REGULAR",daysOfWeeks);
        Application app = new Application();
        Output output = new Output("lakewood",3.0,320);
        assertEquals(true,output.equals(app.getCheapestHotel(input, app.hotels)));
    }

    @Test
    public void cheapestHotelTestWithTieInTotalAmount(){
        ArrayList<DaysOfWeek> daysOfWeeks = new ArrayList<>();
        daysOfWeeks.add(DaysOfWeek.THURSDAY);
        daysOfWeeks.add(DaysOfWeek.FRIDAY);
        daysOfWeeks.add(DaysOfWeek.SATURDAY);
        daysOfWeeks.add(DaysOfWeek.SUNDAY);

        Input input = new Input("REWARD",daysOfWeeks);
        Application app = new Application();
        Output output = new Output("Bridgewood",4.0,340);
        assertEquals(true, output.equals(app.getCheapestHotel(input, app.hotels)));
    }

}
