package tw;

/**
 * Created by arshisa on 7/7/18.
 */
public class WeekdaysPriceForRewardCustomer implements PricingStrategy {
    int price;

    public WeekdaysPriceForRewardCustomer() {
    }

    public WeekdaysPriceForRewardCustomer(int price) {
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
