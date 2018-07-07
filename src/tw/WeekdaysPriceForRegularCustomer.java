package tw;

/**
 * Created by arshisa on 7/7/18.
 */
public class WeekdaysPriceForRegularCustomer implements PricingStrategy {
    int price;


    public WeekdaysPriceForRegularCustomer() {
    }

    public WeekdaysPriceForRegularCustomer(int price) {
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
