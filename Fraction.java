public class Fraction implements Comparable<Fraction>{

    Fraction(){
        denominator = 1;
        numerator = 0;
    }

    Fraction(int n, int d){
        denominator = d;
        numerator = n;
    }

    double decApprox(){
        return ((double)numerator) / ((double)denominator);
    }

    public int compareTo(Fraction other){
        if(decApprox() > other.decApprox()){
            return 1;
        }
        else if(decApprox() < other.decApprox()){
            return -1;
        }
        return 0;
    }

    private int denominator;
    private int numerator;
}