package webinar;

public class Webinar
{

    public static void main(String[] args)
    {
        
        UczestnikWeb persona1 = new UczestnikWeb();
        persona1.ustawStatus("\"Witajcie na webinarium z programowania obiektowego\"");
        //System.out.println(persona1.Imie);
        System.out.println(persona1.Nick);
        System.out.println(persona1.Funkcja);
        
        UczestnikWeb persona2 = new UczestnikWeb("Łukasz", "Kruk", "Słuchacz");
        persona2.ustawStatus("\"Dzień Dobry\"");
        //System.out.println(persona2.Imie);
        System.out.println(persona2.Nick);
        System.out.println(persona2.Funkcja);
        
        UczestnikWeb persona3 = new UczestnikWeb("Zenek", "Szalony", 55);
        persona3.ustawStatus("\"Witojcie\"");
        //System.out.println(persona3.Imie);
        System.out.println(persona3.Nick);
        System.out.println("Mam lat: " + persona3.Wiek);
        
        System.out.println();
        
        if (persona3.Wiek==55)
            System.out.println(persona3.Imie + " nie jest młody\n");
        
        
        for (int i = 0; i<2; i++)
        {
            switch (persona3.Wiek)
            {
                case (55):
                    System.out.println("Zmieniam wiek " + persona3.Imie + "\n");
                    persona3.Wiek=99;
                break;

                default:
                    System.out.println("\tStary mędzrzec z Zenka");
                    System.out.println("\tError wieku. Koniec programu");
            }
        }
        
    }
 
}

class UczestnikWeb
{
    String Imie = "Marcin";
    String Nick = "Szef";
    String Funkcja = "Dydaktyk";
    int Wiek;
    
    UczestnikWeb()
    {
        System.out.println("\n\tWywołanie konstruktora z domyślnymi parametrami");
    }
    
    UczestnikWeb(String imie, String nick, String funkcja)
    {
        System.out.println("\n\tWywołanie konstruktora z przekazanymi parametrami");
        this.Imie = imie;
        this.Nick = nick;
        this.Funkcja = funkcja;
    }
    
    UczestnikWeb(String imie, String nick, int wiek)
    {
        System.out.println("\n\tPrzeciążenie konstruktora");
        this.Imie = imie;
        this.Nick = nick;
        this.Wiek = wiek;
        
    }
    
    void ustawStatus(String komentarz)
    {
        System.out.println(this.Imie + ": " + komentarz);
    }



}
