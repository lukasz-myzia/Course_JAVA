package zadaniejava_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tablica{
    
    static String[][] tab()
    throws IOException {
        
    BufferedReader odczyt = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Podaj ilu chcesz wpisać użytkowników: ");
    int ileWierszy=Integer.parseInt(odczyt.readLine());
    
    String[][] tablica = new String[ileWierszy][2];
    
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
    }
     return tablica;
    }
    
  
    
    static void twojeDane(String tab[][]) {
        
        System.out.println("\n\tPodałeś w takiej kolejności: ");
        int x=0;
        while  (x<tab.length) {
            System.out.print((x+1)+": ");
            System.out.print(tab[x][0]+" ");
            System.out.println(tab[x][1]);
            x++;
        }
    }

    static void twojeDaneVerte(String tab[][]) {
    System.out.println("\n\tOwracam kolejność: ");
      
       int z = 1;
        for (int i = tab.length-1; i >= 0; i--) {
            System.out.print((z)+": ");
            System.out.print(tab[i][0]+" ");
            System.out.println(tab[i][1]);
            z++;
        }
    }
}
    

