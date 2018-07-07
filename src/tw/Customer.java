package tw;

import java.util.Objects;

/**
 * Created by arshisa on 7/5/18.
 */
public class Customer {
     static final String REGULAR ="REGULAR";
     static final String REWARD ="REWARD";

     static int getTotalAmountForRegularCustomer(Input input, Hotel hotel) {
          int totalAmount = 0;
          if (Objects.equals(input.customerType, Customer.REGULAR)) {
               for (DaysOfWeek day : input.daysOfWeeks) {
                    if (!DaysOfWeek.isWeekend(day)) {
                         for (PricingStrategy strategy : hotel.price) {
                              if (strategy instanceof WeekdaysPriceForRegularCustomer)
                                   totalAmount += strategy.getPrice();
                         }
                    }
                    if (DaysOfWeek.isWeekend(day)) {
                         for (PricingStrategy strategy : hotel.price) {
                              if (strategy instanceof WeekendsPriceForRegularCustomer)
                                   totalAmount += strategy.getPrice();
                         }
                    }
               }
          }
          return totalAmount;
     }
     static int getTotalAmountForRewardCustomer(Input input, Hotel hotel) {
          int totalAmount = 0;
          if(Objects.equals(input.customerType, Customer.REWARD)){
               for (DaysOfWeek day : input.daysOfWeeks) {
                    if(!DaysOfWeek.isWeekend(day)){
                         for(PricingStrategy strategy : hotel.price){
                              if(strategy instanceof WeekdaysPriceForRewardCustomer)
                                   totalAmount += strategy.getPrice();
                         }
                    }
                    if(DaysOfWeek.isWeekend(day)){
                         for(PricingStrategy strategy : hotel.price){
                              if(strategy instanceof WeekendsPriceForRewardCustomer)
                                   totalAmount += strategy.getPrice();
                         }
                    }

               }
          }
          return totalAmount;
     }
}
