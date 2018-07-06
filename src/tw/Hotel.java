package tw;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by arshisa on 7/5/18.
 */
public class Hotel {
     private String name;
     private double rating;
     private Price price;
     public Hotel(){

     }
    Hotel(String name, double rating, Price price){

        this.name = name;
        this.rating = rating;
        this.price = price;
    }
    
    private ArrayList<Output> getHotelsWithTotalAmount(Input input, ArrayList<Hotel> hotels){
        ArrayList<Output> hotelListWithTotalAmount = new ArrayList<>();
        for (Hotel hotel: hotels) {
        	int totalAmount = getTotalAmount(input, hotel);
            hotelListWithTotalAmount.add(new Output(hotel.name, hotel.rating, totalAmount));
        }
        return hotelListWithTotalAmount;
    }
    public Output getCheapestHotel(Input input, ArrayList<Hotel> hotels) {
        Output cheapestHotel = null;
        ArrayList<Output> hotelList = getHotelsWithTotalAmount(input, hotels);
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

    private int getTotalAmount(Input input, Hotel hotel) {
    	int totalAmount = 0;
        if(Objects.equals(input.subscriptionType, Subscription.REGULAR)){
            for (Date date : input.dateList) {
                if(DayOfWeek.weekdays.contains(date.day))
                    totalAmount += hotel.price.weekdaysPriceForRegularCustomer;
                if(DayOfWeek.weekends.contains(date.day))
                    totalAmount += hotel.price.weekendsPriceForRegularCustomer;
            }
        }
        if(Objects.equals(input.subscriptionType, Subscription.REWARD)){
            for (Date date : input.dateList) {
                if(DayOfWeek.weekdays.contains(date.day))
                    totalAmount += hotel.price.weekdaysPriceForRewardCustomer;
                if(DayOfWeek.weekends.contains(date.day))
                    totalAmount += hotel.price.weekendsPriceForRewardCustomer;

            }
        }
        return totalAmount;
    }
}
