package zadaniejava_1;

import java.io.IOException;

public class ZadanieJava_1 {

    public static void main(String[] args)
    throws IOException {
        
        Tablica.podaj();
        
    }  
}

class Osoba
{
    private String firstName;
    private String lastName;
        
//        Osoba(String imie, String nazwisko)
//        {
//            this.firstName = imie;
//            this.lastName = nazwisko;
//        }
        
        String getImie() { return firstName; }
        String getNazwisko() { return lastName; }
        
        void setImie(String imie) { this.firstName = imie; }
        void setNazwisko(String nazwisko) { this.lastName = nazwisko; }
        
}
