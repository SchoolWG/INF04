/**
 * **************************************
 * klasa: Notatka
 * opis: klasa umożliwia tworzenie obiektów przechowujących informacje o tytule i treści notatek
 * pola: licznik - integer
 *      id - integer
 *      tytul - string
 *      tresc - string
 * autor: 12345678985
 * **************************************
 */

public class Notatka {
    static private int licznik=0;
    private  int id;
    protected String tytul;
    protected String tresc;

    public Notatka(String tytul, String tresc) {
        licznik++;
        this.id = licznik;
        this.tytul = tytul;
        this.tresc = tresc;
    }
    public void diag() {
        System.out.println(id+"; "+tytul+"; "+tresc);
    }
    public void notatka(){
        System.out.println("Tytuł: "+tytul+"\nTreść: "+tresc);
    }
}
