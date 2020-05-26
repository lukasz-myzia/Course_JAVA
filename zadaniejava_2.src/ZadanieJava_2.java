package zadaniejava_2;

import java.io.IOException;

public class ZadanieJava_2 {

    public static void main(String[] args)
    throws IOException {
        
        Osoba persona1 = new Osoba("Łukasz", "Myzia");
        Osoba persona2 = new Osoba("Jan", "Iksiński");
        
        System.out.println(persona1.getImie());
        System.out.println(persona1.getNazwisko());
        System.out.println(persona2.getImie());
        System.out.println(persona2.getNazwisko());
        
        System.out.println("\nPrzechodzę do drugiej klasy i wywołuje z niej mestody, ale w tym samym pakiecie");
        System.out.println("==================================================\n");
        
        String[][] tab = Tablica.tab();
        Tablica.twojeDane(tab);
        Tablica.twojeDaneVerte(tab);
       
    }
    
}

class Osoba
{
    private String firstName;
    private String lastName;
        
        Osoba(String imie, String nazwisko)
        {
            this.firstName = imie;
            this.lastName = nazwisko;
        }
        
        String getImie() { return firstName; }
        String getNazwisko() { return lastName; }
        
        void setImie(String imie) { this.firstName = imie; }
        void setNazwisko(String nazwisko) { this.lastName = nazwisko; }
        
}
