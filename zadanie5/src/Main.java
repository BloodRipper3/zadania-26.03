public class Main {
    public static void main(String[] args) {
        Biblioteka b = new Biblioteka();

        Ksiazka k1 = new Ksiazka();
        k1.tytul = "pan tadeusz";
        k1.autor = "Adam Mickiewicz";

        Ksiazka k2 = new Ksiazka();
        k2.tytul = "Harry Potter";
        k2.autor = "J.K.Rowling";

        Ksiazka k3 = new Ksiazka();
        k3.tytul = "Lalka";
        k3.autor = "B.Prus";

        b.dodajKsiazke(k1);
        b.dodajKsiazke(k2);
        b.dodajKsiazke(k3);

        b.wyswietlWszystkie();
    }
}
