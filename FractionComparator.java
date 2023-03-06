import java.util.Comparator;

public class FractionComparator implements Comparator<Fraction> {
    
    public FractionComparator(int direction_){
        direction = direction_;
    }

    public int compare(Fraction f1, Fraction f2){
        return direction * f1.compareTo(f2);
    }

    private int direction;
}
