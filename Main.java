import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    static public void main(String args[]){
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(23, 2);
        Fraction f3 = new Fraction(8, 3);

        Comparator<Fraction> comp = new FractionComparator(1);

        System.out.println(f1.decApprox());

        ArrayList<Fraction> l = new ArrayList<>();
        l.add(f1);
        l.add(f2);
        l.add(f3);

        Collections.sort(l, comp);

        for (Fraction f : l) {
            System.out.println(f.decApprox());
        }
    }
}
