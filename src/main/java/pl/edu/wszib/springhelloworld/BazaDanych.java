package pl.edu.wszib.springhelloworld;

public interface BazaDanych {

    void zapis(String klucz, String wartosc);
    String pobierz (String klucz);
    void usun(String klucz);
}
