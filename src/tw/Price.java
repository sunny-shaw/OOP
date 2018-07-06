package tw;
/**
 * Created by arshisa on 7/5/18.
 */
public class Price {
    int weekdaysPriceForRegularCustomer;
    int weekendsPriceForRegularCustomer;
    int weekdaysPriceForRewardCustomer;
    int weekendsPriceForRewardCustomer;


    Price(int weekdaysPriceForRegularCustomer, int weekendsPriceForRegularCustomer, int weekdaysPriceForRewardCustomer, int weekendsPriceForRewardCustomer) {
        this.weekdaysPriceForRegularCustomer = weekdaysPriceForRegularCustomer;
        this.weekendsPriceForRegularCustomer = weekendsPriceForRegularCustomer;
        this.weekdaysPriceForRewardCustomer = weekdaysPriceForRewardCustomer;
        this.weekendsPriceForRewardCustomer = weekendsPriceForRewardCustomer;
    }
}
