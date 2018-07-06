package tw;
import java.util.ArrayList;

/**
 * Created by arshisa on 7/6/18.
 */
public class Input {
    String subscriptionType;
    ArrayList<Date> dateList;

    public Input(String subscriptionType, ArrayList<Date> dateList) {
        this.subscriptionType = subscriptionType;
        this.dateList = dateList;
    }
}
