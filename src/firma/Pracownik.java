package firma;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private String adres;
    private String email;
    private double pensja;

    public Pracownik(String imie, String nazwosko)  {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }



    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public void setPensja(double pensja) {
        this.pensja = pensja;
    }
}
