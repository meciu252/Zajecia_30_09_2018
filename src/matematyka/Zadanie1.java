package matematyka;

public class Zadanie1 {

    public double bokA;
    public double bokB;

    public Zadanie1(double a, double b) {

        this.bokA = a;
        this.bokB = b;
    }

    public double obliczPole()  {
        return this.bokA * bokB;
    }

    public double obliczObwod() {
        return 2 * bokA + 2 * bokB;
    }

}
