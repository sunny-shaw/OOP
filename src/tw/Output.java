package tw;
import java.util.Objects;

/**
 * Created by arshisa on 7/6/18.
 */
public class Output {
    private String name;
    int totalAmount;
    double rating;

    public Output() {
    }

    public Output(String name, double rating, int totalAmount) {
        this.name = name;
        this.totalAmount = totalAmount;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object obj) {
        Output output = (Output)obj;
        return (Objects.equals(output.name, name)) && (output.totalAmount == totalAmount) && (output.rating == rating);
    }

    @Override
    public String toString() {
        return name + " " + totalAmount;
    }
}
