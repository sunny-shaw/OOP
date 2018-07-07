package tw;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by arshisa on 7/5/18.
 */
public class Hotel {
     String name;
     double rating;
     ArrayList<PricingStrategy> price;

    Hotel(String name, double rating, ArrayList<PricingStrategy> price){
        this.name = name;
        this.rating = rating;
        this.price = price;
    }
}
