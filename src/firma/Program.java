package firma;

import java.util.Scanner;

public class Program {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[]    args)   {
        System.out.println("Program do zarzadzania firma");
        System.out.println("Podaj nazwe firmy: ");
        String nazwaFirmy = scanner.nextLine();
        Firma firma = new Firma(nazwaFirmy);
        System.out.println("Wybierz operacje");
        System.out.println("1 Wypisz wszystkich pracownikow");
        System.out.println("2 Dodaj nowego pracownika");
        System.out.println("3 Usun pracownika");
        System.out.println("0. Wyjscie z programu");
        int wybor = scanner.nextInt();
        while (wybor != 0)  {
            switch (wybor)  {
                case 1: {
                    Pracownik[] pracownicy = firma.getPracownicy();
                    if (firma.getLiczbaPracownikow() == 0)  {
                        System.out.println("Brak pracownikow - wybierz opcje 2, aby dodac nowego");
                        break;
                    }
                    for (Pracownik p : pracownicy)  {
                        String opisPracownika = String.format(
                                "Imie: %s, Nazwisko: %s, e-mail: %s, pensja : %f",
                                p.getImie(),
                                p.getEmail(),
                                p.getEmail(),
                                p.getPensja()
                        );
                        System.out.println(opisPracownika);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Podaj imie");
                    String imie = scanner.nextLine();
                    System.out.println("Podaj nazwisko");
                    String nazwisko = scanner.nextLine();
                    System.out.println("podaj email");
                    String email = scanner.nextLine();
                    System.out.println("Podaj pensje");
                    double pensja = scanner.nextDouble();

                    Pracownik nowyPracownik = new Pracownik(imie, nazwisko);
                    nowyPracownik.setEmail(email);
                    nowyPracownik.setPensja(pensja);

                }
            }
        }
    }
}
