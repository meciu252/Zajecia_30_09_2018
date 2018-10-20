package oopintro;

public class Pracownik {
    public String imie;
    public String nazwisko;
    public String email;
    public double pensja;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public Pracownik(String imie, String nazwisko, String email)    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public Pracownik() {
        System.out.println("Tworze nowy obiekt oopintro.Pracownik");
    }
//Kontruktor przeciazony, - czyli z argumentami
    public String przedstawSie()    {
        return "Nazywam sie: " + imie + " " + nazwisko;
    }

}
