package webinar2;
import java.io.*;  // 1 z 3 obsługa wprowadzania txt

public class Webinar2
{
    public static void main(String[] args)
    throws IOException  // 2 z 3 obsługa wprowadzania txt
    {
        BufferedReader odczyt = new BufferedReader(new InputStreamReader(System.in));  // 3 z 3 obsługa wprowadzania txt
        
        String tablica[] = new String[3];
        
        UczestnikWeb persona1 = new UczestnikWeb();
        persona1.ustawStatus("\"Witajcie na webinarium z programowania obiektowego\"");
        tablica[0]=persona1.Imie;
        System.out.println(persona1.Nick);
        System.out.println(persona1.Funkcja);
        
        UczestnikWeb persona2 = new UczestnikWeb("Łukasz", "Kruk", "Słuchacz");
        persona2.ustawStatus("\"Dzień Dobry\"");
        tablica[1]=persona2.Imie;
        System.out.println(persona2.Nick);
        System.out.println(persona2.Funkcja);
        
        UczestnikWeb persona3 = new UczestnikWeb("Zenek", "Szalony", 55);
        persona3.ustawStatus("\"Witojcie\"");
        tablica[2]=persona3.Imie;
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
                    System.out.print("Podaj nowy wiek " + persona3.Imie + ": ");
                    persona3.Wiek=Integer.parseInt(odczyt.readLine());
                    System.out.println();
                break;
               
                default:
                    persona3.nowyWiek(persona3.Wiek);
                    System.out.println("\n\tKoniec programu");
            }
        }  
        
        System.out.println("Tworzę nową klasę i metodę STSTYCZNĄ która obsłuży wyliczanie");
        Wylicz.wylicz(tablica);
    
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

    void nowyWiek(int wiek)
    {
        if (wiek==0)
            System.out.println("Ten Pan się jeszcze nie narodził");
        else if (wiek>60)
        {
            System.out.println("\tSzacun " + wiek + " lat to jest coś");
            System.out.println("\tStary mędzrzec z "+this.Imie);
        }
        else
            System.out.println("\tWiek OK");       
    }
}

class Wylicz
{
    static void wylicz(String[] tab)
    {
        System.out.println("Wyliczam wszystkich uczestników webinarium pętlą \"for each\"");
        
        int i =1;
        for (String x: tab)
        {
            System.out.print("Uczestnik " + i + ": ");
            System.out.println(x);
            i++;
        }
    }
            
}
