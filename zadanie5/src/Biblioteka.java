import java.util.ArrayList;

public class Biblioteka {
    public ArrayList<Ksiazka> lista = new ArrayList<>();

    public void dodajKsiazke(Ksiazka k) {
        lista.add(k);
    }

    public void wyswietlWszystkie() {
        for (Ksiazka k : lista) {
            System.out.println(k.tytul + " - " + k.autor);
        }
    }
}
