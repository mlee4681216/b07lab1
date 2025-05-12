import java.lang.Math;

public class Polynomial{
    double [] coefficients;
    Polynomial(){
        coefficients = new double[1];
        coefficients[0] = 0.0;
    }
    Polynomial(double [] array){
        coefficients = array;
    }
    public Polynomial add(Polynomial p){
        int length1 = (this.coefficients).length;
        int length2 = (p.coefficients).length;
        int max;
        if (length1 < length2){
            max = length2;
        }
        else {
            max = length1;
        }
        double [] add_poly = new double[max];
        double add1;
        double add2;
        for (int i=0; i<max; i++){
            if (i < length1){
                add1 = this.coefficients[i];
            }
            else {
                add1 = 0;
            }
            if (i < length2){
                add2 = p.coefficients[i];
            }
            else {
                add2 = 0;
            }
            add_poly[i] = add1 + add2;
        }
        Polynomial added = new Polynomial(add_poly);
        return added;
    }
    public double evaluate(double x){
        double value = 0.0;
        for (int i=0; i<(this.coefficients).length; i++){
            value = value + (this.coefficients[i])*(Math.pow(x, i));
        }
        return value;
    }
    public boolean hasRoot(double x){
        if (evaluate(x) == 0){
            return true;
        }
        return false;
    }
}