package czynnyzal;

public class CzynnyZal {

    public static void main(String[] args)
    {
        Uczen Aga = new Uczen();
        System.out.println(Aga.Imie + " " + Aga.Nazwisko);
        System.out.println("");
      
        Aga.termin("Sunday, 3 May 2020, 00:00 AM");
        System.out.println("");
        
        Wykladowca.mgr();
        
        Aga.czynnyZal();
        
        Aga.koronaVirus("Bezrobotna");
        System.out.println(Aga.Status);
    }
}

class Uczen
{
 String Imie = "Agnieszka";
 String Nazwisko = "Olewnik";
 String Status;
 
 Uczen()
 {
     System.out.print("Wywołuje się do odpowiedzi: ");
 }
 
 void termin (String komentarz)
 {
     System.out.println("Termin oddania Zadania 1: " + komentarz);
 }
 
 void czynnyZal()
 {
     System.out.println("Nic mnie nie usprawiedliwia.");
     System.out.println("Zostałam ofiarą korona virusa i jestem na wypowiedzeniu stąd moje roztargnięcie.");
 }
 
 void koronaVirus(String status)
 {
     System.out.print("Niedługo zostanę: ");
     this.Status=status;
 }
}

class Wykladowca
{
  static void mgr()
 {
     System.out.println("Czemu Pani oddaje zadanie po terminie?");
     System.out.println("");
 }
}