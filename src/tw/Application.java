package tw;

import java.util.ArrayList;

/**
 * Created by arshisa on 7/6/18.
 */
public class Application {
    public ArrayList<Hotel> hotels = new ArrayList<>();
    public Application(){
        Hotel lakewood = new Hotel("lakewood",3, new Price(110,100,100,90));
        Hotel Ridgewood = new Hotel("Ridgewood",2,new Price(120,105,110,95));
        Hotel Bridgewood = new Hotel("Bridgewood",4,new Price(130,90,90,80));
        Hotel Dummywood = new Hotel("Dummywood",3,new Price(130,90,90,80));

        hotels.add(lakewood);
        hotels.add(Ridgewood);
        hotels.add(Bridgewood);
        hotels.add(Dummywood);
    }

    public static void main(String[] args) {
        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(new Date(18,"MAY",2011,"WEDNESDAY"));
        dateList.add(new Date(19,"MAY",2011,"THURSDAY"));
        dateList.add(new Date(21,"MAY",2011,"SATURDAY"));

        Input input = new Input("REGULAR",dateList);
        Application app = new Application();
        Hotel hotel = new Hotel();
        System.out.println(hotel.getCheapestHotel(input, app.hotels).toString());
    }
}
