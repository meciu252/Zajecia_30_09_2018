package Zadanie2;

public class kartezja {

    public double polex;
    public double poley;

    public kartezja (double polex)    {
      this.polex = polex;
    }

    public double calculateArea()   {
        return Math.PI * Math.pow(polex, 2);
    }



}
