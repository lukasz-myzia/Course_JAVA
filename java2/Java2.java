package java2;
import java.io.*;

public class Java2 {

    public static void main(String[] args)
        throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Osoba [] user = new Osoba[10];
        
        for (int i = 0; i < user.length; i++) {
            
            user[i]=new Osoba();
            System.out.print("Podaj imię " + (i+1) + " osoby: ");
            user[i].setImie(br.readLine());
            System.out.print("Podaj nazwisko " + (i+1) + " osoby: ");
            user[i].setNazwisko(br.readLine());
        }
        
        System.out.println("");
        System.out.println("Podałeś: ");
        for (int i = 0; i < user.length; i++) {
            System.out.println(user[i].getImie()+" "+user[i].getNazwisko());
        }
        
        System.out.println("Odwracam: ");
        for (int i = user.length-1; i >=0; i--) {
            System.out.println(user[i].getImie()+" "+user[i].getNazwisko());
        }
    }
}
