package zadanie2;

public class Osoba {
    private String imie;
    private String nazwisko;
    
    Osoba(){
    }
//    Osoba(String imie, String nazwisko){
//        this.imie = imie;
//        this.nazwisko = nazwisko;
//    }
    public String getImie(){
        return this.imie;
    }
    public String getNazwisko(){
        return this.nazwisko;
    }
    public void setImie(String imie){
        this.imie = imie;
        //System.out.println("Imię " + imie + " zostało zapisane.");
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
        //System.out.println("Nazwisko " + nazwisko + " zostało zapisane.");
    }
}
