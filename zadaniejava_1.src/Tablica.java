package zadaniejava_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tablica {
    
    public static void podaj()
    throws IOException {
        
    BufferedReader odczyt = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Podaj ilu chcesz wpisać użytkowników: ");
    int ileWierszy=Integer.parseInt(odczyt.readLine());
      
    String[][] tablica = new String[ileWierszy][2];
    Osoba [] person =new Osoba[ileWierszy];
      
      
              for (int i = 0; i < tablica.length; i++) {
            System.out.println("\tPodaj dane "+(i+1)+" osoby");
            
            for (int j = 0; j < 2; j++) {
                if (j==0) {
                    System.out.print("Podaj imię: ");
                    tablica[i][j]=odczyt.readLine();
                }
                else {
                    System.out.print("Podaj nazwisko: ");
                    tablica[i][j]=odczyt.readLine();
                }
            }
                //person[i]=new Osoba(tablica[i][0], tablica[i][1]);
                person[i]=new Osoba();
                person[i].setImie(tablica[i][0]);
                person[i].setNazwisko(tablica[i][1]);
                
        }
      
    
       System.out.println("\n\tPodałeś w takiej kolejności: ");
    int x=0;
    while  (x<tablica.length){
        System.out.print((x+1)+": ");
        System.out.print(person[x].getImie()+" ");
        System.out.println(person[x].getNazwisko());
        x++;
    }

      System.out.println("\n\tOwracam kolejność: ");
      
       int z = 1;
        for (int i = tablica.length-1; i >= 0; i--) {
            System.out.print((z)+": ");
            System.out.print(person[i].getImie()+" ");
            System.out.println(person[i].getNazwisko());
            z++;
        }
    }
}
