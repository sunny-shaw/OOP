package tw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * Created by arshisa on 7/6/18.
 */
public class Application {
    public ArrayList<Hotel> hotels = new ArrayList<>();
    
    public Application(){
        Hotel lakewood = new Hotel("lakewood",3, new ArrayList<PricingStrategy>(Arrays.asList(new WeekdaysPriceForRegularCustomer(110), new WeekendsPriceForRegularCustomer(100), new WeekdaysPriceForRewardCustomer(100), new WeekendsPriceForRewardCustomer(90))));
        Hotel Ridgewood = new Hotel("Ridgewood",2,new ArrayList<PricingStrategy>(Arrays.asList(new WeekdaysPriceForRegularCustomer(120), new WeekendsPriceForRegularCustomer(105), new WeekdaysPriceForRewardCustomer(110), new WeekendsPriceForRewardCustomer(95))));
        Hotel Bridgewood = new Hotel("Bridgewood",4, new ArrayList<PricingStrategy>(Arrays.asList(new WeekdaysPriceForRegularCustomer(130), new WeekendsPriceForRegularCustomer(90), new WeekdaysPriceForRewardCustomer(90), new WeekendsPriceForRewardCustomer(80))));
        Hotel Dummywood = new Hotel("Dummywood",3, new ArrayList<PricingStrategy>(Arrays.asList(new WeekdaysPriceForRegularCustomer(130), new WeekendsPriceForRegularCustomer(90), new WeekdaysPriceForRewardCustomer(90), new WeekendsPriceForRewardCustomer(80))));

        hotels.add(lakewood);
        hotels.add(Ridgewood);
        hotels.add(Bridgewood);
        hotels.add(Dummywood);
    }

    public static void main(String[] args) {
        ArrayList<DaysOfWeek> daysOfWeeks = new ArrayList<>();
        daysOfWeeks.add(DaysOfWeek.WEDNESDAY);
        daysOfWeeks.add(DaysOfWeek.THURSDAY);
        daysOfWeeks.add(DaysOfWeek.SATURDAY);

        Input input = new Input("REGULAR", daysOfWeeks);
        Application app = new Application();
        System.out.println(app.getCheapestHotel(input, app.hotels).toString());

    }
    
    private ArrayList<Output> calculateTotalPriceForEachHotel(Input input, ArrayList<Hotel> hotels){
        ArrayList<Output> hotelListWithTotalPrice = new ArrayList<>();
        for (Hotel hotel : hotels) {
            int totalAmount = 0;
            if (Objects.equals(input.customerType, Customer.REGULAR)){
                totalAmount = Customer.getTotalAmountForRegularCustomer(input, hotel);
            }
            else{
                totalAmount = Customer.getTotalAmountForRewardCustomer(input, hotel);
            }

            hotelListWithTotalPrice.add(new Output(hotel.name, hotel.rating, totalAmount));
        }
        return hotelListWithTotalPrice;
    }

    public Output getCheapestHotel(Input input, ArrayList<Hotel> hotels) {
        Output cheapestHotel = null;
        ArrayList<Output> hotelList = calculateTotalPriceForEachHotel(input, hotels);
        for (Output hotel : hotelList) {
            if(cheapestHotel == null)
                cheapestHotel = hotel;
            else{
                if(cheapestHotel.totalAmount > hotel.totalAmount)
                    cheapestHotel = hotel;
                else if((cheapestHotel.totalAmount == hotel.totalAmount) && (cheapestHotel.rating < hotel.rating)){
                    cheapestHotel = hotel;
                }
            }
        }
        return cheapestHotel;
    }
}
