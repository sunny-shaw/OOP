package tw;

/**
 * Created by arshisa on 7/7/18.
 */
public class WeekendsPriceForRegularCustomer implements PricingStrategy {
    int price;

    public WeekendsPriceForRegularCustomer(int price) {
        this.price = price;
    }

    public WeekendsPriceForRegularCustomer() {
    }

    public int getPrice(){
        return price;
    }
}
