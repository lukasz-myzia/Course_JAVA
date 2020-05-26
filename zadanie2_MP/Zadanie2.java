
package zadanie2;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {
        Tablica tablica1 = new Tablica(10);
        tablica1.wprowadz();
        System.out.println("\nWprowadzono tablicę:");
        tablica1.drukuj();
        System.out.println("\nTablica od końca:");
        tablica1.odwrotnie();
    }
    
}
// Klasa Tablica nie była konieczna jej kod mógł być w main
class Tablica {
    Osoba[] osoby;
    Tablica(int ile) {
        this.osoby = new Osoba[ile];
        for (int i = 0; i < this.osoby.length; i++){
            osoby[i] = new Osoba();
        }
        System.out.println("Założono tablic o " + ile + " elementach.");
    }
    void wprowadz(){
        Scanner wczytaj = new Scanner(System.in);
        for (int i = 1; i <= this.osoby.length; i++){
            System.out.println("Podaj " + i + " imię?");
            this.osoby[i-1].setImie(wczytaj.nextLine());
            System.out.println("Podaj " + i + " nazwisko?");
            this.osoby[i-1].setNazwisko(wczytaj.nextLine().toString());
            System.out.println("Wpis " + i + ": " + osoby[i-1].getImie() + " " + osoby[i-1].getNazwisko() );
        }
    }    
    void drukuj(){
        for (int i = 0; i < this.osoby.length; i++){
            System.out.println("Pozycja " + i + ": " + osoby[i].getImie() + " " + osoby[i].getNazwisko() );
        }
    }    
    void odwrotnie(){
        for (int i = this.osoby.length -1; i >= 0 ; i--){
            System.out.println("Pozycja " + i + ": " + osoby[i].getImie() + " " + osoby[i].getNazwisko() );
        }
    } 
 }
