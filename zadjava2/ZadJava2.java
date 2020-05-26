package zadjava2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZadJava2 {

    public static void main(String[] args)
            throws IOException {

        int ilePerson=10;
        Osoba [] tabPerson =new Osoba[ilePerson];
        
        ObslugaProgramu.wpisywanie(tabPerson);
        ObslugaProgramu.dane(tabPerson);
        ObslugaProgramu.daneReverse(tabPerson);
    }
}    
    
class ObslugaProgramu{
    
    static void wpisywanie(Osoba[] tab)
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0; i < tab.length; i++) {
            tab[i]=new Osoba();
            System.out.println("\tPodaj dane " + (i+1) +" osoby");
            System.out.print("Podaj imię: ");
            tab[i].setFirstName(br.readLine());
            System.out.print("Podaj nazwisko: ");
            tab[i].setLastName(br.readLine());
        }
    }
    
    static void dane(Osoba[] tab){
      System.out.println("\n\tPodano w takiej kolejności: ");
      
        for (int i = 0; i < tab.length; i++) {
            System.out.print((i+1)+": ");
            System.out.print(tab[i].getFirstName()+" ");
            System.out.println(tab[i].getLastName());
        }
    }
    
    static void daneReverse(Osoba[] tab){
       System.out.println("\n\tOwracam kolejność: ");
       
        int z = 1;
        for (int i = tab.length-1; i >= 0; i--) {
            System.out.print((z)+": ");
            System.out.print(tab[i].getFirstName()+" ");
            System.out.println(tab[i].getLastName());
            z++;
        } 
    }
}
