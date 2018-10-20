package firma;

public class Firma {
   private static final int MAKSYMALNA_LICZBA_PRACOWNIKOW = 100;
    private String nazwaFirmy;
    private Pracownik[] pracownicy;
    private int liczbaPracownikow;

    public Firma(String nazwaFirmy) {
        this.liczbaPracownikow = 0;
        this.nazwaFirmy = nazwaFirmy;
        pracownicy = new Pracownik[MAKSYMALNA_LICZBA_PRACOWNIKOW];
    }

    public String getNazwaFirmy()   {
        return this.nazwaFirmy;
    }

//    getter dla pola liczbaPracownikow -> bez settera
    public int getLiczbaPracownikow()   {
        return liczbaPracownikow;
    }

    public Pracownik[] getPracownicy() {
        return pracownicy;
    }

    public boolean dodajPracownika(Pracownik nowyPracownik)    {
        if (liczbaPracownikow < MAKSYMALNA_LICZBA_PRACOWNIKOW) {
            pracownicy[liczbaPracownikow++] = nowyPracownik;
            return true;
        }
        return false;
    }


}
