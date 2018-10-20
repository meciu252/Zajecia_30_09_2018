package oopintro;

public class Program {
    public static void main(String[]    args)   {
        Pracownik junior = new Pracownik();
        junior.imie = "Piotr";
        junior.nazwisko = "Kowalski";
        junior.email = "kowalski@sda.com";

        Pracownik senior = new Pracownik();


        System.out.println(junior.imie);
        System.out.println(junior.przedstawSie());
    }
}
