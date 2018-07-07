package tw;

/**
 * Created by arshisa on 7/7/18.
 */
public class WeekendsPriceForRewardCustomer implements PricingStrategy {
    int price;

    public WeekendsPriceForRewardCustomer() {
    }

    public WeekendsPriceForRewardCustomer(int price) {
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
