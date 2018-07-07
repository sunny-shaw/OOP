package tw;
import java.util.ArrayList;

/**
 * Created by arshisa on 7/6/18.
 */
public class Input {
    String customerType;
    ArrayList<DaysOfWeek> daysOfWeeks;

    public Input(String customerType, ArrayList<DaysOfWeek> daysOfWeeks) {
        this.customerType = customerType;
        this.daysOfWeeks = daysOfWeeks;
    }
}
