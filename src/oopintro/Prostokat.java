package oopintro;

import matematyka.Zadanie1;

import java.util.Scanner;

public class Prostokat {
    public static void main(String[]    args)   {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok");
        double a = odczyt.nextDouble();
        System.out.println("Podaj drugi bok");
        double b = odczyt.nextDouble();

        Zadanie1 pr = new Zadanie1(a, b);
        System.out.println("Boki figury:" + a + b);
        System.out.println("Obwod prostokata to: " + pr.obliczObwod());
        System.out.println("Pole prostokata to: " + pr.obliczPole());

    }
}
