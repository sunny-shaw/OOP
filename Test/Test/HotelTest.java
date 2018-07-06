package Test;
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
        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(new Date(18,"MAY",2011,"WEDNESDAY"));
        dateList.add(new Date(19,"MAY",2011,"THURSDAY"));
        dateList.add(new Date(21,"MAY",2011,"SATURDAY"));

        Input input = new Input("REGULAR",dateList);
        Application app = new Application();
        Hotel hotel = new Hotel();
        Output output = new Output("lakewood",3.0,320);
        assertEquals(true,output.equals(hotel.getCheapestHotel(input, app.hotels)));
    }

    @Test
    public void cheapestHotelTestWithTieInTotalAmount(){
        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(new Date(19,"MAY",2011,"THURSDAY"));
        dateList.add(new Date(20,"MAY",2011,"FRIDAY"));
        dateList.add(new Date(21,"MAY",2011,"SATURDAY"));
        dateList.add(new Date(22,"MAY",2011,"SUNDAY"));

        Input input = new Input("REWARD",dateList);
        Application app = new Application();
        Hotel hotel = new Hotel();
        Output output = new Output("Bridgewood",4.0,340);
        assertEquals(true, output.equals(hotel.getCheapestHotel(input, app.hotels)));
    }

}
